/*
 * This file is generated by jOOQ.
*/
package jooqDemo.model.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooqDemo.model.tables.Paymentreport;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class PaymentreportRecord extends UpdatableRecordImpl<PaymentreportRecord> implements Record8<Integer, String, String, String, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1291591221;

    /**
     * Setter for <code>account.paymentReport.paymentReportId</code>.
     */
    public void setPaymentreportid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>account.paymentReport.paymentReportId</code>.
     */
    public Integer getPaymentreportid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>account.paymentReport.requestId</code>.
     */
    public void setRequestid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>account.paymentReport.requestId</code>.
     */
    public String getRequestid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>account.paymentReport.reporterCif</code>.
     */
    public void setReportercif(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>account.paymentReport.reporterCif</code>.
     */
    public String getReportercif() {
        return (String) get(2);
    }

    /**
     * Setter for <code>account.paymentReport.accusedCif</code>.
     */
    public void setAccusedcif(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>account.paymentReport.accusedCif</code>.
     */
    public String getAccusedcif() {
        return (String) get(3);
    }

    /**
     * Setter for <code>account.paymentReport.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>account.paymentReport.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>account.paymentReport.status</code>.
     */
    public void setStatus(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>account.paymentReport.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>account.paymentReport.createdAt</code>.
     */
    public void setCreatedat(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>account.paymentReport.createdAt</code>.
     */
    public Timestamp getCreatedat() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>account.paymentReport.modifiedAt</code>.
     */
    public void setModifiedat(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>account.paymentReport.modifiedAt</code>.
     */
    public Timestamp getModifiedat() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Paymentreport.PAYMENTREPORT.PAYMENTREPORTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Paymentreport.PAYMENTREPORT.REQUESTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Paymentreport.PAYMENTREPORT.REPORTERCIF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Paymentreport.PAYMENTREPORT.ACCUSEDCIF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Paymentreport.PAYMENTREPORT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Paymentreport.PAYMENTREPORT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Paymentreport.PAYMENTREPORT.CREATEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Paymentreport.PAYMENTREPORT.MODIFIEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPaymentreportid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRequestid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getReportercif();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAccusedcif();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getModifiedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentreportRecord value1(Integer value) {
        setPaymentreportid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentreportRecord value2(String value) {
        setRequestid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentreportRecord value3(String value) {
        setReportercif(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentreportRecord value4(String value) {
        setAccusedcif(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentreportRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentreportRecord value6(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentreportRecord value7(Timestamp value) {
        setCreatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentreportRecord value8(Timestamp value) {
        setModifiedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentreportRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentreportRecord
     */
    public PaymentreportRecord() {
        super(Paymentreport.PAYMENTREPORT);
    }

    /**
     * Create a detached, initialised PaymentreportRecord
     */
    public PaymentreportRecord(Integer paymentreportid, String requestid, String reportercif, String accusedcif, String description, Integer status, Timestamp createdat, Timestamp modifiedat) {
        super(Paymentreport.PAYMENTREPORT);

        set(0, paymentreportid);
        set(1, requestid);
        set(2, reportercif);
        set(3, accusedcif);
        set(4, description);
        set(5, status);
        set(6, createdat);
        set(7, modifiedat);
    }
}
