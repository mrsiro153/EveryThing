/*
 * This file is generated by jOOQ.
*/
package jooqDemo.model.tables;


import jooqDemo.model.Account;
import jooqDemo.model.Keys;
import jooqDemo.model.tables.records.DdtypeRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
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
public class Ddtype extends TableImpl<DdtypeRecord> {

    private static final long serialVersionUID = -928653564;

    /**
     * The reference instance of <code>account.ddType</code>
     */
    public static final Ddtype DDTYPE = new Ddtype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DdtypeRecord> getRecordType() {
        return DdtypeRecord.class;
    }

    /**
     * The column <code>account.ddType.accountType</code>.
     */
    public final TableField<DdtypeRecord, String> ACCOUNTTYPE = createField("accountType", org.jooq.impl.SQLDataType.CHAR.length(15).nullable(false), this, "");

    /**
     * The column <code>account.ddType.accountName</code>.
     */
    public final TableField<DdtypeRecord, String> ACCOUNTNAME = createField("accountName", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>account.ddType.accountInterestType</code>.
     */
    public final TableField<DdtypeRecord, Integer> ACCOUNTINTERESTTYPE = createField("accountInterestType", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>account.ddType.accountInterest</code>.
     */
    public final TableField<DdtypeRecord, BigDecimal> ACCOUNTINTEREST = createField("accountInterest", org.jooq.impl.SQLDataType.DECIMAL.precision(5, 2).nullable(false), this, "");

    /**
     * The column <code>account.ddType.accountFeeType</code>.
     */
    public final TableField<DdtypeRecord, Integer> ACCOUNTFEETYPE = createField("accountFeeType", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>account.ddType.accountFee</code>.
     */
    public final TableField<DdtypeRecord, BigDecimal> ACCOUNTFEE = createField("accountFee", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 2).nullable(false), this, "");

    /**
     * The column <code>account.ddType.minBalance</code>.
     */
    public final TableField<DdtypeRecord, BigDecimal> MINBALANCE = createField("minBalance", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 2).nullable(false), this, "");

    /**
     * The column <code>account.ddType.currency</code>.
     */
    public final TableField<DdtypeRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false), this, "");

    /**
     * The column <code>account.ddType.administrators</code>.
     */
    public final TableField<DdtypeRecord, String> ADMINISTRATORS = createField("administrators", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>account.ddType.status</code>.
     */
    public final TableField<DdtypeRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>account.ddType.createdAt</code>.
     */
    public final TableField<DdtypeRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>account.ddType.modifiedAt</code>.
     */
    public final TableField<DdtypeRecord, Timestamp> MODIFIEDAT = createField("modifiedAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>account.ddType</code> table reference
     */
    public Ddtype() {
        this("ddType", null);
    }

    /**
     * Create an aliased <code>account.ddType</code> table reference
     */
    public Ddtype(String alias) {
        this(alias, DDTYPE);
    }

    private Ddtype(String alias, Table<DdtypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Ddtype(String alias, Table<DdtypeRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<DdtypeRecord> getPrimaryKey() {
        return Keys.KEY_DDTYPE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DdtypeRecord>> getKeys() {
        return Arrays.<UniqueKey<DdtypeRecord>>asList(Keys.KEY_DDTYPE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ddtype as(String alias) {
        return new Ddtype(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Ddtype rename(String name) {
        return new Ddtype(name, null);
    }
}
