/*
 * This file is generated by jOOQ.
*/
package jooqDemo.model.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooqDemo.model.tables.Ddremark;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class DdremarkRecord extends UpdatableRecordImpl<DdremarkRecord> implements Record10<String, String, BigDecimal, Integer, Integer, Timestamp, Timestamp, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1672318926;

    /**
     * Setter for <code>account.ddRemark.accountNumber</code>.
     */
    public void setAccountnumber(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>account.ddRemark.accountNumber</code>.
     */
    public String getAccountnumber() {
        return (String) get(0);
    }

    /**
     * Setter for <code>account.ddRemark.refKey</code>.
     */
    public void setRefkey(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>account.ddRemark.refKey</code>.
     */
    public String getRefkey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>account.ddRemark.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>account.ddRemark.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>account.ddRemark.status</code>.
     */
    public void setStatus(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>account.ddRemark.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>account.ddRemark.preStatus</code>.
     */
    public void setPrestatus(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>account.ddRemark.preStatus</code>.
     */
    public Integer getPrestatus() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>account.ddRemark.startAt</code>.
     */
    public void setStartat(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>account.ddRemark.startAt</code>.
     */
    public Timestamp getStartat() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>account.ddRemark.endAt</code>.
     */
    public void setEndat(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>account.ddRemark.endAt</code>.
     */
    public Timestamp getEndat() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>account.ddRemark.administrators</code>.
     */
    public void setAdministrators(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>account.ddRemark.administrators</code>.
     */
    public String getAdministrators() {
        return (String) get(7);
    }

    /**
     * Setter for <code>account.ddRemark.createdAt</code>.
     */
    public void setCreatedat(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>account.ddRemark.createdAt</code>.
     */
    public Timestamp getCreatedat() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>account.ddRemark.modifiedAt</code>.
     */
    public void setModifiedat(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>account.ddRemark.modifiedAt</code>.
     */
    public Timestamp getModifiedat() {
        return (Timestamp) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, BigDecimal, Integer, Integer, Timestamp, Timestamp, String, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, BigDecimal, Integer, Integer, Timestamp, Timestamp, String, Timestamp, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Ddremark.DDREMARK.ACCOUNTNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Ddremark.DDREMARK.REFKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return Ddremark.DDREMARK.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Ddremark.DDREMARK.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Ddremark.DDREMARK.PRESTATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Ddremark.DDREMARK.STARTAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Ddremark.DDREMARK.ENDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Ddremark.DDREMARK.ADMINISTRATORS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Ddremark.DDREMARK.CREATEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Ddremark.DDREMARK.MODIFIEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAccountnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRefkey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPrestatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getStartat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getEndat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getAdministrators();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getModifiedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdremarkRecord value1(String value) {
        setAccountnumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdremarkRecord value2(String value) {
        setRefkey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdremarkRecord value3(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdremarkRecord value4(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdremarkRecord value5(Integer value) {
        setPrestatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdremarkRecord value6(Timestamp value) {
        setStartat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdremarkRecord value7(Timestamp value) {
        setEndat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdremarkRecord value8(String value) {
        setAdministrators(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdremarkRecord value9(Timestamp value) {
        setCreatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdremarkRecord value10(Timestamp value) {
        setModifiedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdremarkRecord values(String value1, String value2, BigDecimal value3, Integer value4, Integer value5, Timestamp value6, Timestamp value7, String value8, Timestamp value9, Timestamp value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DdremarkRecord
     */
    public DdremarkRecord() {
        super(Ddremark.DDREMARK);
    }

    /**
     * Create a detached, initialised DdremarkRecord
     */
    public DdremarkRecord(String accountnumber, String refkey, BigDecimal amount, Integer status, Integer prestatus, Timestamp startat, Timestamp endat, String administrators, Timestamp createdat, Timestamp modifiedat) {
        super(Ddremark.DDREMARK);

        set(0, accountnumber);
        set(1, refkey);
        set(2, amount);
        set(3, status);
        set(4, prestatus);
        set(5, startat);
        set(6, endat);
        set(7, administrators);
        set(8, createdat);
        set(9, modifiedat);
    }
}