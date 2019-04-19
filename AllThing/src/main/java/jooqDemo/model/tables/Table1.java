/*
 * This file is generated by jOOQ.
*/
package jooqDemo.model.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooqDemo.model.Keys;
import jooqDemo.model.Mydata;
import jooqDemo.model.tables.records.Table1Record;

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
public class Table1 extends TableImpl<Table1Record> {

    private static final long serialVersionUID = 1797466375;

    /**
     * The reference instance of <code>mydata.table1</code>
     */
    public static final Table1 TABLE1 = new Table1();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Table1Record> getRecordType() {
        return Table1Record.class;
    }

    /**
     * The column <code>mydata.table1.id</code>.
     */
    public final TableField<Table1Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mydata.table1.name</code>.
     */
    public final TableField<Table1Record, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(656), this, "");

    /**
     * The column <code>mydata.table1.createdAt</code>.
     */
    public final TableField<Table1Record, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>mydata.table1</code> table reference
     */
    public Table1() {
        this("table1", null);
    }

    /**
     * Create an aliased <code>mydata.table1</code> table reference
     */
    public Table1(String alias) {
        this(alias, TABLE1);
    }

    private Table1(String alias, Table<Table1Record> aliased) {
        this(alias, aliased, null);
    }

    private Table1(String alias, Table<Table1Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mydata.MYDATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<Table1Record, Integer> getIdentity() {
        return Keys.IDENTITY_TABLE1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Table1Record> getPrimaryKey() {
        return Keys.KEY_TABLE1_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Table1Record>> getKeys() {
        return Arrays.<UniqueKey<Table1Record>>asList(Keys.KEY_TABLE1_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Table1 as(String alias) {
        return new Table1(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Table1 rename(String name) {
        return new Table1(name, null);
    }
}
