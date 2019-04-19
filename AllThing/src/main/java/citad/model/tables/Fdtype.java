/*
 * This file is generated by jOOQ.
*/
package citad.model.tables;


import citad.model.Keys;
import citad.model.Transaction;
import citad.model.tables.records.FdtypeRecord;

import java.sql.Timestamp;
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
public class Fdtype extends TableImpl<FdtypeRecord> {

    private static final long serialVersionUID = 1418603687;

    /**
     * The reference instance of <code>transaction.fdType</code>
     */
    public static final Fdtype FDTYPE = new Fdtype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdtypeRecord> getRecordType() {
        return FdtypeRecord.class;
    }

    /**
     * The column <code>transaction.fdType.fdTypeNumber</code>.
     */
    public final TableField<FdtypeRecord, Integer> FDTYPENUMBER = createField("fdTypeNumber", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.fdTypeId</code>.
     */
    public final TableField<FdtypeRecord, String> FDTYPEID = createField("fdTypeId", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.name</code>.
     */
    public final TableField<FdtypeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.period</code>.
     */
    public final TableField<FdtypeRecord, Integer> PERIOD = createField("period", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.periodType</code>.
     */
    public final TableField<FdtypeRecord, String> PERIODTYPE = createField("periodType", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.receiveType</code>.
     */
    public final TableField<FdtypeRecord, Integer> RECEIVETYPE = createField("receiveType", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.compoundInt</code>.
     */
    public final TableField<FdtypeRecord, Integer> COMPOUNDINT = createField("compoundInt", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.rate</code>.
     */
    public final TableField<FdtypeRecord, Double> RATE = createField("rate", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.status</code>.
     */
    public final TableField<FdtypeRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.adminCreator</code>.
     */
    public final TableField<FdtypeRecord, String> ADMINCREATOR = createField("adminCreator", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.adminCreatorCif</code>.
     */
    public final TableField<FdtypeRecord, String> ADMINCREATORCIF = createField("adminCreatorCif", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.adminUpdate</code>.
     */
    public final TableField<FdtypeRecord, String> ADMINUPDATE = createField("adminUpdate", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.adminUpdateCif</code>.
     */
    public final TableField<FdtypeRecord, String> ADMINUPDATECIF = createField("adminUpdateCif", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.createdAt</code>.
     */
    public final TableField<FdtypeRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.modifiedAt</code>.
     */
    public final TableField<FdtypeRecord, Timestamp> MODIFIEDAT = createField("modifiedAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>transaction.fdType.isDelete</code>.
     */
    public final TableField<FdtypeRecord, Integer> ISDELETE = createField("isDelete", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>transaction.fdType</code> table reference
     */
    public Fdtype() {
        this("fdType", null);
    }

    /**
     * Create an aliased <code>transaction.fdType</code> table reference
     */
    public Fdtype(String alias) {
        this(alias, FDTYPE);
    }

    private Fdtype(String alias, Table<FdtypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Fdtype(String alias, Table<FdtypeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<FdtypeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FDTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FdtypeRecord> getPrimaryKey() {
        return Keys.KEY_FDTYPE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdtypeRecord>> getKeys() {
        return Arrays.<UniqueKey<FdtypeRecord>>asList(Keys.KEY_FDTYPE_PRIMARY, Keys.KEY_FDTYPE_FDTYPEID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Fdtype as(String alias) {
        return new Fdtype(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Fdtype rename(String name) {
        return new Fdtype(name, null);
    }
}
