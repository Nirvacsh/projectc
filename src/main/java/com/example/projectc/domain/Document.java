package com.example.projectc.domain;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long docId;

    private String docPath;

    private String docName;

    @OneToMany(mappedBy = "document", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
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

    public String getDocPath() {
        return docPath;
    }

    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }

    public void setDocName (String docName) {
        this.docName = docName;
    }

    public String getDocName(){
        return docName;
    }

    public Document(String docName, String docPath) {
        this.docName = docName;
        this.docPath = docPath;
    }

    public Document(){

    }

}

