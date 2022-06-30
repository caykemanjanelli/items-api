package br.com.company.cadastro.items.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DiffGroupHead implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -505841100084884652L;

    private String id;
    private String diffTypeId;
    private String description;
    private Date createDateTime;
    private String lastUpdateId;
    private Date lastUpdateDateTime;
    private DiffType diffType;
    private List<DiffGroupDetail> details;


    public DiffGroupHead() {
    }

    public DiffGroupHead(String id, String diffTypeId, String description, Date createDateTime, String lastUpdateId, Date lastUpdateDateTime, DiffType diffType, List<DiffGroupDetail> details) {
        this.id = id;
        this.diffTypeId = diffTypeId;
        this.description = description;
        this.createDateTime = createDateTime;
        this.lastUpdateId = lastUpdateId;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.diffType = diffType;
        this.details = details;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDiffTypeId() {
        return this.diffTypeId;
    }

    public void setDiffTypeId(String diffTypeId) {
        this.diffTypeId = diffTypeId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public DiffType getDiffType() {
        return this.diffType;
    }

    public void setDiffType(DiffType diffType) {
        this.diffType = diffType;
    }

    public List<DiffGroupDetail> getDetails() {
        return this.details;
    }

    public void setDetails(List<DiffGroupDetail> details) {
        this.details = details;
    }

    public DiffGroupHead id(String id) {
        this.id = id;
        return this;
    }

    public DiffGroupHead diffTypeId(String diffTypeId) {
        this.diffTypeId = diffTypeId;
        return this;
    }

    public DiffGroupHead description(String description) {
        this.description = description;
        return this;
    }

    public DiffGroupHead createDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
        return this;
    }

    public DiffGroupHead lastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
        return this;
    }

    public DiffGroupHead lastUpdateDateTime(Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    public DiffGroupHead diffType(DiffType diffType) {
        this.diffType = diffType;
        return this;
    }

    public DiffGroupHead details(List<DiffGroupDetail> details) {
        this.details = details;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DiffGroupHead)) {
            return false;
        }
        DiffGroupHead diffGroupHead = (DiffGroupHead) o;
        return Objects.equals(id, diffGroupHead.id) && Objects.equals(diffTypeId, diffGroupHead.diffTypeId) && Objects.equals(description, diffGroupHead.description) && Objects.equals(createDateTime, diffGroupHead.createDateTime) && Objects.equals(lastUpdateId, diffGroupHead.lastUpdateId) && Objects.equals(lastUpdateDateTime, diffGroupHead.lastUpdateDateTime) && Objects.equals(diffType, diffGroupHead.diffType) && Objects.equals(details, diffGroupHead.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, diffTypeId, description, createDateTime, lastUpdateId, lastUpdateDateTime, diffType, details);
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }


}