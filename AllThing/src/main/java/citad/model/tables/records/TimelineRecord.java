/*
 * This file is generated by jOOQ.
*/
package citad.model.tables.records;


import citad.model.tables.Timeline;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Record1;
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
public class TimelineRecord extends UpdatableRecordImpl<TimelineRecord> {

    private static final long serialVersionUID = -201192467;

    /**
     * Setter for <code>transaction.timeLine.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>transaction.timeLine.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>transaction.timeLine.transactionNumber</code>.
     */
    public void setTransactionnumber(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>transaction.timeLine.transactionNumber</code>.
     */
    public String getTransactionnumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>transaction.timeLine.rawTransactionType</code>.
     */
    public void setRawtransactiontype(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>transaction.timeLine.rawTransactionType</code>.
     */
    public String getRawtransactiontype() {
        return (String) get(2);
    }

    /**
     * Setter for <code>transaction.timeLine.refKey</code>.
     */
    public void setRefkey(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>transaction.timeLine.refKey</code>.
     */
    public String getRefkey() {
        return (String) get(3);
    }

    /**
     * Setter for <code>transaction.timeLine.transactionType</code>.
     */
    public void setTransactiontype(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>transaction.timeLine.transactionType</code>.
     */
    public String getTransactiontype() {
        return (String) get(4);
    }

    /**
     * Setter for <code>transaction.timeLine.createDate</code>.
     */
    public void setCreatedate(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>transaction.timeLine.createDate</code>.
     */
    public Long getCreatedate() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>transaction.timeLine.createTime</code>.
     */
    public void setCreatetime(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>transaction.timeLine.createTime</code>.
     */
    public Long getCreatetime() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>transaction.timeLine.status</code>.
     */
    public void setStatus(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>transaction.timeLine.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>transaction.timeLine.prstatus</code>.
     */
    public void setPrstatus(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>transaction.timeLine.prstatus</code>.
     */
    public Integer getPrstatus() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>transaction.timeLine.description</code>.
     */
    public void setDescription(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>transaction.timeLine.description</code>.
     */
    public String getDescription() {
        return (String) get(9);
    }

    /**
     * Setter for <code>transaction.timeLine.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>transaction.timeLine.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>transaction.timeLine.feeAmount</code>.
     */
    public void setFeeamount(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>transaction.timeLine.feeAmount</code>.
     */
    public BigDecimal getFeeamount() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>transaction.timeLine.topupNumber</code>.
     */
    public void setTopupnumber(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>transaction.timeLine.topupNumber</code>.
     */
    public String getTopupnumber() {
        return (String) get(12);
    }

    /**
     * Setter for <code>transaction.timeLine.billNumber</code>.
     */
    public void setBillnumber(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>transaction.timeLine.billNumber</code>.
     */
    public String getBillnumber() {
        return (String) get(13);
    }

    /**
     * Setter for <code>transaction.timeLine.currency</code>.
     */
    public void setCurrency(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>transaction.timeLine.currency</code>.
     */
    public String getCurrency() {
        return (String) get(14);
    }

    /**
     * Setter for <code>transaction.timeLine.sourceCIF</code>.
     */
    public void setSourcecif(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>transaction.timeLine.sourceCIF</code>.
     */
    public String getSourcecif() {
        return (String) get(15);
    }

    /**
     * Setter for <code>transaction.timeLine.sourceName</code>.
     */
    public void setSourcename(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>transaction.timeLine.sourceName</code>.
     */
    public String getSourcename() {
        return (String) get(16);
    }

    /**
     * Setter for <code>transaction.timeLine.refSourceAccountNumber</code>.
     */
    public void setRefsourceaccountnumber(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>transaction.timeLine.refSourceAccountNumber</code>.
     */
    public String getRefsourceaccountnumber() {
        return (String) get(17);
    }

    /**
     * Setter for <code>transaction.timeLine.sourceAccountNumber</code>.
     */
    public void setSourceaccountnumber(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>transaction.timeLine.sourceAccountNumber</code>.
     */
    public String getSourceaccountnumber() {
        return (String) get(18);
    }

    /**
     * Setter for <code>transaction.timeLine.sourceCardNumber</code>.
     */
    public void setSourcecardnumber(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>transaction.timeLine.sourceCardNumber</code>.
     */
    public String getSourcecardnumber() {
        return (String) get(19);
    }

    /**
     * Setter for <code>transaction.timeLine.destinationCIF</code>.
     */
    public void setDestinationcif(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>transaction.timeLine.destinationCIF</code>.
     */
    public String getDestinationcif() {
        return (String) get(20);
    }

    /**
     * Setter for <code>transaction.timeLine.destinationName</code>.
     */
    public void setDestinationname(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>transaction.timeLine.destinationName</code>.
     */
    public String getDestinationname() {
        return (String) get(21);
    }

    /**
     * Setter for <code>transaction.timeLine.destinationAccountNumber</code>.
     */
    public void setDestinationaccountnumber(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>transaction.timeLine.destinationAccountNumber</code>.
     */
    public String getDestinationaccountnumber() {
        return (String) get(22);
    }

    /**
     * Setter for <code>transaction.timeLine.refDestinationAccountNumber</code>.
     */
    public void setRefdestinationaccountnumber(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>transaction.timeLine.refDestinationAccountNumber</code>.
     */
    public String getRefdestinationaccountnumber() {
        return (String) get(23);
    }

    /**
     * Setter for <code>transaction.timeLine.destinationCardNumber</code>.
     */
    public void setDestinationcardnumber(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>transaction.timeLine.destinationCardNumber</code>.
     */
    public String getDestinationcardnumber() {
        return (String) get(24);
    }

    /**
     * Setter for <code>transaction.timeLine.destinationBranch</code>.
     */
    public void setDestinationbranch(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>transaction.timeLine.destinationBranch</code>.
     */
    public String getDestinationbranch() {
        return (String) get(25);
    }

    /**
     * Setter for <code>transaction.timeLine.destinationBank</code>.
     */
    public void setDestinationbank(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>transaction.timeLine.destinationBank</code>.
     */
    public String getDestinationbank() {
        return (String) get(26);
    }

    /**
     * Setter for <code>transaction.timeLine.destinationCity</code>.
     */
    public void setDestinationcity(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>transaction.timeLine.destinationCity</code>.
     */
    public String getDestinationcity() {
        return (String) get(27);
    }

    /**
     * Setter for <code>transaction.timeLine.refTransactionID</code>.
     */
    public void setReftransactionid(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>transaction.timeLine.refTransactionID</code>.
     */
    public String getReftransactionid() {
        return (String) get(28);
    }

    /**
     * Setter for <code>transaction.timeLine.preserve01</code>.
     */
    public void setPreserve01(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>transaction.timeLine.preserve01</code>.
     */
    public String getPreserve01() {
        return (String) get(29);
    }

    /**
     * Setter for <code>transaction.timeLine.preserve02</code>.
     */
    public void setPreserve02(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>transaction.timeLine.preserve02</code>.
     */
    public String getPreserve02() {
        return (String) get(30);
    }

    /**
     * Setter for <code>transaction.timeLine.preserve03</code>.
     */
    public void setPreserve03(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>transaction.timeLine.preserve03</code>.
     */
    public String getPreserve03() {
        return (String) get(31);
    }

    /**
     * Setter for <code>transaction.timeLine.transactionBillType</code>.
     */
    public void setTransactionbilltype(Integer value) {
        set(32, value);
    }

    /**
     * Getter for <code>transaction.timeLine.transactionBillType</code>.
     */
    public Integer getTransactionbilltype() {
        return (Integer) get(32);
    }

    /**
     * Setter for <code>transaction.timeLine.transferMoneyType</code>.
     */
    public void setTransfermoneytype(Integer value) {
        set(33, value);
    }

    /**
     * Getter for <code>transaction.timeLine.transferMoneyType</code>.
     */
    public Integer getTransfermoneytype() {
        return (Integer) get(33);
    }

    /**
     * Setter for <code>transaction.timeLine.destinationBankName</code>.
     */
    public void setDestinationbankname(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>transaction.timeLine.destinationBankName</code>.
     */
    public String getDestinationbankname() {
        return (String) get(34);
    }

    /**
     * Setter for <code>transaction.timeLine.ddTxnType</code>.
     */
    public void setDdtxntype(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>transaction.timeLine.ddTxnType</code>.
     */
    public String getDdtxntype() {
        return (String) get(35);
    }

    /**
     * Setter for <code>transaction.timeLine.typeDescription</code>.
     */
    public void setTypedescription(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>transaction.timeLine.typeDescription</code>.
     */
    public String getTypedescription() {
        return (String) get(36);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TimelineRecord
     */
    public TimelineRecord() {
        super(Timeline.TIMELINE);
    }

    /**
     * Create a detached, initialised TimelineRecord
     */
    public TimelineRecord(Integer id, String transactionnumber, String rawtransactiontype, String refkey, String transactiontype, Long createdate, Long createtime, Integer status, Integer prstatus, String description, BigDecimal amount, BigDecimal feeamount, String topupnumber, String billnumber, String currency, String sourcecif, String sourcename, String refsourceaccountnumber, String sourceaccountnumber, String sourcecardnumber, String destinationcif, String destinationname, String destinationaccountnumber, String refdestinationaccountnumber, String destinationcardnumber, String destinationbranch, String destinationbank, String destinationcity, String reftransactionid, String preserve01, String preserve02, String preserve03, Integer transactionbilltype, Integer transfermoneytype, String destinationbankname, String ddtxntype, String typedescription) {
        super(Timeline.TIMELINE);

        set(0, id);
        set(1, transactionnumber);
        set(2, rawtransactiontype);
        set(3, refkey);
        set(4, transactiontype);
        set(5, createdate);
        set(6, createtime);
        set(7, status);
        set(8, prstatus);
        set(9, description);
        set(10, amount);
        set(11, feeamount);
        set(12, topupnumber);
        set(13, billnumber);
        set(14, currency);
        set(15, sourcecif);
        set(16, sourcename);
        set(17, refsourceaccountnumber);
        set(18, sourceaccountnumber);
        set(19, sourcecardnumber);
        set(20, destinationcif);
        set(21, destinationname);
        set(22, destinationaccountnumber);
        set(23, refdestinationaccountnumber);
        set(24, destinationcardnumber);
        set(25, destinationbranch);
        set(26, destinationbank);
        set(27, destinationcity);
        set(28, reftransactionid);
        set(29, preserve01);
        set(30, preserve02);
        set(31, preserve03);
        set(32, transactionbilltype);
        set(33, transfermoneytype);
        set(34, destinationbankname);
        set(35, ddtxntype);
        set(36, typedescription);
    }
}
