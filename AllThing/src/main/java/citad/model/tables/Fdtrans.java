/*
 * This file is generated by jOOQ.
*/
package citad.model.tables;


import citad.model.Keys;
import citad.model.Transaction;
import citad.model.tables.records.FdtransRecord;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

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
public class Fdtrans extends TableImpl<FdtransRecord> {

    private static final long serialVersionUID = -1966487565;

    /**
     * The reference instance of <code>transaction.fdTrans</code>
     */
    public static final Fdtrans FDTRANS = new Fdtrans();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdtransRecord> getRecordType() {
        return FdtransRecord.class;
    }

    /**
     * The column <code>transaction.fdTrans.fdTransId</code>.
     */
    public final TableField<FdtransRecord, String> FDTRANSID = createField("fdTransId", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>transaction.fdTrans.fdAccountNumber</code>.
     */
    public final TableField<FdtransRecord, String> FDACCOUNTNUMBER = createField("fdAccountNumber", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>transaction.fdTrans.amount</code>.
     */
    public final TableField<FdtransRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL.precision(20, 2), this, "");

    /**
     * The column <code>transaction.fdTrans.type</code>.
     */
    public final TableField<FdtransRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.CHAR.length(2), this, "");

    /**
     * The column <code>transaction.fdTrans.createDate</code>.
     */
    public final TableField<FdtransRecord, Date> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>transaction.fdTrans.createdAt</code>.
     */
    public final TableField<FdtransRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>transaction.fdTrans.modifyAt</code>.
     */
    public final TableField<FdtransRecord, Timestamp> MODIFYAT = createField("modifyAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>transaction.fdTrans.status</code>.
     */
    public final TableField<FdtransRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>transaction.fdTrans</code> table reference
     */
    public Fdtrans() {
        this("fdTrans", null);
    }

    /**
     * Create an aliased <code>transaction.fdTrans</code> table reference
     */
    public Fdtrans(String alias) {
        this(alias, FDTRANS);
    }

    private Fdtrans(String alias, Table<FdtransRecord> aliased) {
        this(alias, aliased, null);
    }

    private Fdtrans(String alias, Table<FdtransRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<FdtransRecord> getPrimaryKey() {
        return Keys.KEY_FDTRANS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdtransRecord>> getKeys() {
        return Arrays.<UniqueKey<FdtransRecord>>asList(Keys.KEY_FDTRANS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Fdtrans as(String alias) {
        return new Fdtrans(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Fdtrans rename(String name) {
        return new Fdtrans(name, null);
    }
}
