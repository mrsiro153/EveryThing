package napas.model;

import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 24/01/2019
 * Time: 10:55 AM
 */
@XmlRootElement(name = "bank")
@XmlAccessorType(XmlAccessType.FIELD)
public class NAPASBank {
    @SerializedName("bankId")
    private String bank_id;
    @SerializedName("bankName")
    private String bank_name;
    @SerializedName("typeTransfer")
    private String type_transfer;
    private String bank_citad_id;

    public NAPASBank() {
    }

    public String getBank_id() {
        return bank_id;
    }

    public NAPASBank setBank_id(String bank_id) {
        this.bank_id = bank_id;
        return this;
    }

    public String getBank_name() {
        return bank_name;
    }

    public NAPASBank setBank_name(String bank_name) {
        this.bank_name = bank_name;
        return this;
    }

    public String getType_transfer() {
        return type_transfer;
    }

    public NAPASBank setType_transfer(String type_transfer) {
        this.type_transfer = type_transfer;
        return this;
    }

    public String getBank_citad_id() {
        return bank_citad_id;
    }

    public NAPASBank setBank_citad_id(String bank_citad_id) {
        this.bank_citad_id = bank_citad_id;
        return this;
    }
}