package citad;


import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Branch")
@XmlAccessorType(XmlAccessType.FIELD)
public class CITADBranch {
    @XmlElement(name = "Ma_NH_TT")
    @SerializedName("directBankID")
    private String Ma_NH_TT;
    @XmlElement(name = "Ten_NH_TT")
    @SerializedName("directBankName")
    private String Ten_NH_TT;
    @XmlElement(name = "Ten_NH_GT_ANSI")
    @SerializedName("directBankNameANSI")
    private String Ten_NH_GT_ANSI;
    @XmlElement(name = "Ma_NH_GT")
    @SerializedName("indirectBankId")
    private String Ma_NH_GT;
    @XmlElement(name = "Ten_NH_GT")
    @SerializedName("indirectBankName")
    private String Ten_NH_GT;
    @XmlElement(name = "Ten_NH_TT_ANSI")
    @SerializedName("indirectBankNameANSI")
    private String Ten_NH_TT_ANSI;
    @XmlElement(name = "RouteCode")
    @SerializedName("routeCode")
    private String RouteCode;
    @XmlElement(name = "Offset_Acc")
    @SerializedName("offsetAcc")
    private String Offset_Acc;

    @XmlElement(name = "IS_HO_BRN")
    private String isHoiSo;
    @XmlElement(name = "FORMAL_NAME")
    private String formalName;

    public CITADBranch() {
    }

    public String getMa_NH_TT() {
        return Ma_NH_TT;
    }

    public CITADBranch setMa_NH_TT(String ma_NH_TT) {
        Ma_NH_TT = ma_NH_TT;
        return this;
    }

    public String getTen_NH_TT() {
        return Ten_NH_TT;
    }

    public CITADBranch setTen_NH_TT(String ten_NH_TT) {
        Ten_NH_TT = ten_NH_TT;
        return this;
    }

    public String getTen_NH_GT_ANSI() {
        return Ten_NH_GT_ANSI;
    }

    public CITADBranch setTen_NH_GT_ANSI(String ten_NH_GT_ANSI) {
        Ten_NH_GT_ANSI = ten_NH_GT_ANSI;
        return this;
    }

    public String getMa_NH_GT() {
        return Ma_NH_GT;
    }

    public CITADBranch setMa_NH_GT(String ma_NH_GT) {
        Ma_NH_GT = ma_NH_GT;
        return this;
    }

    public String getTen_NH_GT() {
        return Ten_NH_GT;
    }

    public CITADBranch setTen_NH_GT(String ten_NH_GT) {
        Ten_NH_GT = ten_NH_GT;
        return this;
    }

    public String getTen_NH_TT_ANSI() {
        return Ten_NH_TT_ANSI;
    }

    public CITADBranch setTen_NH_TT_ANSI(String ten_NH_TT_ANSI) {
        Ten_NH_TT_ANSI = ten_NH_TT_ANSI;
        return this;
    }

    public String getRouteCode() {
        return RouteCode;
    }

    public CITADBranch setRouteCode(String routeCode) {
        RouteCode = routeCode;
        return this;
    }

    public String getOffset_Acc() {
        return Offset_Acc;
    }

    public CITADBranch setOffset_Acc(String offset_Acc) {
        Offset_Acc = offset_Acc;
        return this;
    }

    public String getIsHoiSo() {
        return isHoiSo;
    }

    public CITADBranch setIsHoiSo(String isHoiSo) {
        this.isHoiSo = isHoiSo;
        return this;
    }

    public String getFormalName() {
        return formalName;
    }

    public CITADBranch setFormalName(String formalName) {
        this.formalName = formalName;
        return this;
    }
}
