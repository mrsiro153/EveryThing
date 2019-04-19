package citad;

import citad.model.Tables;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 25/12/2018
 * Time: 2:50 PM
 */
public class MainClass {
    private final String userName = "root";
    private final String url = "jdbc:mysql://192.168.18.55:9517/transaction?characterEncoding=UTF-8";
    private final String password = "AbCd@1234";

    public static void main(String[] args) {
        try {
            int x = 0;
            String contents = new String(Files.readAllBytes(Paths.get("/home/doan/Documents/citabList.xml")));
            MainClass m = new MainClass();
            contents = m.contentSoapMessages(contents).replaceAll("&", "&amp;");
            BankGetCITADInfoResp resp = m.convertCitad(contents);
            for (CITADBank cb : resp.getListBank()) {
                System.out.println("bankID: " + cb.getBankID() + " and name: " + cb.getBankName());
                for (CITADCity city : cb.getLstTinh()) {
                    System.out.println("Tinh: " + city.getTenTinh());

                    for (CITADBranch branch : city.getLstBranches()) {
                        if (branch.getIsHoiSo().equals("H")) {
                            System.out.println("DIRECT: " + branch.getMa_NH_TT());
                            System.out.println("DIRECT bank name: " + branch.getTen_NH_TT());
                            System.out.println("DIRECT bankName ANSI: " + branch.getTen_NH_TT_ANSI());
                            System.out.println("INDIRECT: " + branch.getMa_NH_GT());
                            System.out.println("INDIRECT bank name: " + branch.getTen_NH_GT());
                            System.out.println("FORMAL NAME: "+branch.getFormalName());
                            System.out.println("INDIRECT bankName ANSI: " + branch.getTen_NH_GT_ANSI());
                            System.out.println("ROUTE CODE: " + branch.getRouteCode());
                            System.out.println("OFFSET ACC: " + branch.getOffset_Acc());
                            System.out.println("BRANCH TYPE: " + branch.getIsHoiSo());
                        }
                        //System.out.println("Chi nhanh: " + branch.getMa_NH_TT() + " chi nhanh phu: " + branch.getMa_NH_GT() + " la hoi so: " + branch.getIsHoiSo());
                    }
                }
                System.out.println("-----------------------------------------------------------------------------");
                x+=1;
            }
            System.out.println("END: "+x);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    private BankGetCITADInfoResp convertCitad(String input) {
        BankGetCITADInfoResp bankGetCITADInfoResp = new BankGetCITADInfoResp();
        return bankGetCITADInfoResp = (BankGetCITADInfoResp) XmlConverter.fromXml(input, bankGetCITADInfoResp);
    }

    private String contentSoapMessages(String soapMessages) {
        try {
            InputStream is = new ByteArrayInputStream(soapMessages.getBytes());
            SOAPMessage xml = MessageFactory.newInstance().createMessage(null, is);
            return xml.getSOAPBody().getTextContent();
        } catch (IOException | SOAPException e) {
            e.printStackTrace();
            throw new RuntimeException("Xml convert wrong cause by " + e.getMessage());
        } catch (Exception e) {
            //e.printStackTrace();
            throw new RuntimeException("Xml convert wrong cause by " + e.getMessage());
        }
    }

    private void insertToDB(CITADBranch br) {
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            DSLContext context = DSL.using(connection, SQLDialect.MYSQL);
            context.insertInto(Tables.BANKCITADBRANCH)
                    .set(Tables.BANKCITADBRANCH.DIRECTBANKID, br.getMa_NH_TT())
                    .set(Tables.BANKCITADBRANCH.DIRECTBANKNAME, br.getTen_NH_TT())
                    .set(Tables.BANKCITADBRANCH.DIRECTBANKNAMEANSI, br.getTen_NH_TT_ANSI())
                    .set(Tables.BANKCITADBRANCH.INDIRECTBANKID, br.getMa_NH_GT())
                    .set(Tables.BANKCITADBRANCH.INDIRECTBANKNAME, br.getTen_NH_GT())
                    .set(Tables.BANKCITADBRANCH.INDIRECTBANKNAMEANSI, br.getTen_NH_GT_ANSI())
                    .set(Tables.BANKCITADBRANCH.FORMALNAME,br.getFormalName())
                    .set(Tables.BANKCITADBRANCH.ROUTECODE, br.getRouteCode())
                    .set(Tables.BANKCITADBRANCH.OFFSETACC, br.getOffset_Acc())
                    .set(Tables.BANKCITADBRANCH.BRANCHTYPE, br.getIsHoiSo())
                    .execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
