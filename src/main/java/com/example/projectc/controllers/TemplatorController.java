package com.example.projectc.controllers;

import com.example.projectc.domain.Document;
import com.example.projectc.domain.Field;
import com.example.projectc.repos.DocumentRepo;
import com.example.projectc.repos.FieldRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/templator")
public class TemplatorController {

    @Autowired
    private FieldRepo fieldRepo;

    @Autowired
    private DocumentRepo documentRepo;

    @PostMapping
    public String createTemplate(@RequestParam(required = false) String fieldName,@RequestParam Document document, Model model) {

        Field field = new Field();

        field.setFieldName(fieldName);
        field.setDocument(document);

        fieldRepo.save(field);

        model.addAttribute("field", field);

        Iterable<Document> documents = documentRepo.findAll();
        model.addAttribute("documents", documents);
        return "templator";
    }


    @GetMapping
    public String template() {

        return "templator";
    }

}
