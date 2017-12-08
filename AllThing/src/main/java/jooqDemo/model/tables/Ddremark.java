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
import jooqDemo.model.tables.records.DdremarkRecord;

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
public class Ddremark extends TableImpl<DdremarkRecord> {

    private static final long serialVersionUID = -2812804;

    /**
     * The reference instance of <code>account.ddRemark</code>
     */
    public static final Ddremark DDREMARK = new Ddremark();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DdremarkRecord> getRecordType() {
        return DdremarkRecord.class;
    }

    /**
     * The column <code>account.ddRemark.accountNumber</code>.
     */
    public final TableField<DdremarkRecord, String> ACCOUNTNUMBER = createField("accountNumber", org.jooq.impl.SQLDataType.VARCHAR.length(63).nullable(false), this, "");

    /**
     * The column <code>account.ddRemark.refKey</code>.
     */
    public final TableField<DdremarkRecord, String> REFKEY = createField("refKey", org.jooq.impl.SQLDataType.VARCHAR.length(31), this, "");

    /**
     * The column <code>account.ddRemark.amount</code>.
     */
    public final TableField<DdremarkRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 2).nullable(false), this, "");

    /**
     * The column <code>account.ddRemark.status</code>.
     */
    public final TableField<DdremarkRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>account.ddRemark.preStatus</code>.
     */
    public final TableField<DdremarkRecord, Integer> PRESTATUS = createField("preStatus", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>account.ddRemark.startAt</code>.
     */
    public final TableField<DdremarkRecord, Timestamp> STARTAT = createField("startAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>account.ddRemark.endAt</code>.
     */
    public final TableField<DdremarkRecord, Timestamp> ENDAT = createField("endAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>account.ddRemark.administrators</code>.
     */
    public final TableField<DdremarkRecord, String> ADMINISTRATORS = createField("administrators", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>account.ddRemark.createdAt</code>.
     */
    public final TableField<DdremarkRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>account.ddRemark.modifiedAt</code>.
     */
    public final TableField<DdremarkRecord, Timestamp> MODIFIEDAT = createField("modifiedAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>account.ddRemark</code> table reference
     */
    public Ddremark() {
        this("ddRemark", null);
    }

    /**
     * Create an aliased <code>account.ddRemark</code> table reference
     */
    public Ddremark(String alias) {
        this(alias, DDREMARK);
    }

    private Ddremark(String alias, Table<DdremarkRecord> aliased) {
        this(alias, aliased, null);
    }

    private Ddremark(String alias, Table<DdremarkRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<DdremarkRecord> getPrimaryKey() {
        return Keys.KEY_DDREMARK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DdremarkRecord>> getKeys() {
        return Arrays.<UniqueKey<DdremarkRecord>>asList(Keys.KEY_DDREMARK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ddremark as(String alias) {
        return new Ddremark(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Ddremark rename(String name) {
        return new Ddremark(name, null);
    }
}
