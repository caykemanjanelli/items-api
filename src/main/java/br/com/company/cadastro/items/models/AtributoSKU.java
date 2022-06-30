package br.com.company.cadastro.items.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AtributoSKU implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1322357478608994151L;

    private long atributoId;
    private String atributo;
    
    private Long groupId;
    private String idItemLista;
	private String nomeLista;
	private String tipo; // Tipo do atributo (CB = Combo/ LI = Lista / )
	private String dataType;

    private Integer loja;

    private String valorTexto;
    private BigDecimal valorNumber;
    private Date valorData;


    public AtributoSKU() {
    }

    public AtributoSKU(long atributoId, String atributo, Long groupId, String idItemLista, String nomeLista, String tipo, String dataType, Integer loja, String valorTexto, BigDecimal valorNumber, Date valorData) {
        this.atributoId = atributoId;
        this.atributo = atributo;
        this.groupId = groupId;
        this.idItemLista = idItemLista;
        this.nomeLista = nomeLista;
        this.tipo = tipo;
        this.dataType = dataType;
        this.loja = loja;
        this.valorTexto = valorTexto;
        this.valorNumber = valorNumber;
        this.valorData = valorData;
    }

    public long getAtributoId() {
        return this.atributoId;
    }

    public void setAtributoId(long atributoId) {
        this.atributoId = atributoId;
    }

    public String getAtributo() {
        return this.atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getIdItemLista() {
        return this.idItemLista;
    }

    public void setIdItemLista(String idItemLista) {
        this.idItemLista = idItemLista;
    }

    public String getNomeLista() {
        return this.nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getLoja() {
        return this.loja;
    }

    public void setLoja(Integer loja) {
        this.loja = loja;
    }

    public String getValorTexto() {
        return this.valorTexto;
    }

    public void setValorTexto(String valorTexto) {
        this.valorTexto = valorTexto;
    }

    public BigDecimal getValorNumber() {
        return this.valorNumber;
    }

    public void setValorNumber(BigDecimal valorNumber) {
        this.valorNumber = valorNumber;
    }

    public Date getValorData() {
        return this.valorData;
    }

    public void setValorData(Date valorData) {
        this.valorData = valorData;
    }

    public AtributoSKU atributoId(long atributoId) {
        setAtributoId(atributoId);
        return this;
    }

    public AtributoSKU atributo(String atributo) {
        setAtributo(atributo);
        return this;
    }

    public AtributoSKU groupId(Long groupId) {
        setGroupId(groupId);
        return this;
    }

    public AtributoSKU idItemLista(String idItemLista) {
        setIdItemLista(idItemLista);
        return this;
    }

    public AtributoSKU nomeLista(String nomeLista) {
        setNomeLista(nomeLista);
        return this;
    }

    public AtributoSKU tipo(String tipo) {
        setTipo(tipo);
        return this;
    }

    public AtributoSKU dataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    public AtributoSKU loja(Integer loja) {
        setLoja(loja);
        return this;
    }

    public AtributoSKU valorTexto(String valorTexto) {
        setValorTexto(valorTexto);
        return this;
    }

    public AtributoSKU valorNumber(BigDecimal valorNumber) {
        setValorNumber(valorNumber);
        return this;
    }

    public AtributoSKU valorData(Date valorData) {
        setValorData(valorData);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AtributoSKU)) {
            return false;
        }
        AtributoSKU atributoSKU = (AtributoSKU) o;
        return atributoId == atributoSKU.atributoId && Objects.equals(atributo, atributoSKU.atributo) && Objects.equals(groupId, atributoSKU.groupId) && Objects.equals(idItemLista, atributoSKU.idItemLista) && Objects.equals(nomeLista, atributoSKU.nomeLista) && Objects.equals(tipo, atributoSKU.tipo) && Objects.equals(dataType, atributoSKU.dataType) && Objects.equals(loja, atributoSKU.loja) && Objects.equals(valorTexto, atributoSKU.valorTexto) && Objects.equals(valorNumber, atributoSKU.valorNumber) && Objects.equals(valorData, atributoSKU.valorData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atributoId, atributo, groupId, idItemLista, nomeLista, tipo, dataType, loja, valorTexto, valorNumber, valorData);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }    
}