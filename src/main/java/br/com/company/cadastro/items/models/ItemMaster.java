package br.com.company.cadastro.items.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public abstract class ItemMaster implements Serializable{


    public static final String ITEM_MASTER_BASE_SQL = 
    "SELECT im.item as \"id\", \n" + 
    "       im.ITEM_NUMBER_TYPE as \"itemNumberType\", \n" + 
    "       im.FORMAT_ID as \"formatId\", \n" + 
    "       im.PREFIX as \" prefix\", \n" + 
    "       im.DEPT AS \"deptId\", \n" + 
    "       im.CLASS AS \"classId\", \n" + 
    "       im.SUBCLASS AS \"subClassId\", \n" + 
    "       im.STATUS as \"status\", \n" + 
    "       im.ITEM_DESC as \"description\", \n" + 
    "       im.ITEM_DESC_SECONDARY as \"secondDescription\", \n" + 
    "       im.SHORT_DESC as \"shortDescription\", \n" + 
    "       im.DESC_UP as \"upDescription\", \n" + 
    "       im.PRIMARY_REF_ITEM_IND as \"primaryRefItemInd\", \n" + 
    "       im.RETAIL_ZONE_GROUP_ID as \" retailZoneGroupId\", \n" + 
    "       im.COST_ZONE_GROUP_ID as \" costZoneGroupId\", \n" + 
    "       im.STANDARD_UOM  as \"standardUOM\", \n" + 
    "       im.CREATE_DATETIME as \" createdDateTime\", \n" + 
    "       im.LAST_UPDATE_ID as \"lastUpdateId\", \n" + 
    "       im.LAST_UPDATE_DATETIME as \" lastUpdateDateTime\", \n" + 
    "       im.SELLABLE_IND as \"sellableIndicator\", \n" + 
    "       im.ORDERABLE_IND as \"orderableIndicator\", \n" + 
    "       im.DIFF_1 as \"diff01\", \n" + 
    "       im.DIFF_2 as \"diff02\", \n" ; 

    /**
     *
     */
    private static final long serialVersionUID = 1322554318994535916L;

    private String id;
    private String itemNumberType;
    private String formatId;
    private Long prefix;
    private Integer deptId;
    private Integer classId;
    private Integer subClassId;
    private String status;
    private String description;
    private String secondDescription;
    private String shortDescription;
    private String upDescription;
    private String primaryRefItemInd;
    private Long retailZoneGroupId;
    private Long costZoneGroupId;
    private String standardUOM;
    private Date createdDateTime;
    private String lastUpdateId;
    private Date lastUpdateDateTime;
    private String sellableIndicator;
    private String orderableIndicator;
    private String diff01;
    private String diff02;

    public ItemMaster() {
    }

    public ItemMaster(String id, String itemNumberType, String formatId, Long prefix, Integer deptId, Integer classId, Integer subClassId, String status, String description, String secondDescription, String shortDescription, String upDescription, String primaryRefItemInd, Long retailZoneGroupId, Long costZoneGroupId, String standardUOM, Date createdDateTime, String lastUpdateId, Date lastUpdateDateTime, String sellableIndicator, String orderableIndicator, String diff01, String diff02) {
        this.id = id;
        this.itemNumberType = itemNumberType;
        this.formatId = formatId;
        this.prefix = prefix;
        this.deptId = deptId;
        this.classId = classId;
        this.subClassId = subClassId;
        this.status = status;
        this.description = description;
        this.secondDescription = secondDescription;
        this.shortDescription = shortDescription;
        this.upDescription = upDescription;
        this.primaryRefItemInd = primaryRefItemInd;
        this.retailZoneGroupId = retailZoneGroupId;
        this.costZoneGroupId = costZoneGroupId;
        this.standardUOM = standardUOM;
        this.createdDateTime = createdDateTime;
        this.lastUpdateId = lastUpdateId;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.sellableIndicator = sellableIndicator;
        this.orderableIndicator = orderableIndicator;
        this.diff01 = diff01;
        this.diff02 = diff02;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemNumberType() {
        return this.itemNumberType;
    }

    public void setItemNumberType(String itemNumberType) {
        this.itemNumberType = itemNumberType;
    }

    public String getFormatId() {
        return this.formatId;
    }

    public void setFormatId(String formatId) {
        this.formatId = formatId;
    }

    public Long getPrefix() {
        return this.prefix;
    }

    public void setPrefix(Long prefix) {
        this.prefix = prefix;
    }

    public Integer getDeptId() {
        return this.deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getClassId() {
        return this.classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getSubClassId() {
        return this.subClassId;
    }

    public void setSubClassId(Integer subClassId) {
        this.subClassId = subClassId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSecondDescription() {
        return this.secondDescription;
    }

    public void setSecondDescription(String secondDescription) {
        this.secondDescription = secondDescription;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getUpDescription() {
        return this.upDescription;
    }

    public void setUpDescription(String upDescription) {
        this.upDescription = upDescription;
    }

    public String getPrimaryRefItemInd() {
        return this.primaryRefItemInd;
    }

    public void setPrimaryRefItemInd(String primaryRefItemInd) {
        this.primaryRefItemInd = primaryRefItemInd;
    }

    public Long getRetailZoneGroupId() {
        return this.retailZoneGroupId;
    }

    public void setRetailZoneGroupId(Long retailZoneGroupId) {
        this.retailZoneGroupId = retailZoneGroupId;
    }

    public Long getCostZoneGroupId() {
        return this.costZoneGroupId;
    }

    public void setCostZoneGroupId(Long costZoneGroupId) {
        this.costZoneGroupId = costZoneGroupId;
    }

    public String getStandardUOM() {
        return this.standardUOM;
    }

    public void setStandardUOM(String standardUOM) {
        this.standardUOM = standardUOM;
    }

    public Date getCreatedDateTime() {
        return this.createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getLastUpdateId() {
        return this.lastUpdateId;
    }

    public void setLastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
    }

    public Date getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }

    public void setLastUpdateDateTime(Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public String getSellableIndicator() {
        return this.sellableIndicator;
    }

    public void setSellableIndicator(String sellableIndicator) {
        this.sellableIndicator = sellableIndicator;
    }

    public String getOrderableIndicator() {
        return this.orderableIndicator;
    }

    public void setOrderableIndicator(String orderableIndicator) {
        this.orderableIndicator = orderableIndicator;
    }

    public String getDiff01() {
        return this.diff01;
    }

    public void setDiff01(String diff01) {
        this.diff01 = diff01;
    }

    public String getDiff02() {
        return this.diff02;
    }

    public void setDiff02(String diff02) {
        this.diff02 = diff02;
    }

    public ItemMaster id(String id) {
        this.id = id;
        return this;
    }

    public ItemMaster itemNumberType(String itemNumberType) {
        this.itemNumberType = itemNumberType;
        return this;
    }

    public ItemMaster formatId(String formatId) {
        this.formatId = formatId;
        return this;
    }

    public ItemMaster prefix(Long prefix) {
        this.prefix = prefix;
        return this;
    }

    public ItemMaster deptId(Integer deptId) {
        this.deptId = deptId;
        return this;
    }

    public ItemMaster classId(Integer classId) {
        this.classId = classId;
        return this;
    }

    public ItemMaster subClassId(Integer subClassId) {
        this.subClassId = subClassId;
        return this;
    }

    public ItemMaster status(String status) {
        this.status = status;
        return this;
    }

    public ItemMaster description(String description) {
        this.description = description;
        return this;
    }

    public ItemMaster secondDescription(String secondDescription) {
        this.secondDescription = secondDescription;
        return this;
    }

    public ItemMaster shortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public ItemMaster upDescription(String upDescription) {
        this.upDescription = upDescription;
        return this;
    }

    public ItemMaster primaryRefItemInd(String primaryRefItemInd) {
        this.primaryRefItemInd = primaryRefItemInd;
        return this;
    }

    public ItemMaster retailZoneGroupId(Long retailZoneGroupId) {
        this.retailZoneGroupId = retailZoneGroupId;
        return this;
    }

    public ItemMaster costZoneGroupId(Long costZoneGroupId) {
        this.costZoneGroupId = costZoneGroupId;
        return this;
    }

    public ItemMaster standardUOM(String standardUOM) {
        this.standardUOM = standardUOM;
        return this;
    }

    public ItemMaster createdDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    public ItemMaster lastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
        return this;
    }

    public ItemMaster lastUpdateDateTime(Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    public ItemMaster sellableIndicator(String sellableIndicator) {
        this.sellableIndicator = sellableIndicator;
        return this;
    }

    public ItemMaster orderableIndicator(String orderableIndicator) {
        this.orderableIndicator = orderableIndicator;
        return this;
    }

    public ItemMaster diff01(String diff01) {
        this.diff01 = diff01;
        return this;
    }

    public ItemMaster diff02(String diff02) {
        this.diff02 = diff02;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ItemMaster)) {
            return false;
        }
        ItemMaster itemMaster = (ItemMaster) o;
        return Objects.equals(id, itemMaster.id) && Objects.equals(itemNumberType, itemMaster.itemNumberType) && Objects.equals(formatId, itemMaster.formatId) && Objects.equals(prefix, itemMaster.prefix) && Objects.equals(deptId, itemMaster.deptId) && Objects.equals(classId, itemMaster.classId) && Objects.equals(subClassId, itemMaster.subClassId) && Objects.equals(status, itemMaster.status) && Objects.equals(description, itemMaster.description) && Objects.equals(secondDescription, itemMaster.secondDescription) && Objects.equals(shortDescription, itemMaster.shortDescription) && Objects.equals(upDescription, itemMaster.upDescription) && Objects.equals(primaryRefItemInd, itemMaster.primaryRefItemInd) && Objects.equals(retailZoneGroupId, itemMaster.retailZoneGroupId) && Objects.equals(costZoneGroupId, itemMaster.costZoneGroupId) && Objects.equals(standardUOM, itemMaster.standardUOM) && Objects.equals(createdDateTime, itemMaster.createdDateTime) && Objects.equals(lastUpdateId, itemMaster.lastUpdateId) && Objects.equals(lastUpdateDateTime, itemMaster.lastUpdateDateTime) && Objects.equals(sellableIndicator, itemMaster.sellableIndicator) && Objects.equals(orderableIndicator, itemMaster.orderableIndicator) && Objects.equals(diff01, itemMaster.diff01) && Objects.equals(diff02, itemMaster.diff02);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, itemNumberType, formatId, prefix, deptId, classId, subClassId, status, description, secondDescription, shortDescription, upDescription, primaryRefItemInd, retailZoneGroupId, costZoneGroupId, standardUOM, createdDateTime, lastUpdateId, lastUpdateDateTime, sellableIndicator, orderableIndicator, diff01, diff02);
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}