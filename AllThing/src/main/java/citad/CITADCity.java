package citad;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Tinh")
public class CITADCity {
    @XmlElementWrapper(name = "LstBranches")
    @XmlElement(name = "Branch")
    @SerializedName("listBranches")
    private List<CITADBranch> LstBranches;
    @XmlElement(name = "MaTinh")
    @SerializedName("cityId")
    private String MaTinh;
    @XmlElement(name = "TenTinh")
    @SerializedName("cityName")
    private String TenTinh;

    public CITADCity() {
    }

    public List<CITADBranch> getLstBranches() {
        return LstBranches;
    }

    public CITADCity setLstBranches(List<CITADBranch> lstBranches) {
        LstBranches = lstBranches;
        return this;
    }

    public String getMaTinh() {
        return MaTinh;
    }

    public CITADCity setMaTinh(String maTinh) {
        MaTinh = maTinh;
        return this;
    }

    public String getTenTinh() {
        return TenTinh;
    }

    public CITADCity setTenTinh(String tenTinh) {
        TenTinh = tenTinh;
        return this;
    }
}
