/*
 * This file is generated by jOOQ.
*/
package citad.model.tables.records;


import citad.model.tables.BankNhanCitab;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BankNhanCitabRecord extends TableRecordImpl<BankNhanCitabRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1337190452;

    /**
     * Setter for <code>transaction.bank_nhan_citab.tinh</code>.
     */
    public void setTinh(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>transaction.bank_nhan_citab.tinh</code>.
     */
    public String getTinh() {
        return (String) get(0);
    }

    /**
     * Setter for <code>transaction.bank_nhan_citab.nganhang</code>.
     */
    public void setNganhang(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>transaction.bank_nhan_citab.nganhang</code>.
     */
    public String getNganhang() {
        return (String) get(1);
    }

    /**
     * Setter for <code>transaction.bank_nhan_citab.chinhanh</code>.
     */
    public void setChinhanh(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>transaction.bank_nhan_citab.chinhanh</code>.
     */
    public String getChinhanh() {
        return (String) get(2);
    }

    /**
     * Setter for <code>transaction.bank_nhan_citab.directbank</code>.
     */
    public void setDirectbank(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>transaction.bank_nhan_citab.directbank</code>.
     */
    public String getDirectbank() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return BankNhanCitab.BANK_NHAN_CITAB.TINH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BankNhanCitab.BANK_NHAN_CITAB.NGANHANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BankNhanCitab.BANK_NHAN_CITAB.CHINHANH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BankNhanCitab.BANK_NHAN_CITAB.DIRECTBANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTinh();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNganhang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getChinhanh();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDirectbank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankNhanCitabRecord value1(String value) {
        setTinh(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankNhanCitabRecord value2(String value) {
        setNganhang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankNhanCitabRecord value3(String value) {
        setChinhanh(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankNhanCitabRecord value4(String value) {
        setDirectbank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankNhanCitabRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BankNhanCitabRecord
     */
    public BankNhanCitabRecord() {
        super(BankNhanCitab.BANK_NHAN_CITAB);
    }

    /**
     * Create a detached, initialised BankNhanCitabRecord
     */
    public BankNhanCitabRecord(String tinh, String nganhang, String chinhanh, String directbank) {
        super(BankNhanCitab.BANK_NHAN_CITAB);

        set(0, tinh);
        set(1, nganhang);
        set(2, chinhanh);
        set(3, directbank);
    }
}