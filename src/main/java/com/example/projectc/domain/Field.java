package com.example.projectc.domain;

import javax.persistence.*;

@Entity
@Table(name = "Field")
public class Field {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "field_id", nullable = false)
    private Long fieldId;

    @ManyToOne
    @JoinColumn
    private Document document;

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

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Field(String fieldName, String fieldValue) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public Field() {
    }

}
