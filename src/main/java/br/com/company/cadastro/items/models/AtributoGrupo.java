package br.com.company.cadastro.items.models;

import java.io.Serializable;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AtributoGrupo implements Serializable {
    

    /**
     *
     */
    private static final long serialVersionUID = 5341904029599909763L;
    
    private Long groupId;
    private String storageColName;


    public AtributoGrupo() {
    }

    public AtributoGrupo(Long groupId, String storageColName) {
        this.groupId = groupId;
        this.storageColName = storageColName;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getStorageColName() {
        return this.storageColName;
    }

    public void setStorageColName(String storageColName) {
        this.storageColName = storageColName;
    }

    public AtributoGrupo groupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    public AtributoGrupo storageColName(String storageColName) {
        this.storageColName = storageColName;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AtributoGrupo)) {
            return false;
        }
        AtributoGrupo atributoGrupo = (AtributoGrupo) o;
        return Objects.equals(groupId, atributoGrupo.groupId) && Objects.equals(storageColName, atributoGrupo.storageColName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, storageColName);
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
    
}