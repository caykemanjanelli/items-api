package br.com.company.cadastro.items.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DiffId implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 2516597940298213942L;

    private String id;
    private String diffTypeId;
    private String description;
    private String industryCode;
    private String industrySubgroup;
    private Date createDateTime;
    private String lastUpdateId;
    private Date lastUpdateDateTime;


    public DiffId() {
    }

    public DiffId(String id, String diffTypeId, String description, String industryCode, String industrySubgroup, Date createDateTime, String lastUpdateId, Date lastUpdateDateTime) {
        this.id = id;
        this.diffTypeId = diffTypeId;
        this.description = description;
        this.industryCode = industryCode;
        this.industrySubgroup = industrySubgroup;
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

    public String getIndustryCode() {
        return this.industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    public String getIndustrySubgroup() {
        return this.industrySubgroup;
    }

    public void setIndustrySubgroup(String industrySubgroup) {
        this.industrySubgroup = industrySubgroup;
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

    public DiffId id(String id) {
        this.id = id;
        return this;
    }

    public DiffId diffTypeId(String diffTypeId) {
        this.diffTypeId = diffTypeId;
        return this;
    }

    public DiffId description(String description) {
        this.description = description;
        return this;
    }

    public DiffId industryCode(String industryCode) {
        this.industryCode = industryCode;
        return this;
    }

    public DiffId industrySubgroup(String industrySubgroup) {
        this.industrySubgroup = industrySubgroup;
        return this;
    }

    public DiffId createDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
        return this;
    }

    public DiffId lastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
        return this;
    }

    public DiffId lastUpdateDateTime(Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DiffId)) {
            return false;
        }
        DiffId diffId = (DiffId) o;
        return Objects.equals(id, diffId.id) && Objects.equals(diffTypeId, diffId.diffTypeId) && Objects.equals(description, diffId.description) && Objects.equals(industryCode, diffId.industryCode) && Objects.equals(industrySubgroup, diffId.industrySubgroup) && Objects.equals(createDateTime, diffId.createDateTime) && Objects.equals(lastUpdateId, diffId.lastUpdateId) && Objects.equals(lastUpdateDateTime, diffId.lastUpdateDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, diffTypeId, description, industryCode, industrySubgroup, createDateTime, lastUpdateId, lastUpdateDateTime);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }


}