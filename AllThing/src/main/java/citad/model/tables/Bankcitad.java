/*
 * This file is generated by jOOQ.
*/
package citad.model.tables;


import citad.model.Keys;
import citad.model.Transaction;
import citad.model.tables.records.BankcitadRecord;

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
public class Bankcitad extends TableImpl<BankcitadRecord> {

    private static final long serialVersionUID = -1144246549;

    /**
     * The reference instance of <code>transaction.bankCitad</code>
     */
    public static final Bankcitad BANKCITAD = new Bankcitad();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BankcitadRecord> getRecordType() {
        return BankcitadRecord.class;
    }

    /**
     * The column <code>transaction.bankCitad.bankId</code>.
     */
    public final TableField<BankcitadRecord, String> BANKID = createField("bankId", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>transaction.bankCitad.bankName</code>.
     */
    public final TableField<BankcitadRecord, String> BANKNAME = createField("bankName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.bankCitad.formalName</code>.
     */
    public final TableField<BankcitadRecord, String> FORMALNAME = createField("formalName", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>transaction.bankCitad.napas</code>.
     */
    public final TableField<BankcitadRecord, String> NAPAS = createField("napas", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

    /**
     * Create a <code>transaction.bankCitad</code> table reference
     */
    public Bankcitad() {
        this("bankCitad", null);
    }

    /**
     * Create an aliased <code>transaction.bankCitad</code> table reference
     */
    public Bankcitad(String alias) {
        this(alias, BANKCITAD);
    }

    private Bankcitad(String alias, Table<BankcitadRecord> aliased) {
        this(alias, aliased, null);
    }

    private Bankcitad(String alias, Table<BankcitadRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<BankcitadRecord> getPrimaryKey() {
        return Keys.KEY_BANKCITAD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BankcitadRecord>> getKeys() {
        return Arrays.<UniqueKey<BankcitadRecord>>asList(Keys.KEY_BANKCITAD_PRIMARY, Keys.KEY_BANKCITAD_BANKCITAD_NAPAS_UINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bankcitad as(String alias) {
        return new Bankcitad(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Bankcitad rename(String name) {
        return new Bankcitad(name, null);
    }
}
