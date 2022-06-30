package br.com.company.cadastro.items.models;

import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ItemParent extends ItemMaster {

    /**
     *
     */
    private static final long serialVersionUID = 8635367798671241080L;

    private DiffGroupHead color;
    private DiffGroupHead size;
    private String subClassName;
    private String className;
    private String deptName;
    private Integer groupId;
    private String groupName;
    private Integer divisionId;
    private String divisionName;

    public ItemParent() {
    }

    public ItemParent(DiffGroupHead color, DiffGroupHead size, String subClassName, String className, String deptName, Integer groupId, String groupName, Integer divisionId, String divisionName) {
        this.color = color;
        this.size = size;
        this.subClassName = subClassName;
        this.className = className;
        this.deptName = deptName;
        this.groupId = groupId;
        this.groupName = groupName;
        this.divisionId = divisionId;
        this.divisionName = divisionName;
    }

    public DiffGroupHead getColor() {
        return this.color;
    }

    public void setColor(DiffGroupHead color) {
        this.color = color;
    }

    public DiffGroupHead getSize() {
        return this.size;
    }

    public void setSize(DiffGroupHead size) {
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

    public ItemParent color(DiffGroupHead color) {
        this.color = color;
        return this;
    }

    public ItemParent size(DiffGroupHead size) {
        this.size = size;
        return this;
    }

    public ItemParent subClassName(String subClassName) {
        this.subClassName = subClassName;
        return this;
    }

    public ItemParent className(String className) {
        this.className = className;
        return this;
    }

    public ItemParent deptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    public ItemParent groupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    public ItemParent groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public ItemParent divisionId(Integer divisionId) {
        this.divisionId = divisionId;
        return this;
    }

    public ItemParent divisionName(String divisionName) {
        this.divisionName = divisionName;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ItemParent)) {
            return false;
        }
        ItemParent itemParent = (ItemParent) o;
        return Objects.equals(color, itemParent.color) && Objects.equals(size, itemParent.size) && Objects.equals(subClassName, itemParent.subClassName) && Objects.equals(className, itemParent.className) && Objects.equals(deptName, itemParent.deptName) && Objects.equals(groupId, itemParent.groupId) && Objects.equals(groupName, itemParent.groupName) && Objects.equals(divisionId, itemParent.divisionId) && Objects.equals(divisionName, itemParent.divisionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, size, subClassName, className, deptName, groupId, groupName, divisionId, divisionName);
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}