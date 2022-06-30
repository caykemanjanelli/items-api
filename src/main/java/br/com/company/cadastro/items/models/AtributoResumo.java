package br.com.company.cadastro.items.models;

import java.io.Serializable;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AtributoResumo implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1322357478608994151L;

    private Long item;
    private Long atributoId;
    private String atributo; // Nome do atributo
    
    private Long groupId; // Grupo do Atributo
    private String idItemLista; //
	private String nomeLista; // Code_type
	private String tipo; // Tipo do atributo (CB = Combo/ LI = Lista / )
	private String dataType; // tipo de coluna
    private String valor;


    public AtributoResumo() {
    }

    public AtributoResumo(Long item, Long atributoId, String atributo, Long groupId, String idItemLista, String nomeLista, String tipo, String dataType, String valor) {
        this.item = item;
        this.atributoId = atributoId;
        this.atributo = atributo;
        this.groupId = groupId;
        this.idItemLista = idItemLista;
        this.nomeLista = nomeLista;
        this.tipo = tipo;
        this.dataType = dataType;
        this.valor = valor;
    }

    public Long getItem() {
        return this.item;
    }

    public void setItem(Long item) {
        this.item = item;
    }

    public Long getAtributoId() {
        return this.atributoId;
    }

    public void setAtributoId(Long atributoId) {
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

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public AtributoResumo item(Long item) {
        setItem(item);
        return this;
    }

    public AtributoResumo atributoId(Long atributoId) {
        setAtributoId(atributoId);
        return this;
    }

    public AtributoResumo atributo(String atributo) {
        setAtributo(atributo);
        return this;
    }

    public AtributoResumo groupId(Long groupId) {
        setGroupId(groupId);
        return this;
    }

    public AtributoResumo idItemLista(String idItemLista) {
        setIdItemLista(idItemLista);
        return this;
    }

    public AtributoResumo nomeLista(String nomeLista) {
        setNomeLista(nomeLista);
        return this;
    }

    public AtributoResumo tipo(String tipo) {
        setTipo(tipo);
        return this;
    }

    public AtributoResumo dataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    public AtributoResumo valor(String valor) {
        setValor(valor);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AtributoResumo)) {
            return false;
        }
        AtributoResumo atributoResumo = (AtributoResumo) o;
        return Objects.equals(item, atributoResumo.item) && Objects.equals(atributoId, atributoResumo.atributoId) && Objects.equals(atributo, atributoResumo.atributo) && Objects.equals(groupId, atributoResumo.groupId) && Objects.equals(idItemLista, atributoResumo.idItemLista) && Objects.equals(nomeLista, atributoResumo.nomeLista) && Objects.equals(tipo, atributoResumo.tipo) && Objects.equals(dataType, atributoResumo.dataType) && Objects.equals(valor, atributoResumo.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, atributoId, atributo, groupId, idItemLista, nomeLista, tipo, dataType, valor);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }    
}