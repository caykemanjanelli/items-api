package br.com.company.cadastro.items.payloads;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class StringIds implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -944721169888856620L;

    private List<String> ids;


    public StringIds() {
    }

    public StringIds(List<String> ids) {
        this.ids = ids;
    }

    public List<String> getIds() {
        return this.ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public StringIds ids(List<String> ids) {
        this.ids = ids;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof StringIds)) {
            return false;
        }
        StringIds stringIds = (StringIds) o;
        return Objects.equals(ids, stringIds.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ids);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }


}