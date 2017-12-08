/*
 * This file is generated by jOOQ.
*/
package jooqDemo.model.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooqDemo.model.Account;
import jooqDemo.model.tables.records.DdrateRecord;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Ddrate extends TableImpl<DdrateRecord> {

    private static final long serialVersionUID = 1068086835;

    /**
     * The reference instance of <code>account.ddRate</code>
     */
    public static final Ddrate DDRATE = new Ddrate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DdrateRecord> getRecordType() {
        return DdrateRecord.class;
    }

    /**
     * The column <code>account.ddRate.accountType</code>.
     */
    public final TableField<DdrateRecord, String> ACCOUNTTYPE = createField("accountType", org.jooq.impl.SQLDataType.CHAR.length(15).nullable(false), this, "");

    /**
     * The column <code>account.ddRate.fromAmount</code>.
     */
    public final TableField<DdrateRecord, BigDecimal> FROMAMOUNT = createField("fromAmount", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 2).nullable(false), this, "");

    /**
     * The column <code>account.ddRate.toAmount</code>.
     */
    public final TableField<DdrateRecord, BigDecimal> TOAMOUNT = createField("toAmount", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 2).nullable(false), this, "");

    /**
     * The column <code>account.ddRate.rate</code>.
     */
    public final TableField<DdrateRecord, BigDecimal> RATE = createField("rate", org.jooq.impl.SQLDataType.DECIMAL.precision(5, 2).nullable(false), this, "");

    /**
     * The column <code>account.ddRate.administrators</code>.
     */
    public final TableField<DdrateRecord, String> ADMINISTRATORS = createField("administrators", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>account.ddRate.status</code>.
     */
    public final TableField<DdrateRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>account.ddRate.startAt</code>.
     */
    public final TableField<DdrateRecord, Timestamp> STARTAT = createField("startAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>account.ddRate.endAt</code>.
     */
    public final TableField<DdrateRecord, Timestamp> ENDAT = createField("endAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>account.ddRate.createdAt</code>.
     */
    public final TableField<DdrateRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>account.ddRate.modifiedAt</code>.
     */
    public final TableField<DdrateRecord, Timestamp> MODIFIEDAT = createField("modifiedAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>account.ddRate</code> table reference
     */
    public Ddrate() {
        this("ddRate", null);
    }

    /**
     * Create an aliased <code>account.ddRate</code> table reference
     */
    public Ddrate(String alias) {
        this(alias, DDRATE);
    }

    private Ddrate(String alias, Table<DdrateRecord> aliased) {
        this(alias, aliased, null);
    }

    private Ddrate(String alias, Table<DdrateRecord> aliased, Field<?>[] parameters) {
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
    public Ddrate as(String alias) {
        return new Ddrate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Ddrate rename(String name) {
        return new Ddrate(name, null);
    }
}
