/*
 * This file is generated by jOOQ.
*/
package citad.model.tables.records;


import citad.model.tables.Userdatacontext;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UserdatacontextRecord extends UpdatableRecordImpl<UserdatacontextRecord> implements Record6<Long, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -445271924;

    /**
     * Setter for <code>transaction.userDataContext.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>transaction.userDataContext.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>transaction.userDataContext.refKey</code>.
     */
    public void setRefkey(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>transaction.userDataContext.refKey</code>.
     */
    public String getRefkey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>transaction.userDataContext.cif</code>.
     */
    public void setCif(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>transaction.userDataContext.cif</code>.
     */
    public String getCif() {
        return (String) get(2);
    }

    /**
     * Setter for <code>transaction.userDataContext.dataContext</code>.
     */
    public void setDatacontext(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>transaction.userDataContext.dataContext</code>.
     */
    public String getDatacontext() {
        return (String) get(3);
    }

    /**
     * Setter for <code>transaction.userDataContext.createdAt</code>.
     */
    public void setCreatedat(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>transaction.userDataContext.createdAt</code>.
     */
    public Timestamp getCreatedat() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>transaction.userDataContext.modifyAt</code>.
     */
    public void setModifyat(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>transaction.userDataContext.modifyAt</code>.
     */
    public Timestamp getModifyat() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Userdatacontext.USERDATACONTEXT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Userdatacontext.USERDATACONTEXT.REFKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Userdatacontext.USERDATACONTEXT.CIF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Userdatacontext.USERDATACONTEXT.DATACONTEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Userdatacontext.USERDATACONTEXT.CREATEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Userdatacontext.USERDATACONTEXT.MODIFYAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRefkey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCif();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDatacontext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getModifyat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserdatacontextRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserdatacontextRecord value2(String value) {
        setRefkey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserdatacontextRecord value3(String value) {
        setCif(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserdatacontextRecord value4(String value) {
        setDatacontext(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserdatacontextRecord value5(Timestamp value) {
        setCreatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserdatacontextRecord value6(Timestamp value) {
        setModifyat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserdatacontextRecord values(Long value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserdatacontextRecord
     */
    public UserdatacontextRecord() {
        super(Userdatacontext.USERDATACONTEXT);
    }

    /**
     * Create a detached, initialised UserdatacontextRecord
     */
    public UserdatacontextRecord(Long id, String refkey, String cif, String datacontext, Timestamp createdat, Timestamp modifyat) {
        super(Userdatacontext.USERDATACONTEXT);

        set(0, id);
        set(1, refkey);
        set(2, cif);
        set(3, datacontext);
        set(4, createdat);
        set(5, modifyat);
    }
}
