package br.com.company.cadastro.items.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DiffGroupDetail implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -8963857241637166333L;

    private String id;
    private String diffGroupId;
    private Integer displaySequence;
    private Date createDateTime;
    private String lastUpdateId;
    private Date lastUpdateDateTime;


    public DiffGroupDetail() {
    }

    public DiffGroupDetail(String id, String diffGroupId, Integer displaySequence, Date createDateTime, String lastUpdateId, Date lastUpdateDateTime) {
        this.id = id;
        this.diffGroupId = diffGroupId;
        this.displaySequence = displaySequence;
        this.createDateTime = createDateTime;
        this.lastUpdateId = lastUpdateId;
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDiffGroupId() {
        return this.diffGroupId;
    }

    public void setDiffGroupId(String diffGroupId) {
        this.diffGroupId = diffGroupId;
    }

    public Integer getDisplaySequence() {
        return this.displaySequence;
    }

    public void setDisplaySequence(Integer displaySequence) {
        this.displaySequence = displaySequence;
    }

    public Date getCreateDateTime() {
        return this.createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
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

    public DiffGroupDetail id(String id) {
        this.id = id;
        return this;
    }

    public DiffGroupDetail diffGroupId(String diffGroupId) {
        this.diffGroupId = diffGroupId;
        return this;
    }

    public DiffGroupDetail displaySequence(Integer displaySequence) {
        this.displaySequence = displaySequence;
        return this;
    }

    public DiffGroupDetail createDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
        return this;
    }

    public DiffGroupDetail lastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
        return this;
    }

    public DiffGroupDetail lastUpdateDateTime(Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DiffGroupDetail)) {
            return false;
        }
        DiffGroupDetail diffGroupDetail = (DiffGroupDetail) o;
        return Objects.equals(id, diffGroupDetail.id) && Objects.equals(diffGroupId, diffGroupDetail.diffGroupId) && Objects.equals(displaySequence, diffGroupDetail.displaySequence) && Objects.equals(createDateTime, diffGroupDetail.createDateTime) && Objects.equals(lastUpdateId, diffGroupDetail.lastUpdateId) && Objects.equals(lastUpdateDateTime, diffGroupDetail.lastUpdateDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, diffGroupId, displaySequence, createDateTime, lastUpdateId, lastUpdateDateTime);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}