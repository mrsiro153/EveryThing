/*
 * This file is generated by jOOQ.
*/
package jooqDemo.model.tables.records;


import javax.annotation.Generated;

import jooqDemo.model.tables.Citycode;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class CitycodeRecord extends TableRecordImpl<CitycodeRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1538878488;

    /**
     * Setter for <code>account.cityCode.type</code>.
     */
    public void setType(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>account.cityCode.type</code>.
     */
    public String getType() {
        return (String) get(0);
    }

    /**
     * Setter for <code>account.cityCode.cityName</code>.
     */
    public void setCityname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>account.cityCode.cityName</code>.
     */
    public String getCityname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>account.cityCode.cityCode</code>.
     */
    public void setCitycode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>account.cityCode.cityCode</code>.
     */
    public String getCitycode() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Citycode.CITYCODE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Citycode.CITYCODE.CITYNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Citycode.CITYCODE.CITYCODE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCityname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCitycode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CitycodeRecord value1(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CitycodeRecord value2(String value) {
        setCityname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CitycodeRecord value3(String value) {
        setCitycode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CitycodeRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CitycodeRecord
     */
    public CitycodeRecord() {
        super(Citycode.CITYCODE);
    }

    /**
     * Create a detached, initialised CitycodeRecord
     */
    public CitycodeRecord(String type, String cityname, String citycode) {
        super(Citycode.CITYCODE);

        set(0, type);
        set(1, cityname);
        set(2, citycode);
    }
}