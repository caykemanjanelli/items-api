package br.com.company.cadastro.items.models;

import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Pack extends ItemMaster{

    /**
     *
     */
    private static final long serialVersionUID = 4425375856651245994L;

    private List<PackItem> items;


    public Pack() {
    }

    public Pack(List<PackItem> items) {
        this.items = items;
    }

    public List<PackItem> getItems() {
        return this.items;
    }

    public void setItems(List<PackItem> items) {
        this.items = items;
    }

    public Pack items(List<PackItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pack)) {
            return false;
        }
        Pack pack = (Pack) o;
        return Objects.equals(items, pack.items);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(items);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}