package citad;

import javax.xml.bind.annotation.XmlElement;

public class BankResponse {
    @XmlElement(name = "BankTime")
    private String BankTime;

    @XmlElement(name = "RespCode")
    private String RespCode;

    @XmlElement(name = "RespMsg")
    private String RespMsg;

    @XmlElement(name = "BankSignature")
    private String BankSignature;

    public String getRespMsg() {
        return RespMsg;
    }

    public BankResponse setRespMsg(String respMsg) {
        RespMsg = respMsg;
        return this;
    }

    public String getBankSignature() {
        return BankSignature;
    }

    public BankResponse setBankSignature(String bankSignature) {
        BankSignature = bankSignature;
        return this;
    }

    public String getRespCode() {
        return RespCode;
    }

    public BankResponse setRespCode(String respCode) {
        RespCode = respCode;
        return this;
    }

    public String getBankTime() {
        return BankTime;
    }

    public BankResponse setBankTime(String bankTime) {
        BankTime = bankTime;
        return this;
    }
}
