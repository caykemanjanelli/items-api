package br.com.company.cadastro.items.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Atributo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8726632595108914581L;
    private Long item;
    private Long  group_id;
    private String varchar2_1;
    private String varchar2_2;
    private String varchar2_3;
    private String varchar2_4;
    private String varchar2_5;
    private String varchar2_6;
    private String varchar2_7;
    private String varchar2_8;
    private String varchar2_9;
    private String varchar2_10;
    private BigDecimal  number_11;
    private BigDecimal  number_12;
    private BigDecimal  number_13;
    private BigDecimal  number_14;
    private BigDecimal  number_15;
    private BigDecimal  number_16;
    private BigDecimal  number_17;
    private BigDecimal  number_18;
    private BigDecimal  number_19;
    private BigDecimal  number_20;
    private Date date_21;
    private Date date_22;


    public Atributo() {
    }

    public Atributo(Long item, Long group_id, String varchar2_1, String varchar2_2, String varchar2_3, String varchar2_4, String varchar2_5, String varchar2_6, String varchar2_7, String varchar2_8, String varchar2_9, String varchar2_10, BigDecimal number_11, BigDecimal number_12, BigDecimal number_13, BigDecimal number_14, BigDecimal number_15, BigDecimal number_16, BigDecimal number_17, BigDecimal number_18, BigDecimal number_19, BigDecimal number_20, Date date_21, Date date_22) {
        this.item = item;
        this.group_id = group_id;
        this.varchar2_1 = varchar2_1;
        this.varchar2_2 = varchar2_2;
        this.varchar2_3 = varchar2_3;
        this.varchar2_4 = varchar2_4;
        this.varchar2_5 = varchar2_5;
        this.varchar2_6 = varchar2_6;
        this.varchar2_7 = varchar2_7;
        this.varchar2_8 = varchar2_8;
        this.varchar2_9 = varchar2_9;
        this.varchar2_10 = varchar2_10;
        this.number_11 = number_11;
        this.number_12 = number_12;
        this.number_13 = number_13;
        this.number_14 = number_14;
        this.number_15 = number_15;
        this.number_16 = number_16;
        this.number_17 = number_17;
        this.number_18 = number_18;
        this.number_19 = number_19;
        this.number_20 = number_20;
        this.date_21 = date_21;
        this.date_22 = date_22;
    }

    public Long getItem() {
        return this.item;
    }

    public void setItem(Long item) {
        this.item = item;
    }

    public Long getGroup_id() {
        return this.group_id;
    }

    public void setGroup_id(Long group_id) {
        this.group_id = group_id;
    }

    public String getVarchar2_1() {
        return this.varchar2_1;
    }

    public void setVarchar2_1(String varchar2_1) {
        this.varchar2_1 = varchar2_1;
    }

    public String getVarchar2_2() {
        return this.varchar2_2;
    }

    public void setVarchar2_2(String varchar2_2) {
        this.varchar2_2 = varchar2_2;
    }

    public String getVarchar2_3() {
        return this.varchar2_3;
    }

    public void setVarchar2_3(String varchar2_3) {
        this.varchar2_3 = varchar2_3;
    }

    public String getVarchar2_4() {
        return this.varchar2_4;
    }

    public void setVarchar2_4(String varchar2_4) {
        this.varchar2_4 = varchar2_4;
    }

    public String getVarchar2_5() {
        return this.varchar2_5;
    }

    public void setVarchar2_5(String varchar2_5) {
        this.varchar2_5 = varchar2_5;
    }

    public String getVarchar2_6() {
        return this.varchar2_6;
    }

    public void setVarchar2_6(String varchar2_6) {
        this.varchar2_6 = varchar2_6;
    }

    public String getVarchar2_7() {
        return this.varchar2_7;
    }

    public void setVarchar2_7(String varchar2_7) {
        this.varchar2_7 = varchar2_7;
    }

    public String getVarchar2_8() {
        return this.varchar2_8;
    }

    public void setVarchar2_8(String varchar2_8) {
        this.varchar2_8 = varchar2_8;
    }

    public String getVarchar2_9() {
        return this.varchar2_9;
    }

    public void setVarchar2_9(String varchar2_9) {
        this.varchar2_9 = varchar2_9;
    }

    public String getVarchar2_10() {
        return this.varchar2_10;
    }

    public void setVarchar2_10(String varchar2_10) {
        this.varchar2_10 = varchar2_10;
    }

    public BigDecimal getNumber_11() {
        return this.number_11;
    }

    public void setNumber_11(BigDecimal number_11) {
        this.number_11 = number_11;
    }

    public BigDecimal getNumber_12() {
        return this.number_12;
    }

    public void setNumber_12(BigDecimal number_12) {
        this.number_12 = number_12;
    }

    public BigDecimal getNumber_13() {
        return this.number_13;
    }

    public void setNumber_13(BigDecimal number_13) {
        this.number_13 = number_13;
    }

    public BigDecimal getNumber_14() {
        return this.number_14;
    }

    public void setNumber_14(BigDecimal number_14) {
        this.number_14 = number_14;
    }

    public BigDecimal getNumber_15() {
        return this.number_15;
    }

    public void setNumber_15(BigDecimal number_15) {
        this.number_15 = number_15;
    }

    public BigDecimal getNumber_16() {
        return this.number_16;
    }

    public void setNumber_16(BigDecimal number_16) {
        this.number_16 = number_16;
    }

    public BigDecimal getNumber_17() {
        return this.number_17;
    }

    public void setNumber_17(BigDecimal number_17) {
        this.number_17 = number_17;
    }

    public BigDecimal getNumber_18() {
        return this.number_18;
    }

    public void setNumber_18(BigDecimal number_18) {
        this.number_18 = number_18;
    }

    public BigDecimal getNumber_19() {
        return this.number_19;
    }

    public void setNumber_19(BigDecimal number_19) {
        this.number_19 = number_19;
    }

    public BigDecimal getNumber_20() {
        return this.number_20;
    }

    public void setNumber_20(BigDecimal number_20) {
        this.number_20 = number_20;
    }

    public Date getDate_21() {
        return this.date_21;
    }

    public void setDate_21(Date date_21) {
        this.date_21 = date_21;
    }

    public Date getDate_22() {
        return this.date_22;
    }

    public void setDate_22(Date date_22) {
        this.date_22 = date_22;
    }

    public Atributo item(Long item) {
        this.item = item;
        return this;
    }

    public Atributo group_id(Long group_id) {
        this.group_id = group_id;
        return this;
    }

    public Atributo varchar2_1(String varchar2_1) {
        this.varchar2_1 = varchar2_1;
        return this;
    }

    public Atributo varchar2_2(String varchar2_2) {
        this.varchar2_2 = varchar2_2;
        return this;
    }

    public Atributo varchar2_3(String varchar2_3) {
        this.varchar2_3 = varchar2_3;
        return this;
    }

    public Atributo varchar2_4(String varchar2_4) {
        this.varchar2_4 = varchar2_4;
        return this;
    }

    public Atributo varchar2_5(String varchar2_5) {
        this.varchar2_5 = varchar2_5;
        return this;
    }

    public Atributo varchar2_6(String varchar2_6) {
        this.varchar2_6 = varchar2_6;
        return this;
    }

    public Atributo varchar2_7(String varchar2_7) {
        this.varchar2_7 = varchar2_7;
        return this;
    }

    public Atributo varchar2_8(String varchar2_8) {
        this.varchar2_8 = varchar2_8;
        return this;
    }

    public Atributo varchar2_9(String varchar2_9) {
        this.varchar2_9 = varchar2_9;
        return this;
    }

    public Atributo varchar2_10(String varchar2_10) {
        this.varchar2_10 = varchar2_10;
        return this;
    }

    public Atributo number_11(BigDecimal number_11) {
        this.number_11 = number_11;
        return this;
    }

    public Atributo number_12(BigDecimal number_12) {
        this.number_12 = number_12;
        return this;
    }

    public Atributo number_13(BigDecimal number_13) {
        this.number_13 = number_13;
        return this;
    }

    public Atributo number_14(BigDecimal number_14) {
        this.number_14 = number_14;
        return this;
    }

    public Atributo number_15(BigDecimal number_15) {
        this.number_15 = number_15;
        return this;
    }

    public Atributo number_16(BigDecimal number_16) {
        this.number_16 = number_16;
        return this;
    }

    public Atributo number_17(BigDecimal number_17) {
        this.number_17 = number_17;
        return this;
    }

    public Atributo number_18(BigDecimal number_18) {
        this.number_18 = number_18;
        return this;
    }

    public Atributo number_19(BigDecimal number_19) {
        this.number_19 = number_19;
        return this;
    }

    public Atributo number_20(BigDecimal number_20) {
        this.number_20 = number_20;
        return this;
    }

    public Atributo date_21(Date date_21) {
        this.date_21 = date_21;
        return this;
    }

    public Atributo date_22(Date date_22) {
        this.date_22 = date_22;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Atributo)) {
            return false;
        }
        Atributo atributo = (Atributo) o;
        return Objects.equals(item, atributo.item) && Objects.equals(group_id, atributo.group_id) && Objects.equals(varchar2_1, atributo.varchar2_1) && Objects.equals(varchar2_2, atributo.varchar2_2) && Objects.equals(varchar2_3, atributo.varchar2_3) && Objects.equals(varchar2_4, atributo.varchar2_4) && Objects.equals(varchar2_5, atributo.varchar2_5) && Objects.equals(varchar2_6, atributo.varchar2_6) && Objects.equals(varchar2_7, atributo.varchar2_7) && Objects.equals(varchar2_8, atributo.varchar2_8) && Objects.equals(varchar2_9, atributo.varchar2_9) && Objects.equals(varchar2_10, atributo.varchar2_10) && Objects.equals(number_11, atributo.number_11) && Objects.equals(number_12, atributo.number_12) && Objects.equals(number_13, atributo.number_13) && Objects.equals(number_14, atributo.number_14) && Objects.equals(number_15, atributo.number_15) && Objects.equals(number_16, atributo.number_16) && Objects.equals(number_17, atributo.number_17) && Objects.equals(number_18, atributo.number_18) && Objects.equals(number_19, atributo.number_19) && Objects.equals(number_20, atributo.number_20) && Objects.equals(date_21, atributo.date_21) && Objects.equals(date_22, atributo.date_22);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, group_id, varchar2_1, varchar2_2, varchar2_3, varchar2_4, varchar2_5, varchar2_6, varchar2_7, varchar2_8, varchar2_9, varchar2_10, number_11, number_12, number_13, number_14, number_15, number_16, number_17, number_18, number_19, number_20, date_21, date_22);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}