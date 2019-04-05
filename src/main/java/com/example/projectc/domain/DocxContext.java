package com.example.projectc.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "Document2")
public class DocxContext {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DocNumber", nullable = false)
    private String docNumber;

    @Column(name = "DocDate", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date docDate;

    @Column(name = "FopFio", nullable = false)
    private String fopFio;

    @Column(name = "FopNumber", nullable = false)
    private String fopNumber;

    @Column(name = "FopDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fopDate;

    @Column(name = "DocWorks")
    private String docWorks;

    @Column(name = "DocService")
    private String docService;

    @Column(name = "DocMoney")
    private Long docMoney;

    @Column(name = "DocMoneyUa")
    private String docMoneyUa;

    @Column(name = "FopPassport")
    private String fopPassport;

    @Column(name = "FopPassportNumber")
    private Long fopPassportNumber;

    @Column(name = "FopAddress")
    private String fopAddress;

    @Column(name = "FopMoneyNumber")
    private String fopMoneyNumber;

    @Column(name = "FopTelephone")
    private String fopTelephone;

    @Column(name = "FopCode")
    private String fopCode;

    public DocxContext(String docNumber, Date docDate, String fopFio, String fopNumber, Date fopDate, String docWorks, String docService, Long docMoney, String docMoneyUa, String fopPassport, Long fopPassportNumber, String fopAddress, String fopMoneyNumber, String fopTelephone, String fopCode) {
        this.docNumber = docNumber;
        this.docDate = docDate;
        this.fopFio = fopFio;
        this.fopNumber = fopNumber;
        this.fopDate = fopDate;
        this.docWorks = docWorks;
        this.docService = docService;
        this.docMoney = docMoney;
        this.docMoneyUa = docMoneyUa;
        this.fopPassport = fopPassport;
        this.fopPassportNumber = fopPassportNumber;
        this.fopAddress = fopAddress;
        this.fopMoneyNumber = fopMoneyNumber;
        this.fopTelephone = fopTelephone;
        this.fopCode = fopCode;
    }


    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        this.docDate = df.parse(docDate);
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public void setFopDate(String fopDate) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        this.fopDate = df.parse(fopDate);
    }

    public String getFopFio() {
        return fopFio;
    }

    public void setFopFio(String fopFio) {
        this.fopFio = fopFio;
    }

    public String getFopNumber() {
        return fopNumber;
    }

    public void setFopNumber(String fopNumber) {
        this.fopNumber = fopNumber;
    }

    public Date getFopDate() {
        return fopDate;
    }

    public void setFopDate(Date fopDate) {
        this.fopDate = fopDate;
    }

    public String getDocWorks() {
        return docWorks;
    }

    public void setDocWorks(String docWorks) {
        this.docWorks = docWorks;
    }

    public String getDocService() {
        return docService;
    }

    public void setDocService(String docService) {
        this.docService = docService;
    }

    public Long getDocMoney() {
        return docMoney;
    }

    public void setDocMoney(Long docMoney) {
        this.docMoney = docMoney;
    }

    public String getDocMoneyUa() {
        return docMoneyUa;
    }

    public void setDocMoneyUa(String docMoneyUa) {
        this.docMoneyUa = docMoneyUa;
    }

    public String getFopPassport() {
        return fopPassport;
    }

    public void setFopPassport(String fopPassport) {
        this.fopPassport = fopPassport;
    }

    public Long getFopPassportNumber() {
        return fopPassportNumber;
    }

    public void setFopPassportNumber(Long fopPassportNumber) {
        this.fopPassportNumber = fopPassportNumber;
    }

    public String getFopAddress() {
        return fopAddress;
    }

    public void setFopAddress(String fopAddress) {
        this.fopAddress = fopAddress;
    }

    public String getFopMoneyNumber() {
        return fopMoneyNumber;
    }

    public void setFopMoneyNumber(String fopMoneyNumber) {
        this.fopMoneyNumber = fopMoneyNumber;
    }

    public String getFopTelephone() {
        return fopTelephone;
    }

    public void setFopTelephone(String fopTelephone) {
        this.fopTelephone = fopTelephone;
    }


    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public void setFopCode(String fopCode) {
        this.fopCode = fopCode;
    }

    public String getFopCode(){
        return fopCode;
    }
    public DocxContext() {

    }
}

