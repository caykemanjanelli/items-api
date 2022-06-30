package br.com.company.cadastro.items.models;

import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SKU extends ItemMaster {

    /**
     *
     */
    private static final long serialVersionUID = 5257972882710094466L;
    private String itemParentId;
    private String itemGrandParent;
    private Double originalRetail;
    private DiffId color;
    private DiffId size;
    private String subClassName;
    private String className;
    private String deptName;
    private Integer groupId;
    private String groupName;
    private Integer divisionId;
    private String divisionName;
    private ItemParent itemParent;

    public SKU() {
    }

    

    public String getItemParentId() {
        return this.itemParentId;
    }

    public void setItemParentId(String itemParentId) {
        this.itemParentId = itemParentId;
    }

    public String getItemGrandParent() {
        return this.itemGrandParent;
    }

    public void setItemGrandParent(String itemGrandParent) {
        this.itemGrandParent = itemGrandParent;
    }

    public Double getOriginalRetail() {
        return this.originalRetail;
    }

    public void setOriginalRetail(Double originalRetail) {
        this.originalRetail = originalRetail;
    }

    public DiffId getColor() {
        return this.color;
    }

    public void setColor(DiffId color) {
        this.color = color;
    }

    public DiffId getSize() {
        return this.size;
    }

    public void setSize(DiffId size) {
        this.size = size;
    }

    public String getSubClassName() {
        return this.subClassName;
    }

    public void setSubClassName(String subClassName) {
        this.subClassName = subClassName;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDeptName() {
        return this.deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getDivisionId() {
        return this.divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return this.divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public ItemParent getItemParent() {
        return this.itemParent;
    }

    public void setItemParent(ItemParent itemParent) {
        this.itemParent = itemParent;
    }

    public SKU itemParentId(String itemParentId) {
        setItemParentId(itemParentId);
        return this;
    }

    public SKU itemGrandParent(String itemGrandParent) {
        setItemGrandParent(itemGrandParent);
        return this;
    }

    public SKU originalRetail(Double originalRetail) {
        setOriginalRetail(originalRetail);
        return this;
    }

    public SKU color(DiffId color) {
        setColor(color);
        return this;
    }

    public SKU size(DiffId size) {
        setSize(size);
        return this;
    }

    public SKU subClassName(String subClassName) {
        setSubClassName(subClassName);
        return this;
    }

    public SKU className(String className) {
        setClassName(className);
        return this;
    }

    public SKU deptName(String deptName) {
        setDeptName(deptName);
        return this;
    }

    public SKU groupId(Integer groupId) {
        setGroupId(groupId);
        return this;
    }

    public SKU groupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    public SKU divisionId(Integer divisionId) {
        setDivisionId(divisionId);
        return this;
    }

    public SKU divisionName(String divisionName) {
        setDivisionName(divisionName);
        return this;
    }

    public SKU itemParent(ItemParent itemParent) {
        setItemParent(itemParent);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SKU)) {
            return false;
        }
        SKU sKU = (SKU) o;
        return Objects.equals(itemParentId, sKU.itemParentId) && Objects.equals(itemGrandParent, sKU.itemGrandParent) && Objects.equals(originalRetail, sKU.originalRetail) && Objects.equals(color, sKU.color) && Objects.equals(size, sKU.size) && Objects.equals(subClassName, sKU.subClassName) && Objects.equals(className, sKU.className) && Objects.equals(deptName, sKU.deptName) && Objects.equals(groupId, sKU.groupId) && Objects.equals(groupName, sKU.groupName) && Objects.equals(divisionId, sKU.divisionId) && Objects.equals(divisionName, sKU.divisionName) && Objects.equals(itemParent, sKU.itemParent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemParentId, itemGrandParent, originalRetail, color, size, subClassName, className, deptName, groupId, groupName, divisionId, divisionName, itemParent);
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }


}