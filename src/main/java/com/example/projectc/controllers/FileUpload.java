package com.example.projectc.controllers;


import com.example.projectc.domain.Document;
import com.example.projectc.repos.DocumentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FileUpload {

    @Autowired
    private DocumentRepo documentRepo;

    @Value("${upload.path}")
    private String uploadPath;

    @PostMapping("/uploadDocument")
    public String uploadDocument(@RequestParam("file") MultipartFile file, Model model) throws IOException, NullPointerException {
        //Создаем объект док, в конструктор сразу добавляем путь и название дока
        Document doc = new Document();

        //Проверка на остутстиве файла или имени файла
        if(file != null && !file.getOriginalFilename().isEmpty()) {
            //если проходит, то директория загрузки это путь к файлу
            File uploadDir = new File(uploadPath);
            //если не существует такой директории, то создаем
            if(!uploadDir.exists()) {
                uploadDir.mkdir();
            }

            doc.setDocName(file.getOriginalFilename());
            doc.setDocPath(uploadPath);
            file.transferTo(new File(uploadPath + "/" + doc.getDocName()));
        }
//
        documentRepo.save(doc);
        model.addAttribute("document", doc);
        return "redirect:/templator";
    }

    @GetMapping("/uploadDocument")
    public String uploadDocumentGet() {

        return "uploadDocument";
    }
}
