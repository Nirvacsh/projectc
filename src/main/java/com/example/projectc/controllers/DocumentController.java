package com.example.projectc.controllers;

import com.example.projectc.domain.Document;
import com.example.projectc.domain.Field;
import com.example.projectc.repos.DocumentRepo;
import com.example.projectc.repos.FieldRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class DocumentController {

    @Autowired
    private DocumentRepo documentRepo;

    @Autowired
    private FieldRepo fieldRepo;

    @GetMapping("main/{document}")
    public String docEditForm(@PathVariable Document document, Model model) {
        Iterable<Field> fields = document.getFields();

        model.addAttribute("fields", fields);
        return "documentCreate";
    }

    @PostMapping("main/{document}")
    public String docAddForm(@PathVariable Document document, Model model, @RequestParam String fieldName) {
        Field newField = new Field();

        newField.setFieldName(fieldName);

        fieldRepo.save(newField);

        model.addAttribute("field", newField);
        return "documentCreate";
    }
}
