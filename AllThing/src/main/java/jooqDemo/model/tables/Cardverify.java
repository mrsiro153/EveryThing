/*
 * This file is generated by jOOQ.
*/
package jooqDemo.model.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooqDemo.model.Account;
import jooqDemo.model.Keys;
import jooqDemo.model.tables.records.CardverifyRecord;

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
public class Cardverify extends TableImpl<CardverifyRecord> {

    private static final long serialVersionUID = -990078557;

    /**
     * The reference instance of <code>account.cardVerify</code>
     */
    public static final Cardverify CARDVERIFY = new Cardverify();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CardverifyRecord> getRecordType() {
        return CardverifyRecord.class;
    }

    /**
     * The column <code>account.cardVerify.refKey</code>.
     */
    public final TableField<CardverifyRecord, String> REFKEY = createField("refKey", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>account.cardVerify.cardNumber</code>.
     */
    public final TableField<CardverifyRecord, String> CARDNUMBER = createField("cardNumber", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>account.cardVerify.verifyOTP</code>.
     */
    public final TableField<CardverifyRecord, Integer> VERIFYOTP = createField("verifyOTP", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>account.cardVerify.status</code>.
     */
    public final TableField<CardverifyRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>account.cardVerify.modifiedAt</code>.
     */
    public final TableField<CardverifyRecord, Timestamp> MODIFIEDAT = createField("modifiedAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>account.cardVerify.createdAt</code>.
     */
    public final TableField<CardverifyRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>account.cardVerify</code> table reference
     */
    public Cardverify() {
        this("cardVerify", null);
    }

    /**
     * Create an aliased <code>account.cardVerify</code> table reference
     */
    public Cardverify(String alias) {
        this(alias, CARDVERIFY);
    }

    private Cardverify(String alias, Table<CardverifyRecord> aliased) {
        this(alias, aliased, null);
    }

    private Cardverify(String alias, Table<CardverifyRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CardverifyRecord> getPrimaryKey() {
        return Keys.KEY_CARDVERIFY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CardverifyRecord>> getKeys() {
        return Arrays.<UniqueKey<CardverifyRecord>>asList(Keys.KEY_CARDVERIFY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cardverify as(String alias) {
        return new Cardverify(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Cardverify rename(String name) {
        return new Cardverify(name, null);
    }
}
