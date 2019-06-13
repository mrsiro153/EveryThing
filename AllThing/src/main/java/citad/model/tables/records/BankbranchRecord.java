/*
 * This file is generated by jOOQ.
*/
package citad.model.tables.records;


import citad.model.tables.Bankbranch;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class BankbranchRecord extends UpdatableRecordImpl<BankbranchRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = -516842308;

    /**
     * Setter for <code>transaction.bankBranch.branchID</code>.
     */
    public void setBranchid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>transaction.bankBranch.branchID</code>.
     */
    public String getBranchid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>transaction.bankBranch.branchName</code>.
     */
    public void setBranchname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>transaction.bankBranch.branchName</code>.
     */
    public String getBranchname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>transaction.bankBranch.cityCode</code>.
     */
    public void setCitycode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>transaction.bankBranch.cityCode</code>.
     */
    public String getCitycode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>transaction.bankBranch.bankCode</code>.
     */
    public void setBankcode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>transaction.bankBranch.bankCode</code>.
     */
    public String getBankcode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>transaction.bankBranch.branchCode</code>.
     */
    public void setBranchcode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>transaction.bankBranch.branchCode</code>.
     */
    public String getBranchcode() {
        return (String) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Bankbranch.BANKBRANCH.BRANCHID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Bankbranch.BANKBRANCH.BRANCHNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Bankbranch.BANKBRANCH.CITYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Bankbranch.BANKBRANCH.BANKCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Bankbranch.BANKBRANCH.BRANCHCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getBranchid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getBranchname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCitycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBankcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBranchcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankbranchRecord value1(String value) {
        setBranchid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankbranchRecord value2(String value) {
        setBranchname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankbranchRecord value3(String value) {
        setCitycode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankbranchRecord value4(String value) {
        setBankcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankbranchRecord value5(String value) {
        setBranchcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankbranchRecord values(String value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BankbranchRecord
     */
    public BankbranchRecord() {
        super(Bankbranch.BANKBRANCH);
    }

    /**
     * Create a detached, initialised BankbranchRecord
     */
    public BankbranchRecord(String branchid, String branchname, String citycode, String bankcode, String branchcode) {
        super(Bankbranch.BANKBRANCH);

        set(0, branchid);
        set(1, branchname);
        set(2, citycode);
        set(3, bankcode);
        set(4, branchcode);
    }
}