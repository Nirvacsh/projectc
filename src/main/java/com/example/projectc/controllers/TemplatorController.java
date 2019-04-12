package com.example.projectc.controllers;

import com.example.projectc.domain.Document;
import com.example.projectc.domain.Field;
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


    @Value("{upload.path}")
    private String uploadPath;
    @PostMapping
    public String createTemplate(@RequestParam(required = false) String fieldName,
                                 @RequestParam(required = false) String docName, //Question
                                 @RequestParam("file")MultipartFile file, Model model) throws IOException, NullPointerException {
        //Создаем объект док, в конструктор сразу добавляем путь и название дока
        Document doc = new Document();
        //Создаем объект поле, в конструкторе ничего не добавляем, в данном контроллере нам нужно получить только названия полей
        Field field = new Field();

        field.setFieldName(fieldName);
        //how to link Field to document in code
        //example...
        //how to

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
            //Переносим файл методом в новый файл по пути, грубо говоря сохранение
            file.transferTo(new File(uploadPath + "/" + doc.getDocName()));
        }

        fieldRepo.save(field);

        model.addAttribute("field", field);
        model.addAttribute("document", doc);

        return "template";
    }


    @GetMapping
    public String template() {

        return "templator";
    }

}
