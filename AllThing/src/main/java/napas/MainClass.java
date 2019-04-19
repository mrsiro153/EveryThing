package napas;

import citad.CITADBranch;
import citad.XmlConverter;
import citad.model.Tables;
import napas.model.BankGetNAPASBankInfoResp;
import napas.model.NAPASBank;
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
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 24/01/2019
 * Time: 10:36 AM
 */
public class MainClass {
    private static final String NAPAS_FILE = "/home/doan/Documents/napasList.xml";
    //
    private final String userName = "root";
    private final String url = "jdbc:mysql://192.168.18.55:9517/transaction?characterEncoding=UTF-8";
    private final String password = "AbCd@1234";

    public static void main(String[] args) {
        try {
            String contents = new String(Files.readAllBytes(Paths.get(NAPAS_FILE)));
            MainClass m = new MainClass();
            contents = m.contentSoapMessages(contents).replaceAll("&", "&amp;");
            BankGetNAPASBankInfoResp napasInfo = m.convertNAPAS(contents);
            String bankCitadId = napasInfo.getLst_bank().get(0).getBank_citad_id();
            int count = 0;
            for (NAPASBank bank : napasInfo.getLst_bank()) {
                if (bank.getType_transfer().equalsIgnoreCase("THE")) {
                    continue;
                }
                if (!bank.getBank_citad_id().equals(bankCitadId)) {
                    bankCitadId = bank.getBank_citad_id();
                    System.out.println("-----------------------------------------------");
                }
                System.out.println("bankCitadId: " + bank.getBank_citad_id());
                System.out.println("bankID: " + bank.getBank_id());
                System.out.println("bankName: " + bank.getBank_name());
                System.out.println("typeTransfer: " + bank.getType_transfer());
                //m.insertToDB(bank);
            }
            System.out.println("COUNT : " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    private BankGetNAPASBankInfoResp convertNAPAS(String input) {
        BankGetNAPASBankInfoResp bankGetNapasInfoResp = new BankGetNAPASBankInfoResp();
        return bankGetNapasInfoResp = (BankGetNAPASBankInfoResp) XmlConverter.fromXml(input, bankGetNapasInfoResp);
    }

    //
    private void insertToDB(NAPASBank bank) {
        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            DSLContext context = DSL.using(connection, SQLDialect.MYSQL);
            context.insertInto(Tables.BANKCITAD)
                    .set(Tables.BANKCITAD.BANKID, bank.getBank_citad_id())
                    .set(Tables.BANKCITAD.BANKNAME, formatname(bank.getBank_name()))
                    .set(Tables.BANKCITAD.NAPAS, bank.getBank_id())
                    .execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //
    private String formatname(String bankFullName) {
        StringBuilder rs = new StringBuilder();
        Integer length = bankFullName.length();
        for (int i = 0; i < length; i++) {
            if (bankFullName.charAt(i) == '-') {
                return rs.toString().trim();
            }
            rs.append(bankFullName.charAt(i));
        }
        return rs.toString();
    }
}
