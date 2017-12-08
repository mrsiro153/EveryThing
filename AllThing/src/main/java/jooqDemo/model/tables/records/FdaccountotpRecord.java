/*
 * This file is generated by jOOQ.
*/
package jooqDemo.model.tables.records;


import javax.annotation.Generated;

import jooqDemo.model.tables.Fdaccountotp;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class FdaccountotpRecord extends UpdatableRecordImpl<FdaccountotpRecord> implements Record3<String, String, Integer> {

    private static final long serialVersionUID = 57079281;

    /**
     * Setter for <code>account.fdAccountOTP.refkey</code>.
     */
    public void setRefkey(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>account.fdAccountOTP.refkey</code>.
     */
    public String getRefkey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>account.fdAccountOTP.fdAccount</code>.
     */
    public void setFdaccount(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>account.fdAccountOTP.fdAccount</code>.
     */
    public String getFdaccount() {
        return (String) get(1);
    }

    /**
     * Setter for <code>account.fdAccountOTP.verifyOTP</code>.
     */
    public void setVerifyotp(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>account.fdAccountOTP.verifyOTP</code>.
     */
    public Integer getVerifyotp() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Fdaccountotp.FDACCOUNTOTP.REFKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Fdaccountotp.FDACCOUNTOTP.FDACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Fdaccountotp.FDACCOUNTOTP.VERIFYOTP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRefkey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFdaccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getVerifyotp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdaccountotpRecord value1(String value) {
        setRefkey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdaccountotpRecord value2(String value) {
        setFdaccount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdaccountotpRecord value3(Integer value) {
        setVerifyotp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdaccountotpRecord values(String value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FdaccountotpRecord
     */
    public FdaccountotpRecord() {
        super(Fdaccountotp.FDACCOUNTOTP);
    }

    /**
     * Create a detached, initialised FdaccountotpRecord
     */
    public FdaccountotpRecord(String refkey, String fdaccount, Integer verifyotp) {
        super(Fdaccountotp.FDACCOUNTOTP);

        set(0, refkey);
        set(1, fdaccount);
        set(2, verifyotp);
    }
}
