/*
 * This file is generated by jOOQ.
*/
package jooqDemo.model.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooqDemo.model.Account;
import jooqDemo.model.Keys;
import jooqDemo.model.tables.records.FdaccountotpRecord;

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
public class Fdaccountotp extends TableImpl<FdaccountotpRecord> {

    private static final long serialVersionUID = 1006137257;

    /**
     * The reference instance of <code>account.fdAccountOTP</code>
     */
    public static final Fdaccountotp FDACCOUNTOTP = new Fdaccountotp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FdaccountotpRecord> getRecordType() {
        return FdaccountotpRecord.class;
    }

    /**
     * The column <code>account.fdAccountOTP.refkey</code>.
     */
    public final TableField<FdaccountotpRecord, String> REFKEY = createField("refkey", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

    /**
     * The column <code>account.fdAccountOTP.fdAccount</code>.
     */
    public final TableField<FdaccountotpRecord, String> FDACCOUNT = createField("fdAccount", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

    /**
     * The column <code>account.fdAccountOTP.verifyOTP</code>.
     */
    public final TableField<FdaccountotpRecord, Integer> VERIFYOTP = createField("verifyOTP", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>account.fdAccountOTP</code> table reference
     */
    public Fdaccountotp() {
        this("fdAccountOTP", null);
    }

    /**
     * Create an aliased <code>account.fdAccountOTP</code> table reference
     */
    public Fdaccountotp(String alias) {
        this(alias, FDACCOUNTOTP);
    }

    private Fdaccountotp(String alias, Table<FdaccountotpRecord> aliased) {
        this(alias, aliased, null);
    }

    private Fdaccountotp(String alias, Table<FdaccountotpRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<FdaccountotpRecord> getPrimaryKey() {
        return Keys.KEY_FDACCOUNTOTP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FdaccountotpRecord>> getKeys() {
        return Arrays.<UniqueKey<FdaccountotpRecord>>asList(Keys.KEY_FDACCOUNTOTP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Fdaccountotp as(String alias) {
        return new Fdaccountotp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Fdaccountotp rename(String name) {
        return new Fdaccountotp(name, null);
    }
}
