/*
 * This file is generated by jOOQ.
*/
package citad.model.tables;


import citad.model.Keys;
import citad.model.Transaction;
import citad.model.tables.records.LoandescriptionRecord;

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
public class Loandescription extends TableImpl<LoandescriptionRecord> {

    private static final long serialVersionUID = -213997348;

    /**
     * The reference instance of <code>transaction.loanDescription</code>
     */
    public static final Loandescription LOANDESCRIPTION = new Loandescription();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LoandescriptionRecord> getRecordType() {
        return LoandescriptionRecord.class;
    }

    /**
     * The column <code>transaction.loanDescription.id</code>.
     */
    public final TableField<LoandescriptionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>transaction.loanDescription.productId</code>.
     */
    public final TableField<LoandescriptionRecord, Integer> PRODUCTID = createField("productId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>transaction.loanDescription.descriptionEn</code>.
     */
    public final TableField<LoandescriptionRecord, String> DESCRIPTIONEN = createField("descriptionEn", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>transaction.loanDescription.descriptionVn</code>.
     */
    public final TableField<LoandescriptionRecord, String> DESCRIPTIONVN = createField("descriptionVn", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>transaction.loanDescription</code> table reference
     */
    public Loandescription() {
        this("loanDescription", null);
    }

    /**
     * Create an aliased <code>transaction.loanDescription</code> table reference
     */
    public Loandescription(String alias) {
        this(alias, LOANDESCRIPTION);
    }

    private Loandescription(String alias, Table<LoandescriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Loandescription(String alias, Table<LoandescriptionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<LoandescriptionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LOANDESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LoandescriptionRecord> getPrimaryKey() {
        return Keys.KEY_LOANDESCRIPTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LoandescriptionRecord>> getKeys() {
        return Arrays.<UniqueKey<LoandescriptionRecord>>asList(Keys.KEY_LOANDESCRIPTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Loandescription as(String alias) {
        return new Loandescription(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Loandescription rename(String name) {
        return new Loandescription(name, null);
    }
}
