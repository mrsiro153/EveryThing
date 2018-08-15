/*
 * This file is generated by jOOQ.
*/
package jooqDemo.model.tables;


import jooqDemo.model.Account;
import jooqDemo.model.Keys;
import jooqDemo.model.tables.records.FdaccountRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
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
public class Fdaccount extends TableImpl<FdaccountRecord> {

    private static final long serialVersionUID = 1100117900;

    /**
     * The reference instance of <code>account.fdAccount</code>
     */
    public static final Fdaccount FDACCOUNT = new Fdaccount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdaccountRecord> getRecordType() {
        return FdaccountRecord.class;
    }

    /**
     * The column <code>account.fdAccount.id</code>.
     */
    public final TableField<FdaccountRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>account.fdAccount.fdAccountNumberPk</code>.
     */
    public final TableField<FdaccountRecord, String> FDACCOUNTNUMBERPK = createField("fdAccountNumberPk", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>account.fdAccount.fdAccountNumber</code>.
     */
    public final TableField<FdaccountRecord, String> FDACCOUNTNUMBER = createField("fdAccountNumber", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>account.fdAccount.fdType</code>.
     */
    public final TableField<FdaccountRecord, String> FDTYPE = createField("fdType", org.jooq.impl.SQLDataType.VARCHAR.length(11).nullable(false), this, "");

    /**
     * The column <code>account.fdAccount.title</code>.
     */
    public final TableField<FdaccountRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>account.fdAccount.cif</code>.
     */
    public final TableField<FdaccountRecord, String> CIF = createField("cif", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>account.fdAccount.currency</code>.
     */
    public final TableField<FdaccountRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>account.fdAccount.intRate</code>.
     */
    public final TableField<FdaccountRecord, BigDecimal> INTRATE = createField("intRate", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 2), this, "");

    /**
     * The column <code>account.fdAccount.periodPerTerm</code>.
     */
    public final TableField<FdaccountRecord, Integer> PERIODPERTERM = createField("periodPerTerm", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>account.fdAccount.originalAmount</code>.
     */
    public final TableField<FdaccountRecord, BigDecimal> ORIGINALAMOUNT = createField("originalAmount", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 10), this, "");

    /**
     * The column <code>account.fdAccount.withDraw</code>.
     */
    public final TableField<FdaccountRecord, BigDecimal> WITHDRAW = createField("withDraw", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 10), this, "");

    /**
     * The column <code>account.fdAccount.interestPerMonth</code>.
     */
    public final TableField<FdaccountRecord, BigDecimal> INTERESTPERMONTH = createField("interestPerMonth", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 10).defaultValue(org.jooq.impl.DSL.inline("0.0000000000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>account.fdAccount.totalInterest</code>.
     */
    public final TableField<FdaccountRecord, BigDecimal> TOTALINTEREST = createField("totalInterest", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 10).defaultValue(org.jooq.impl.DSL.inline("0.0000000000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>account.fdAccount.interestAccrued</code>.
     */
    public final TableField<FdaccountRecord, BigDecimal> INTERESTACCRUED = createField("interestAccrued", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 10), this, "");

    /**
     * The column <code>account.fdAccount.interestPay</code>.
     */
    public final TableField<FdaccountRecord, BigDecimal> INTERESTPAY = createField("interestPay", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 10), this, "");

    /**
     * The column <code>account.fdAccount.interestPaid</code>.
     */
    public final TableField<FdaccountRecord, BigDecimal> INTERESTPAID = createField("interestPaid", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 10), this, "");

    /**
     * The column <code>account.fdAccount.datePaid</code>.
     */
    public final TableField<FdaccountRecord, Date> DATEPAID = createField("datePaid", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>account.fdAccount.receiveAcc</code>.
     */
    public final TableField<FdaccountRecord, String> RECEIVEACC = createField("receiveAcc", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>account.fdAccount.autoReceiveType</code>.
     */
    public final TableField<FdaccountRecord, String> AUTORECEIVETYPE = createField("autoReceiveType", org.jooq.impl.SQLDataType.CHAR.length(2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("T", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>account.fdAccount.autoCompoundInt</code>.
     */
    public final TableField<FdaccountRecord, Byte> AUTOCOMPOUNDINT = createField("autoCompoundInt", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>account.fdAccount.fromDate</code>.
     */
    public final TableField<FdaccountRecord, Date> FROMDATE = createField("fromDate", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>account.fdAccount.toDate</code>.
     */
    public final TableField<FdaccountRecord, Date> TODATE = createField("toDate", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>account.fdAccount.nextGSPayDate</code>.
     */
    public final TableField<FdaccountRecord, Date> NEXTGSPAYDATE = createField("nextGSPayDate", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>account.fdAccount.goalSave</code>.
     */
    public final TableField<FdaccountRecord, Byte> GOALSAVE = createField("goalSave", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>account.fdAccount.autoAccrue</code>.
     */
    public final TableField<FdaccountRecord, Integer> AUTOACCRUE = createField("autoAccrue", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>account.fdAccount.image</code>.
     */
    public final TableField<FdaccountRecord, String> IMAGE = createField("image", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

    /**
     * The column <code>account.fdAccount.createDate</code>.
     */
    public final TableField<FdaccountRecord, Date> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>account.fdAccount.prstatus</code>.
     */
    public final TableField<FdaccountRecord, Integer> PRSTATUS = createField("prstatus", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>account.fdAccount.status</code>.
     */
    public final TableField<FdaccountRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>account.fdAccount.createdAt</code>.
     */
    public final TableField<FdaccountRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>account.fdAccount.modifyAt</code>.
     */
    public final TableField<FdaccountRecord, Timestamp> MODIFYAT = createField("modifyAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>account.fdAccount.accountRefNo</code>.
     */
    public final TableField<FdaccountRecord, String> ACCOUNTREFNO = createField("accountRefNo", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>account.fdAccount</code> table reference
     */
    public Fdaccount() {
        this("fdAccount", null);
    }

    /**
     * Create an aliased <code>account.fdAccount</code> table reference
     */
    public Fdaccount(String alias) {
        this(alias, FDACCOUNT);
    }

    private Fdaccount(String alias, Table<FdaccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private Fdaccount(String alias, Table<FdaccountRecord> aliased, Field<?>[] parameters) {
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
    public Identity<FdaccountRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FDACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdaccountRecord> getPrimaryKey() {
        return Keys.KEY_FDACCOUNT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdaccountRecord>> getKeys() {
        return Arrays.<UniqueKey<FdaccountRecord>>asList(Keys.KEY_FDACCOUNT_ID, Keys.KEY_FDACCOUNT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Fdaccount as(String alias) {
        return new Fdaccount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Fdaccount rename(String name) {
        return new Fdaccount(name, null);
    }
}
