/*
 * This file is generated by jOOQ.
*/
package jooqDemo.model.tables;


import jooqDemo.model.Account;
import jooqDemo.model.Keys;
import jooqDemo.model.tables.records.PaymentRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


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
public class Payment extends TableImpl<PaymentRecord> {

    private static final long serialVersionUID = -1439995138;

    /**
     * The reference instance of <code>account.payment</code>
     */
    public static final Payment PAYMENT = new Payment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentRecord> getRecordType() {
        return PaymentRecord.class;
    }

    /**
     * The column <code>account.payment.paymentId</code>.
     */
    public final TableField<PaymentRecord, String> PAYMENTID = createField("paymentId", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>account.payment.payeeId</code>.
     */
    public final TableField<PaymentRecord, String> PAYEEID = createField("payeeId", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>account.payment.cardNumber</code>.
     */
    public final TableField<PaymentRecord, String> CARDNUMBER = createField("cardNumber", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>account.payment.accountNumber</code>.
     */
    public final TableField<PaymentRecord, String> ACCOUNTNUMBER = createField("accountNumber", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>account.payment.accountName</code>.
     */
    public final TableField<PaymentRecord, String> ACCOUNTNAME = createField("accountName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>account.payment.cardName</code>.
     */
    public final TableField<PaymentRecord, String> CARDNAME = createField("cardName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>account.payment.bankCode</code>.
     */
    public final TableField<PaymentRecord, String> BANKCODE = createField("bankCode", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>account.payment.bankName</code>.
     */
    public final TableField<PaymentRecord, String> BANKNAME = createField("bankName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>account.payment.cityCode</code>.
     */
    public final TableField<PaymentRecord, String> CITYCODE = createField("cityCode", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>account.payment.cityName</code>.
     */
    public final TableField<PaymentRecord, String> CITYNAME = createField("cityName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>account.payment.branchCode</code>.
     */
    public final TableField<PaymentRecord, String> BRANCHCODE = createField("branchCode", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>account.payment.branchName</code>.
     */
    public final TableField<PaymentRecord, String> BRANCHNAME = createField("branchName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>account.payment.status</code>.
     */
    public final TableField<PaymentRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>account.payment.modifiedAt</code>.
     */
    public final TableField<PaymentRecord, Long> MODIFIEDAT = createField("modifiedAt", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>account.payment.createdAt</code>.
     */
    public final TableField<PaymentRecord, Long> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>account.payment</code> table reference
     */
    public Payment() {
        this("payment", null);
    }

    /**
     * Create an aliased <code>account.payment</code> table reference
     */
    public Payment(String alias) {
        this(alias, PAYMENT);
    }

    private Payment(String alias, Table<PaymentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Payment(String alias, Table<PaymentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Account.ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PaymentRecord> getPrimaryKey() {
        return Keys.KEY_PAYMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PaymentRecord>> getKeys() {
        return Arrays.<UniqueKey<PaymentRecord>>asList(Keys.KEY_PAYMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Payment as(String alias) {
        return new Payment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Payment rename(String name) {
        return new Payment(name, null);
    }
}
