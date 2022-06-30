package br.com.company.cadastro.items.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PackItem implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 9158710456273281971L;

    private String packId;
    private Integer sequenceNumber;
    private String skuId;
    private Integer quantity;
    private Date createDateTime;
    private Date lastUpdateDateTime;
    private String lastUpdateId;
    private SKU sku;


    public PackItem() {
    }

    public PackItem(String packId, Integer sequenceNumber, String skuId, Integer quantity, Date createDateTime, Date lastUpdateDateTime, String lastUpdateId, SKU sku) {
        this.packId = packId;
        this.sequenceNumber = sequenceNumber;
        this.skuId = skuId;
        this.quantity = quantity;
        this.createDateTime = createDateTime;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.lastUpdateId = lastUpdateId;
        this.sku = sku;
    }

    public String getPackId() {
        return this.packId;
    }

    public void setPackId(String packId) {
        this.packId = packId;
    }

    public Integer getSequenceNumber() {
        return this.sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getSkuId() {
        return this.skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getCreateDateTime() {
        return this.createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Date getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }

    public void setLastUpdateDateTime(Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public String getLastUpdateId() {
        return this.lastUpdateId;
    }

    public void setLastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
    }

    public SKU getSku() {
        return this.sku;
    }

    public void setSku(SKU sku) {
        this.sku = sku;
    }

    public PackItem packId(String packId) {
        this.packId = packId;
        return this;
    }

    public PackItem sequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public PackItem skuId(String skuId) {
        this.skuId = skuId;
        return this;
    }

    public PackItem quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public PackItem createDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
        return this;
    }

    public PackItem lastUpdateDateTime(Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    public PackItem lastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
        return this;
    }

    public PackItem sku(SKU sku) {
        this.sku = sku;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PackItem)) {
            return false;
        }
        PackItem packItem = (PackItem) o;
        return Objects.equals(packId, packItem.packId) && Objects.equals(sequenceNumber, packItem.sequenceNumber) && Objects.equals(skuId, packItem.skuId) && Objects.equals(quantity, packItem.quantity) && Objects.equals(createDateTime, packItem.createDateTime) && Objects.equals(lastUpdateDateTime, packItem.lastUpdateDateTime) && Objects.equals(lastUpdateId, packItem.lastUpdateId) && Objects.equals(sku, packItem.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packId, sequenceNumber, skuId, quantity, createDateTime, lastUpdateDateTime, lastUpdateId, sku);
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }


}