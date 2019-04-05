package com.example.projectc.domain;

import javax.persistence.*;

@Entity
@Table(name = "Field")
public class Field {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "field_id", nullable = false)
    private Long fieldId;
//
    @ManyToOne
    private Long docNum;

    public Field getFields() {
        return fields;
    }

    public void setFields(Field fields) {
        this.fields = fields;
    }
    @ManyToOne
    private Field fields;

    @Column(name = "field_name", nullable = false)
    private String fieldName;

    @Column(name = "field_value", nullable = false)
    private String fieldValue;

    public Long getFieldId() {
        return fieldId;
    }

    public void setFieldId(Long fieldId) {
        this.fieldId = fieldId;
    }

    public Long getDocNum() {
        return docNum;
    }

    public void setDocNum(Long docNum) {
        this.docNum = docNum;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public Field(Long docNum, String fieldName, String fieldValue) {
        this.docNum = docNum;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public Field() {
    }

}
