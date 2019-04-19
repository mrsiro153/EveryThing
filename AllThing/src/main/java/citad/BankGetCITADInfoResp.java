package citad;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class BankGetCITADInfoResp extends BankResponse {
    @XmlElementWrapper(name = "ListBank")
    @XmlElement(name = "Bank")
    @SerializedName("listBank")
    private List<CITADBank> ListBank;

    public BankGetCITADInfoResp() {
    }

    public List<CITADBank> getListBank() {
        return ListBank;
    }

    public void setListBank(List<CITADBank> listBank) {
        ListBank = listBank;
    }
}
