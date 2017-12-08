/*
 * This file is generated by jOOQ.
*/
package jooqDemo.model.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooqDemo.model.Account;
import jooqDemo.model.Keys;
import jooqDemo.model.tables.records.PaymentrequestRecord;

import org.jooq.Field;
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
public class Paymentrequest extends TableImpl<PaymentrequestRecord> {

    private static final long serialVersionUID = -1951716596;

    /**
     * The reference instance of <code>account.paymentRequest</code>
     */
    public static final Paymentrequest PAYMENTREQUEST = new Paymentrequest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentrequestRecord> getRecordType() {
        return PaymentrequestRecord.class;
    }

    /**
     * The column <code>account.paymentRequest.refKey</code>.
     */
    public final TableField<PaymentrequestRecord, String> REFKEY = createField("refKey", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>account.paymentRequest.paymentId</code>.
     */
    public final TableField<PaymentrequestRecord, String> PAYMENTID = createField("paymentId", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>account.paymentRequest.amount</code>.
     */
    public final TableField<PaymentrequestRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 10).nullable(false), this, "");

    /**
     * The column <code>account.paymentRequest.description</code>.
     */
    public final TableField<PaymentrequestRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>account.paymentRequest.cif</code>.
     */
    public final TableField<PaymentrequestRecord, String> CIF = createField("cif", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>account.paymentRequest.verifyOTP</code>.
     */
    public final TableField<PaymentrequestRecord, Integer> VERIFYOTP = createField("verifyOTP", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>account.paymentRequest.modifiedAt</code>.
     */
    public final TableField<PaymentrequestRecord, Timestamp> MODIFIEDAT = createField("modifiedAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>account.paymentRequest.createdAt</code>.
     */
    public final TableField<PaymentrequestRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>account.paymentRequest</code> table reference
     */
    public Paymentrequest() {
        this("paymentRequest", null);
    }

    /**
     * Create an aliased <code>account.paymentRequest</code> table reference
     */
    public Paymentrequest(String alias) {
        this(alias, PAYMENTREQUEST);
    }

    private Paymentrequest(String alias, Table<PaymentrequestRecord> aliased) {
        this(alias, aliased, null);
    }

    private Paymentrequest(String alias, Table<PaymentrequestRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<PaymentrequestRecord> getPrimaryKey() {
        return Keys.KEY_PAYMENTREQUEST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PaymentrequestRecord>> getKeys() {
        return Arrays.<UniqueKey<PaymentrequestRecord>>asList(Keys.KEY_PAYMENTREQUEST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Paymentrequest as(String alias) {
        return new Paymentrequest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Paymentrequest rename(String name) {
        return new Paymentrequest(name, null);
    }
}
