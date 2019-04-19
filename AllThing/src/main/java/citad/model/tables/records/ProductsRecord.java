/*
 * This file is generated by jOOQ.
*/
package citad.model.tables.records;


import citad.model.tables.Products;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class ProductsRecord extends UpdatableRecordImpl<ProductsRecord> implements Record17<Integer, String, String, Integer, String, String, BigInteger, BigInteger, Integer, Integer, Integer, Integer, Integer, Long, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -10046039;

    /**
     * Setter for <code>transaction.products.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>transaction.products.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>transaction.products.productNameVn</code>.
     */
    public void setProductnamevn(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>transaction.products.productNameVn</code>.
     */
    public String getProductnamevn() {
        return (String) get(1);
    }

    /**
     * Setter for <code>transaction.products.productNameEn</code>.
     */
    public void setProductnameen(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>transaction.products.productNameEn</code>.
     */
    public String getProductnameen() {
        return (String) get(2);
    }

    /**
     * Setter for <code>transaction.products.icon</code>.
     */
    public void setIcon(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>transaction.products.icon</code>.
     */
    public Integer getIcon() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>transaction.products.descriptionVn</code>.
     */
    public void setDescriptionvn(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>transaction.products.descriptionVn</code>.
     */
    public String getDescriptionvn() {
        return (String) get(4);
    }

    /**
     * Setter for <code>transaction.products.descriptionEn</code>.
     */
    public void setDescriptionen(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>transaction.products.descriptionEn</code>.
     */
    public String getDescriptionen() {
        return (String) get(5);
    }

    /**
     * Setter for <code>transaction.products.minAmount</code>.
     */
    public void setMinamount(BigInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>transaction.products.minAmount</code>.
     */
    public BigInteger getMinamount() {
        return (BigInteger) get(6);
    }

    /**
     * Setter for <code>transaction.products.maxAmount</code>.
     */
    public void setMaxamount(BigInteger value) {
        set(7, value);
    }

    /**
     * Getter for <code>transaction.products.maxAmount</code>.
     */
    public BigInteger getMaxamount() {
        return (BigInteger) get(7);
    }

    /**
     * Setter for <code>transaction.products.minPeriod</code>.
     */
    public void setMinperiod(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>transaction.products.minPeriod</code>.
     */
    public Integer getMinperiod() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>transaction.products.maxPeriod</code>.
     */
    public void setMaxperiod(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>transaction.products.maxPeriod</code>.
     */
    public Integer getMaxperiod() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>transaction.products.serviceId</code>.
     */
    public void setServiceid(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>transaction.products.serviceId</code>.
     */
    public Integer getServiceid() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>transaction.products.customerType</code>.
     */
    public void setCustomertype(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>transaction.products.customerType</code>.
     */
    public Integer getCustomertype() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>transaction.products.provisoId</code>.
     */
    public void setProvisoid(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>transaction.products.provisoId</code>.
     */
    public Integer getProvisoid() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>transaction.products.amountUnit</code>.
     */
    public void setAmountunit(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>transaction.products.amountUnit</code>.
     */
    public Long getAmountunit() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>transaction.products.status</code>.
     */
    public void setStatus(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>transaction.products.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>transaction.products.createdAt</code>.
     */
    public void setCreatedat(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>transaction.products.createdAt</code>.
     */
    public Timestamp getCreatedat() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>transaction.products.modifiedAt</code>.
     */
    public void setModifiedat(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>transaction.products.modifiedAt</code>.
     */
    public Timestamp getModifiedat() {
        return (Timestamp) get(16);
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
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, String, String, Integer, String, String, BigInteger, BigInteger, Integer, Integer, Integer, Integer, Integer, Long, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, String, String, Integer, String, String, BigInteger, BigInteger, Integer, Integer, Integer, Integer, Integer, Long, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Products.PRODUCTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Products.PRODUCTS.PRODUCTNAMEVN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Products.PRODUCTS.PRODUCTNAMEEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Products.PRODUCTS.ICON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Products.PRODUCTS.DESCRIPTIONVN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Products.PRODUCTS.DESCRIPTIONEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field7() {
        return Products.PRODUCTS.MINAMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field8() {
        return Products.PRODUCTS.MAXAMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Products.PRODUCTS.MINPERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Products.PRODUCTS.MAXPERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Products.PRODUCTS.SERVICEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Products.PRODUCTS.CUSTOMERTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return Products.PRODUCTS.PROVISOID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return Products.PRODUCTS.AMOUNTUNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return Products.PRODUCTS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return Products.PRODUCTS.CREATEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return Products.PRODUCTS.MODIFIEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProductnamevn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProductnameen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getIcon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescriptionvn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescriptionen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value7() {
        return getMinamount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value8() {
        return getMaxamount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getMinperiod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getMaxperiod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getServiceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getCustomertype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getProvisoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getAmountunit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getCreatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getModifiedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value2(String value) {
        setProductnamevn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value3(String value) {
        setProductnameen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value4(Integer value) {
        setIcon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value5(String value) {
        setDescriptionvn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value6(String value) {
        setDescriptionen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value7(BigInteger value) {
        setMinamount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value8(BigInteger value) {
        setMaxamount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value9(Integer value) {
        setMinperiod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value10(Integer value) {
        setMaxperiod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value11(Integer value) {
        setServiceid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value12(Integer value) {
        setCustomertype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value13(Integer value) {
        setProvisoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value14(Long value) {
        setAmountunit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value15(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value16(Timestamp value) {
        setCreatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord value17(Timestamp value) {
        setModifiedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsRecord values(Integer value1, String value2, String value3, Integer value4, String value5, String value6, BigInteger value7, BigInteger value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13, Long value14, Integer value15, Timestamp value16, Timestamp value17) {
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
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductsRecord
     */
    public ProductsRecord() {
        super(Products.PRODUCTS);
    }

    /**
     * Create a detached, initialised ProductsRecord
     */
    public ProductsRecord(Integer id, String productnamevn, String productnameen, Integer icon, String descriptionvn, String descriptionen, BigInteger minamount, BigInteger maxamount, Integer minperiod, Integer maxperiod, Integer serviceid, Integer customertype, Integer provisoid, Long amountunit, Integer status, Timestamp createdat, Timestamp modifiedat) {
        super(Products.PRODUCTS);

        set(0, id);
        set(1, productnamevn);
        set(2, productnameen);
        set(3, icon);
        set(4, descriptionvn);
        set(5, descriptionen);
        set(6, minamount);
        set(7, maxamount);
        set(8, minperiod);
        set(9, maxperiod);
        set(10, serviceid);
        set(11, customertype);
        set(12, provisoid);
        set(13, amountunit);
        set(14, status);
        set(15, createdat);
        set(16, modifiedat);
    }
}
