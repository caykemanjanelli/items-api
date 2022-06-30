package br.com.company.cadastro.items.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlexField implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -6041241256752626284L;
    private Long attribId;
	private Long groupId;
	private String groupViewName;
	private String groupLabel;
	private String attribColName;
	private String attribLabel;
	private String storageColName;
	private Long displaySeq;
	private String dataType;
	private String uiWidget;
	private Long recGroupId;
	private String codeType;
	private String codeTypeDesc;
	private String enableId;
	private String valueReq;
	private Long maximumLength;
	private Long lowestAllowedValue;
	private Long highhestAllowedValue;
	private String validationFunc;
	private String activeId;
	private String baseInd;
	private String editorReq;
 

    public FlexField() {
    }

    public FlexField(Long attribId, Long groupId, String groupViewName, String groupLabel, String attribColName, String attribLabel, String storageColName, Long displaySeq, String dataType, String uiWidget, Long recGroupId, String codeType, String codeTypeDesc, String enableId, String valueReq, Long maximumLength, Long lowestAllowedValue, Long highhestAllowedValue, String validationFunc, String activeId, String baseInd, String editorReq) {
        this.attribId = attribId;
        this.groupId = groupId;
        this.groupViewName = groupViewName;
        this.groupLabel = groupLabel;
        this.attribColName = attribColName;
        this.attribLabel = attribLabel;
        this.storageColName = storageColName;
        this.displaySeq = displaySeq;
        this.dataType = dataType;
        this.uiWidget = uiWidget;
        this.recGroupId = recGroupId;
        this.codeType = codeType;
        this.codeTypeDesc = codeTypeDesc;
        this.enableId = enableId;
        this.valueReq = valueReq;
        this.maximumLength = maximumLength;
        this.lowestAllowedValue = lowestAllowedValue;
        this.highhestAllowedValue = highhestAllowedValue;
        this.validationFunc = validationFunc;
        this.activeId = activeId;
        this.baseInd = baseInd;
        this.editorReq = editorReq;
    }

    public Long getAttribId() {
        return this.attribId;
    }

    public void setAttribId(Long attribId) {
        this.attribId = attribId;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupViewName() {
        return this.groupViewName;
    }

    public void setGroupViewName(String groupViewName) {
        this.groupViewName = groupViewName;
    }

    public String getGroupLabel() {
        return this.groupLabel;
    }

    public void setGroupLabel(String groupLabel) {
        this.groupLabel = groupLabel;
    }

    public String getAttribColName() {
        return this.attribColName;
    }

    public void setAttribColName(String attribColName) {
        this.attribColName = attribColName;
    }

    public String getAttribLabel() {
        return this.attribLabel;
    }

    public void setAttribLabel(String attribLabel) {
        this.attribLabel = attribLabel;
    }

    public String getStorageColName() {
        return this.storageColName;
    }

    public void setStorageColName(String storageColName) {
        this.storageColName = storageColName;
    }

    public Long getDisplaySeq() {
        return this.displaySeq;
    }

    public void setDisplaySeq(Long displaySeq) {
        this.displaySeq = displaySeq;
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getUiWidget() {
        return this.uiWidget;
    }

    public void setUiWidget(String uiWidget) {
        this.uiWidget = uiWidget;
    }

    public Long getRecGroupId() {
        return this.recGroupId;
    }

    public void setRecGroupId(Long recGroupId) {
        this.recGroupId = recGroupId;
    }

    public String getCodeType() {
        return this.codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getCodeTypeDesc() {
        return this.codeTypeDesc;
    }

    public void setCodeTypeDesc(String codeTypeDesc) {
        this.codeTypeDesc = codeTypeDesc;
    }

    public String getEnableId() {
        return this.enableId;
    }

    public void setEnableId(String enableId) {
        this.enableId = enableId;
    }

    public String getValueReq() {
        return this.valueReq;
    }

    public void setValueReq(String valueReq) {
        this.valueReq = valueReq;
    }

    public Long getMaximumLength() {
        return this.maximumLength;
    }

    public void setMaximumLength(Long maximumLength) {
        this.maximumLength = maximumLength;
    }

    public Long getLowestAllowedValue() {
        return this.lowestAllowedValue;
    }

    public void setLowestAllowedValue(Long lowestAllowedValue) {
        this.lowestAllowedValue = lowestAllowedValue;
    }

    public Long getHighhestAllowedValue() {
        return this.highhestAllowedValue;
    }

    public void setHighhestAllowedValue(Long highhestAllowedValue) {
        this.highhestAllowedValue = highhestAllowedValue;
    }

    public String getValidationFunc() {
        return this.validationFunc;
    }

    public void setValidationFunc(String validationFunc) {
        this.validationFunc = validationFunc;
    }

    public String getActiveId() {
        return this.activeId;
    }

    public void setActiveId(String activeId) {
        this.activeId = activeId;
    }

    public String getBaseInd() {
        return this.baseInd;
    }

    public void setBaseInd(String baseInd) {
        this.baseInd = baseInd;
    }

    public String getEditorReq() {
        return this.editorReq;
    }

    public void setEditorReq(String editorReq) {
        this.editorReq = editorReq;
    }

    public FlexField attribId(Long attribId) {
        this.attribId = attribId;
        return this;
    }

    public FlexField groupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    public FlexField groupViewName(String groupViewName) {
        this.groupViewName = groupViewName;
        return this;
    }

    public FlexField groupLabel(String groupLabel) {
        this.groupLabel = groupLabel;
        return this;
    }

    public FlexField attribColName(String attribColName) {
        this.attribColName = attribColName;
        return this;
    }

    public FlexField attribLabel(String attribLabel) {
        this.attribLabel = attribLabel;
        return this;
    }

    public FlexField storageColName(String storageColName) {
        this.storageColName = storageColName;
        return this;
    }

    public FlexField displaySeq(Long displaySeq) {
        this.displaySeq = displaySeq;
        return this;
    }

    public FlexField dataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    public FlexField uiWidget(String uiWidget) {
        this.uiWidget = uiWidget;
        return this;
    }

    public FlexField recGroupId(Long recGroupId) {
        this.recGroupId = recGroupId;
        return this;
    }

    public FlexField codeType(String codeType) {
        this.codeType = codeType;
        return this;
    }

    public FlexField codeTypeDesc(String codeTypeDesc) {
        this.codeTypeDesc = codeTypeDesc;
        return this;
    }

    public FlexField enableId(String enableId) {
        this.enableId = enableId;
        return this;
    }

    public FlexField valueReq(String valueReq) {
        this.valueReq = valueReq;
        return this;
    }

    public FlexField maximumLength(Long maximumLength) {
        this.maximumLength = maximumLength;
        return this;
    }

    public FlexField lowestAllowedValue(Long lowestAllowedValue) {
        this.lowestAllowedValue = lowestAllowedValue;
        return this;
    }

    public FlexField highhestAllowedValue(Long highhestAllowedValue) {
        this.highhestAllowedValue = highhestAllowedValue;
        return this;
    }

    public FlexField validationFunc(String validationFunc) {
        this.validationFunc = validationFunc;
        return this;
    }

    public FlexField activeId(String activeId) {
        this.activeId = activeId;
        return this;
    }

    public FlexField baseInd(String baseInd) {
        this.baseInd = baseInd;
        return this;
    }

    public FlexField editorReq(String editorReq) {
        this.editorReq = editorReq;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FlexField)) {
            return false;
        }
        FlexField flexField = (FlexField) o;
        return Objects.equals(attribId, flexField.attribId) && Objects.equals(groupId, flexField.groupId) && Objects.equals(groupViewName, flexField.groupViewName) && Objects.equals(groupLabel, flexField.groupLabel) && Objects.equals(attribColName, flexField.attribColName) && Objects.equals(attribLabel, flexField.attribLabel) && Objects.equals(storageColName, flexField.storageColName) && Objects.equals(displaySeq, flexField.displaySeq) && Objects.equals(dataType, flexField.dataType) && Objects.equals(uiWidget, flexField.uiWidget) && Objects.equals(recGroupId, flexField.recGroupId) && Objects.equals(codeType, flexField.codeType) && Objects.equals(codeTypeDesc, flexField.codeTypeDesc) && Objects.equals(enableId, flexField.enableId) && Objects.equals(valueReq, flexField.valueReq) && Objects.equals(maximumLength, flexField.maximumLength) && Objects.equals(lowestAllowedValue, flexField.lowestAllowedValue) && Objects.equals(highhestAllowedValue, flexField.highhestAllowedValue) && Objects.equals(validationFunc, flexField.validationFunc) && Objects.equals(activeId, flexField.activeId) && Objects.equals(baseInd, flexField.baseInd) && Objects.equals(editorReq, flexField.editorReq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attribId, groupId, groupViewName, groupLabel, attribColName, attribLabel, storageColName, displaySeq, dataType, uiWidget, recGroupId, codeType, codeTypeDesc, enableId, valueReq, maximumLength, lowestAllowedValue, highhestAllowedValue, validationFunc, activeId, baseInd, editorReq);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }       
}