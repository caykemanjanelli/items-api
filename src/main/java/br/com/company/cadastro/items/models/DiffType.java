package br.com.company.cadastro.items.models;

import java.io.Serializable;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DiffType implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 5907886317805843944L;
    private String id;
    private String description;

    public DiffType() {
    }

    public DiffType(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DiffType id(String id) {
        this.id = id;
        return this;
    }

    public DiffType description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DiffType)) {
            return false;
        }
        DiffType diffType = (DiffType) o;
        return Objects.equals(id, diffType.id) && Objects.equals(description, diffType.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }



}