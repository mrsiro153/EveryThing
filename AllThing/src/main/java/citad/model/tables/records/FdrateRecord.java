/*
 * This file is generated by jOOQ.
*/
package citad.model.tables.records;


import citad.model.tables.Fdrate;

import java.math.BigDecimal;

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
public class FdrateRecord extends TableRecordImpl<FdrateRecord> implements Record4<String, BigDecimal, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -2122433118;

    /**
     * Setter for <code>transaction.fdRate.fdType</code>.
     */
    public void setFdtype(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>transaction.fdRate.fdType</code>.
     */
    public String getFdtype() {
        return (String) get(0);
    }

    /**
     * Setter for <code>transaction.fdRate.intRate</code>.
     */
    public void setIntrate(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>transaction.fdRate.intRate</code>.
     */
    public BigDecimal getIntrate() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>transaction.fdRate.fromAmount</code>.
     */
    public void setFromamount(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>transaction.fdRate.fromAmount</code>.
     */
    public BigDecimal getFromamount() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>transaction.fdRate.toAmount</code>.
     */
    public void setToamount(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>transaction.fdRate.toAmount</code>.
     */
    public BigDecimal getToamount() {
        return (BigDecimal) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Fdrate.FDRATE.FDTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return Fdrate.FDRATE.INTRATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return Fdrate.FDRATE.FROMAMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return Fdrate.FDRATE.TOAMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFdtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getIntrate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getFromamount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getToamount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdrateRecord value1(String value) {
        setFdtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdrateRecord value2(BigDecimal value) {
        setIntrate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdrateRecord value3(BigDecimal value) {
        setFromamount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdrateRecord value4(BigDecimal value) {
        setToamount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdrateRecord values(String value1, BigDecimal value2, BigDecimal value3, BigDecimal value4) {
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
     * Create a detached FdrateRecord
     */
    public FdrateRecord() {
        super(Fdrate.FDRATE);
    }

    /**
     * Create a detached, initialised FdrateRecord
     */
    public FdrateRecord(String fdtype, BigDecimal intrate, BigDecimal fromamount, BigDecimal toamount) {
        super(Fdrate.FDRATE);

        set(0, fdtype);
        set(1, intrate);
        set(2, fromamount);
        set(3, toamount);
    }
}
