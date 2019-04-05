package com.example.projectc.domain;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long docId;

    private Long docNum;

    private String docPath;

    @OneToMany(mappedBy = "fields", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Field> fields;

    public Set<Field> getFields() {
        return fields;
    }

    public void setFields(Set<Field> fields) {
        this.fields = fields;
    }
    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public Long getDocNum() {
        return docNum;
    }

    public void setDocNum(Long docNum) {
        this.docNum = docNum;
    }

    public String getDocPath() {
        return docPath;
    }

    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }

    public Document(Long docNum, String docPath) {
        this.docNum = docNum;
        this.docPath = docPath;
    }

    public Document(){

    }


}

