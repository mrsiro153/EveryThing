package citad;


import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "Bank")
@XmlAccessorType(XmlAccessType.FIELD)
public class CITADBank {
    @XmlElementWrapper(name = "LstTinh")
    @XmlElement(name = "Tinh")
    @SerializedName("listCity")
    private List<CITADCity> LstTinh;
    @XmlElement(name = "BankID")
    @SerializedName("bankId")
    private String BankID;
    @XmlElement(name = "BankName")
    @SerializedName("bankName")
    private String BankName;

    public CITADBank() {
    }

    public List<CITADCity> getLstTinh() {
        return LstTinh;
    }

    public CITADBank setLstTinh(List<CITADCity> lstTinh) {
        LstTinh = lstTinh;
        return this;
    }

    public String getBankID() {
        return BankID;
    }

    public CITADBank setBankID(String bankID) {
        BankID = bankID;
        return this;
    }

    public String getBankName() {
        return BankName;
    }

    public CITADBank setBankName(String bankName) {
        BankName = bankName;
        return this;
    }
}
