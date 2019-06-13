/*
 * This file is generated by jOOQ.
*/
package citad.model.tables;


import citad.model.Keys;
import citad.model.Transaction;
import citad.model.tables.records.PaymentscheduleRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Paymentschedule extends TableImpl<PaymentscheduleRecord> {

    private static final long serialVersionUID = 2026564644;

    /**
     * The reference instance of <code>transaction.paymentSchedule</code>
     */
    public static final Paymentschedule PAYMENTSCHEDULE = new Paymentschedule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentscheduleRecord> getRecordType() {
        return PaymentscheduleRecord.class;
    }

    /**
     * The column <code>transaction.paymentSchedule.id</code>.
     */
    public final TableField<PaymentscheduleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>transaction.paymentSchedule.cif</code>.
     */
    public final TableField<PaymentscheduleRecord, String> CIF = createField("cif", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.paymentSchedule.refKey</code>.
     */
    public final TableField<PaymentscheduleRecord, String> REFKEY = createField("refKey", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.paymentSchedule.displayScheduleId</code>.
     */
    public final TableField<PaymentscheduleRecord, String> DISPLAYSCHEDULEID = createField("displayScheduleId", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.paymentSchedule.debitAccount</code>.
     */
    public final TableField<PaymentscheduleRecord, String> DEBITACCOUNT = createField("debitAccount", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.paymentSchedule.creditAccount</code>.
     */
    public final TableField<PaymentscheduleRecord, String> CREDITACCOUNT = createField("creditAccount", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.paymentSchedule.cardNumber</code>.
     */
    public final TableField<PaymentscheduleRecord, String> CARDNUMBER = createField("cardNumber", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.paymentSchedule.creditName</code>.
     */
    public final TableField<PaymentscheduleRecord, String> CREDITNAME = createField("creditName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.paymentSchedule.transactionAmount</code>.
     */
    public final TableField<PaymentscheduleRecord, String> TRANSACTIONAMOUNT = createField("transactionAmount", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.paymentSchedule.transactionCurrency</code>.
     */
    public final TableField<PaymentscheduleRecord, String> TRANSACTIONCURRENCY = createField("transactionCurrency", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>transaction.paymentSchedule.transactionDetail</code>.
     */
    public final TableField<PaymentscheduleRecord, String> TRANSACTIONDETAIL = createField("transactionDetail", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

    /**
     * The column <code>transaction.paymentSchedule.chargeAccount</code>.
     */
    public final TableField<PaymentscheduleRecord, String> CHARGEACCOUNT = createField("chargeAccount", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.paymentSchedule.cityCode</code>.
     */
    public final TableField<PaymentscheduleRecord, String> CITYCODE = createField("cityCode", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>transaction.paymentSchedule.bankCode</code>.
     */
    public final TableField<PaymentscheduleRecord, String> BANKCODE = createField("bankCode", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>transaction.paymentSchedule.branchCode</code>.
     */
    public final TableField<PaymentscheduleRecord, String> BRANCHCODE = createField("branchCode", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>transaction.paymentSchedule.typeDescription</code>.
     */
    public final TableField<PaymentscheduleRecord, Integer> TYPEDESCRIPTION = createField("typeDescription", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>transaction.paymentSchedule.feeId</code>.
     */
    public final TableField<PaymentscheduleRecord, Integer> FEEID = createField("feeId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>transaction.paymentSchedule.beginDate</code>.
     */
    public final TableField<PaymentscheduleRecord, Long> BEGINDATE = createField("beginDate", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>transaction.paymentSchedule.nextDate</code>.
     */
    public final TableField<PaymentscheduleRecord, Long> NEXTDATE = createField("nextDate", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>transaction.paymentSchedule.autoRepeat</code>.
     */
    public final TableField<PaymentscheduleRecord, Integer> AUTOREPEAT = createField("autoRepeat", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>transaction.paymentSchedule.status</code>.
     */
    public final TableField<PaymentscheduleRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>transaction.paymentSchedule.createdDate</code>.
     */
    public final TableField<PaymentscheduleRecord, Long> CREATEDDATE = createField("createdDate", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>transaction.paymentSchedule.createdAt</code>.
     */
    public final TableField<PaymentscheduleRecord, Long> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>transaction.paymentSchedule.modifiedAt</code>.
     */
    public final TableField<PaymentscheduleRecord, Long> MODIFIEDAT = createField("modifiedAt", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>transaction.paymentSchedule</code> table reference
     */
    public Paymentschedule() {
        this("paymentSchedule", null);
    }

    /**
     * Create an aliased <code>transaction.paymentSchedule</code> table reference
     */
    public Paymentschedule(String alias) {
        this(alias, PAYMENTSCHEDULE);
    }

    private Paymentschedule(String alias, Table<PaymentscheduleRecord> aliased) {
        this(alias, aliased, null);
    }

    private Paymentschedule(String alias, Table<PaymentscheduleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Transaction.TRANSACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PaymentscheduleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PAYMENTSCHEDULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PaymentscheduleRecord> getPrimaryKey() {
        return Keys.KEY_PAYMENTSCHEDULE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PaymentscheduleRecord>> getKeys() {
        return Arrays.<UniqueKey<PaymentscheduleRecord>>asList(Keys.KEY_PAYMENTSCHEDULE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paymentschedule as(String alias) {
        return new Paymentschedule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Paymentschedule rename(String name) {
        return new Paymentschedule(name, null);
    }
}