package napas.model;

import citad.BankResponse;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 24/01/2019
 * Time: 10:54 AM
 */
@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class BankGetNAPASBankInfoResp extends BankResponse {
    @XmlElementWrapper(name = "lst_bank")
    @XmlElement(name = "bank")
    @SerializedName("listBank")
    private List<NAPASBank> lst_bank;

    public BankGetNAPASBankInfoResp() {
    }

    public List<NAPASBank> getLst_bank() {
        return lst_bank;
    }

    public BankGetNAPASBankInfoResp setLst_bank(List<NAPASBank> lst_bank) {
        this.lst_bank = lst_bank;
        return this;
    }
}
