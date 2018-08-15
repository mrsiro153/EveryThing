/*
 * This file is generated by jOOQ.
*/
package jooqDemo.model.tables.records;


import jooqDemo.model.tables.Ddtype;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;


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
public class DdtypeRecord extends UpdatableRecordImpl<DdtypeRecord> implements Record12<String, String, Integer, BigDecimal, Integer, BigDecimal, BigDecimal, String, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -528583736;

    /**
     * Setter for <code>account.ddType.accountType</code>.
     */
    public void setAccounttype(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>account.ddType.accountType</code>.
     */
    public String getAccounttype() {
        return (String) get(0);
    }

    /**
     * Setter for <code>account.ddType.accountName</code>.
     */
    public void setAccountname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>account.ddType.accountName</code>.
     */
    public String getAccountname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>account.ddType.accountInterestType</code>.
     */
    public void setAccountinteresttype(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>account.ddType.accountInterestType</code>.
     */
    public Integer getAccountinteresttype() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>account.ddType.accountInterest</code>.
     */
    public void setAccountinterest(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>account.ddType.accountInterest</code>.
     */
    public BigDecimal getAccountinterest() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>account.ddType.accountFeeType</code>.
     */
    public void setAccountfeetype(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>account.ddType.accountFeeType</code>.
     */
    public Integer getAccountfeetype() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>account.ddType.accountFee</code>.
     */
    public void setAccountfee(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>account.ddType.accountFee</code>.
     */
    public BigDecimal getAccountfee() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>account.ddType.minBalance</code>.
     */
    public void setMinbalance(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>account.ddType.minBalance</code>.
     */
    public BigDecimal getMinbalance() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>account.ddType.currency</code>.
     */
    public void setCurrency(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>account.ddType.currency</code>.
     */
    public String getCurrency() {
        return (String) get(7);
    }

    /**
     * Setter for <code>account.ddType.administrators</code>.
     */
    public void setAdministrators(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>account.ddType.administrators</code>.
     */
    public String getAdministrators() {
        return (String) get(8);
    }

    /**
     * Setter for <code>account.ddType.status</code>.
     */
    public void setStatus(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>account.ddType.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>account.ddType.createdAt</code>.
     */
    public void setCreatedat(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>account.ddType.createdAt</code>.
     */
    public Timestamp getCreatedat() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>account.ddType.modifiedAt</code>.
     */
    public void setModifiedat(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>account.ddType.modifiedAt</code>.
     */
    public Timestamp getModifiedat() {
        return (Timestamp) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, Integer, BigDecimal, Integer, BigDecimal, BigDecimal, String, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, Integer, BigDecimal, Integer, BigDecimal, BigDecimal, String, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Ddtype.DDTYPE.ACCOUNTTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Ddtype.DDTYPE.ACCOUNTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Ddtype.DDTYPE.ACCOUNTINTERESTTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return Ddtype.DDTYPE.ACCOUNTINTEREST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Ddtype.DDTYPE.ACCOUNTFEETYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Ddtype.DDTYPE.ACCOUNTFEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return Ddtype.DDTYPE.MINBALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Ddtype.DDTYPE.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Ddtype.DDTYPE.ADMINISTRATORS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Ddtype.DDTYPE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Ddtype.DDTYPE.CREATEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Ddtype.DDTYPE.MODIFIEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAccounttype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAccountname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAccountinteresttype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getAccountinterest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getAccountfeetype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getAccountfee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getMinbalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getAdministrators();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getModifiedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdtypeRecord value1(String value) {
        setAccounttype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdtypeRecord value2(String value) {
        setAccountname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdtypeRecord value3(Integer value) {
        setAccountinteresttype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdtypeRecord value4(BigDecimal value) {
        setAccountinterest(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdtypeRecord value5(Integer value) {
        setAccountfeetype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdtypeRecord value6(BigDecimal value) {
        setAccountfee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdtypeRecord value7(BigDecimal value) {
        setMinbalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdtypeRecord value8(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdtypeRecord value9(String value) {
        setAdministrators(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdtypeRecord value10(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdtypeRecord value11(Timestamp value) {
        setCreatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdtypeRecord value12(Timestamp value) {
        setModifiedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdtypeRecord values(String value1, String value2, Integer value3, BigDecimal value4, Integer value5, BigDecimal value6, BigDecimal value7, String value8, String value9, Integer value10, Timestamp value11, Timestamp value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DdtypeRecord
     */
    public DdtypeRecord() {
        super(Ddtype.DDTYPE);
    }

    /**
     * Create a detached, initialised DdtypeRecord
     */
    public DdtypeRecord(String accounttype, String accountname, Integer accountinteresttype, BigDecimal accountinterest, Integer accountfeetype, BigDecimal accountfee, BigDecimal minbalance, String currency, String administrators, Integer status, Timestamp createdat, Timestamp modifiedat) {
        super(Ddtype.DDTYPE);

        set(0, accounttype);
        set(1, accountname);
        set(2, accountinteresttype);
        set(3, accountinterest);
        set(4, accountfeetype);
        set(5, accountfee);
        set(6, minbalance);
        set(7, currency);
        set(8, administrators);
        set(9, status);
        set(10, createdat);
        set(11, modifiedat);
    }
}
