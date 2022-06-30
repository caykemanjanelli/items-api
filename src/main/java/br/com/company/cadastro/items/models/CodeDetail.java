package br.com.company.cadastro.items.models;

import java.io.Serializable;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class CodeDetail implements Serializable {

    
    /**
     *
     */
    private static final long serialVersionUID = -1307698398177642291L;
    private String code_type_desc;
    private String code_type;
    private String code;
    private Long  lang;
    private String default_lang_ind;
    private String code_desc;
    private Long  seq_no;
    private String base_ind;


    public CodeDetail() {
    }

    public CodeDetail(String code_type_desc, String code_type, String code, Long lang, String default_lang_ind, String code_desc, Long seq_no, String base_ind) {
        this.code_type_desc = code_type_desc;
        this.code_type = code_type;
        this.code = code;
        this.lang = lang;
        this.default_lang_ind = default_lang_ind;
        this.code_desc = code_desc;
        this.seq_no = seq_no;
        this.base_ind = base_ind;
    }

    public String getCode_type_desc() {
        return this.code_type_desc;
    }

    public void setCode_type_desc(String code_type_desc) {
        this.code_type_desc = code_type_desc;
    }

    public String getCode_type() {
        return this.code_type;
    }

    public void setCode_type(String code_type) {
        this.code_type = code_type;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getLang() {
        return this.lang;
    }

    public void setLang(Long lang) {
        this.lang = lang;
    }

    public String getDefault_lang_ind() {
        return this.default_lang_ind;
    }

    public void setDefault_lang_ind(String default_lang_ind) {
        this.default_lang_ind = default_lang_ind;
    }

    public String getCode_desc() {
        return this.code_desc;
    }

    public void setCode_desc(String code_desc) {
        this.code_desc = code_desc;
    }

    public Long getSeq_no() {
        return this.seq_no;
    }

    public void setSeq_no(Long seq_no) {
        this.seq_no = seq_no;
    }

    public String getBase_ind() {
        return this.base_ind;
    }

    public void setBase_ind(String base_ind) {
        this.base_ind = base_ind;
    }

    public CodeDetail code_type_desc(String code_type_desc) {
        this.code_type_desc = code_type_desc;
        return this;
    }

    public CodeDetail code_type(String code_type) {
        this.code_type = code_type;
        return this;
    }

    public CodeDetail code(String code) {
        this.code = code;
        return this;
    }

    public CodeDetail lang(Long lang) {
        this.lang = lang;
        return this;
    }

    public CodeDetail default_lang_ind(String default_lang_ind) {
        this.default_lang_ind = default_lang_ind;
        return this;
    }

    public CodeDetail code_desc(String code_desc) {
        this.code_desc = code_desc;
        return this;
    }

    public CodeDetail seq_no(Long seq_no) {
        this.seq_no = seq_no;
        return this;
    }

    public CodeDetail base_ind(String base_ind) {
        this.base_ind = base_ind;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CodeDetail)) {
            return false;
        }
        CodeDetail codeDetail = (CodeDetail) o;
        return Objects.equals(code_type_desc, codeDetail.code_type_desc) && Objects.equals(code_type, codeDetail.code_type) && Objects.equals(code, codeDetail.code) && Objects.equals(lang, codeDetail.lang) && Objects.equals(default_lang_ind, codeDetail.default_lang_ind) && Objects.equals(code_desc, codeDetail.code_desc) && Objects.equals(seq_no, codeDetail.seq_no) && Objects.equals(base_ind, codeDetail.base_ind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code_type_desc, code_type, code, lang, default_lang_ind, code_desc, seq_no, base_ind);
    }
    

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }


}