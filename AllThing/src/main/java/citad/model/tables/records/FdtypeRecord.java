/*
 * This file is generated by jOOQ.
*/
package citad.model.tables.records;


import citad.model.tables.Fdtype;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class FdtypeRecord extends UpdatableRecordImpl<FdtypeRecord> implements Record16<Integer, String, String, Integer, String, Integer, Integer, Double, Integer, String, String, String, String, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = -2036674736;

    /**
     * Setter for <code>transaction.fdType.fdTypeNumber</code>.
     */
    public void setFdtypenumber(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>transaction.fdType.fdTypeNumber</code>.
     */
    public Integer getFdtypenumber() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>transaction.fdType.fdTypeId</code>.
     */
    public void setFdtypeid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>transaction.fdType.fdTypeId</code>.
     */
    public String getFdtypeid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>transaction.fdType.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>transaction.fdType.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>transaction.fdType.period</code>.
     */
    public void setPeriod(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>transaction.fdType.period</code>.
     */
    public Integer getPeriod() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>transaction.fdType.periodType</code>.
     */
    public void setPeriodtype(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>transaction.fdType.periodType</code>.
     */
    public String getPeriodtype() {
        return (String) get(4);
    }

    /**
     * Setter for <code>transaction.fdType.receiveType</code>.
     */
    public void setReceivetype(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>transaction.fdType.receiveType</code>.
     */
    public Integer getReceivetype() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>transaction.fdType.compoundInt</code>.
     */
    public void setCompoundint(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>transaction.fdType.compoundInt</code>.
     */
    public Integer getCompoundint() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>transaction.fdType.rate</code>.
     */
    public void setRate(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>transaction.fdType.rate</code>.
     */
    public Double getRate() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>transaction.fdType.status</code>.
     */
    public void setStatus(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>transaction.fdType.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>transaction.fdType.adminCreator</code>.
     */
    public void setAdmincreator(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>transaction.fdType.adminCreator</code>.
     */
    public String getAdmincreator() {
        return (String) get(9);
    }

    /**
     * Setter for <code>transaction.fdType.adminCreatorCif</code>.
     */
    public void setAdmincreatorcif(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>transaction.fdType.adminCreatorCif</code>.
     */
    public String getAdmincreatorcif() {
        return (String) get(10);
    }

    /**
     * Setter for <code>transaction.fdType.adminUpdate</code>.
     */
    public void setAdminupdate(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>transaction.fdType.adminUpdate</code>.
     */
    public String getAdminupdate() {
        return (String) get(11);
    }

    /**
     * Setter for <code>transaction.fdType.adminUpdateCif</code>.
     */
    public void setAdminupdatecif(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>transaction.fdType.adminUpdateCif</code>.
     */
    public String getAdminupdatecif() {
        return (String) get(12);
    }

    /**
     * Setter for <code>transaction.fdType.createdAt</code>.
     */
    public void setCreatedat(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>transaction.fdType.createdAt</code>.
     */
    public Timestamp getCreatedat() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>transaction.fdType.modifiedAt</code>.
     */
    public void setModifiedat(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>transaction.fdType.modifiedAt</code>.
     */
    public Timestamp getModifiedat() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>transaction.fdType.isDelete</code>.
     */
    public void setIsdelete(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>transaction.fdType.isDelete</code>.
     */
    public Integer getIsdelete() {
        return (Integer) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, String, String, Integer, String, Integer, Integer, Double, Integer, String, String, String, String, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, String, String, Integer, String, Integer, Integer, Double, Integer, String, String, String, String, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Fdtype.FDTYPE.FDTYPENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Fdtype.FDTYPE.FDTYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Fdtype.FDTYPE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Fdtype.FDTYPE.PERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Fdtype.FDTYPE.PERIODTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Fdtype.FDTYPE.RECEIVETYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Fdtype.FDTYPE.COMPOUNDINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return Fdtype.FDTYPE.RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Fdtype.FDTYPE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Fdtype.FDTYPE.ADMINCREATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Fdtype.FDTYPE.ADMINCREATORCIF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Fdtype.FDTYPE.ADMINUPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Fdtype.FDTYPE.ADMINUPDATECIF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return Fdtype.FDTYPE.CREATEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return Fdtype.FDTYPE.MODIFIEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return Fdtype.FDTYPE.ISDELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFdtypenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFdtypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPeriodtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getReceivetype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCompoundint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getAdmincreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getAdmincreatorcif();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAdminupdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getAdminupdatecif();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getCreatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getModifiedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getIsdelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value1(Integer value) {
        setFdtypenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value2(String value) {
        setFdtypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value4(Integer value) {
        setPeriod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value5(String value) {
        setPeriodtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value6(Integer value) {
        setReceivetype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value7(Integer value) {
        setCompoundint(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value8(Double value) {
        setRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value9(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value10(String value) {
        setAdmincreator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value11(String value) {
        setAdmincreatorcif(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value12(String value) {
        setAdminupdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value13(String value) {
        setAdminupdatecif(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value14(Timestamp value) {
        setCreatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value15(Timestamp value) {
        setModifiedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value16(Integer value) {
        setIsdelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord values(Integer value1, String value2, String value3, Integer value4, String value5, Integer value6, Integer value7, Double value8, Integer value9, String value10, String value11, String value12, String value13, Timestamp value14, Timestamp value15, Integer value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FdtypeRecord
     */
    public FdtypeRecord() {
        super(Fdtype.FDTYPE);
    }

    /**
     * Create a detached, initialised FdtypeRecord
     */
    public FdtypeRecord(Integer fdtypenumber, String fdtypeid, String name, Integer period, String periodtype, Integer receivetype, Integer compoundint, Double rate, Integer status, String admincreator, String admincreatorcif, String adminupdate, String adminupdatecif, Timestamp createdat, Timestamp modifiedat, Integer isdelete) {
        super(Fdtype.FDTYPE);

        set(0, fdtypenumber);
        set(1, fdtypeid);
        set(2, name);
        set(3, period);
        set(4, periodtype);
        set(5, receivetype);
        set(6, compoundint);
        set(7, rate);
        set(8, status);
        set(9, admincreator);
        set(10, admincreatorcif);
        set(11, adminupdate);
        set(12, adminupdatecif);
        set(13, createdat);
        set(14, modifiedat);
        set(15, isdelete);
    }
}