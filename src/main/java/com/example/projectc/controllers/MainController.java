package com.example.projectc.controllers;

import com.example.projectc.domain.Document;
import com.example.projectc.domain.DocxContext;
import com.example.projectc.domain.Field;
import com.example.projectc.repos.DocumentRepo;
import com.example.projectc.repos.FieldRepo;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wickedsource.docxstamper.DocxStamper;
import org.wickedsource.docxstamper.DocxStamperConfiguration;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.Map;


@Controller
public class MainController {

    @Autowired
    private DocumentRepo documentRepo;

    @Autowired
    private FieldRepo fieldRepo;

    @PostMapping
    public String doc(HttpServletRequest h, Model model) {

        Map<String, String[]> mapa = h.getParameterMap();

        return "main";
    }
//    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    String collector (@RequestParam(required = false) String docName) throws JSONException {
//        Document d = new Document();
//        d.setDocName(docName);
//
//        JSONArray fieldArray = new JSONArray();
//        for (Field field : d.getFields()) {
//            JSONObject fieldJSON = new JSONObject();
//            fieldJSON.put("field_name", field.getFieldName());
//            fieldJSON.put("field_value", field.getFieldValue());
//            fieldArray.put(fieldJSON);
//        }
//
//        return fieldArray.toString();
//    }
    @PostMapping("/main")
    @ResponseBody
    public HttpEntity<byte[]> add(@RequestParam String docNumber,
                                  @RequestParam String docDate,
                                  @RequestParam String fopFio,
                                  @RequestParam String fopNumber,
                                  @RequestParam String fopDate,
                                  @RequestParam String docWorks,
                                  @RequestParam String docService,
                                  @RequestParam Long docMoney,
                                  @RequestParam String docMoneyUa,
                                  @RequestParam String fopPassport,
                                  @RequestParam Long fopPassportNumber,
                                  @RequestParam String fopAddress,
                                  @RequestParam String fopMoneyNumber,
                                  @RequestParam String fopTelephone,
                                  @RequestParam String fopCode, Model model) throws Exception {

        DocxStamper stamper = new DocxStamper(new DocxStamperConfiguration());
        DocxContext context = new DocxContext();

        context.setDocNumber(docNumber);
        context.setDocDate(docDate);
        context.setFopFio(fopFio);
        context.setFopNumber(fopNumber);
        context.setFopDate(fopDate);
        context.setDocWorks(docWorks);
        context.setDocService(docService);
        context.setDocMoney(docMoney);
        context.setDocMoneyUa(docMoneyUa);
        context.setFopPassport(fopPassport);
        context.setFopPassportNumber(fopPassportNumber);
        context.setFopAddress(fopAddress);
        context.setFopMoneyNumber(fopMoneyNumber);
        context.setFopTelephone(fopTelephone);
        context.setFopCode(fopCode);

        InputStream template = new FileInputStream(new File("template_new.docx"));
        OutputStream out = new FileOutputStream("output_template.docx");
        stamper.stamp(template, context, out);

        InputStream result = new FileInputStream(new File("output_template.docx"));
        byte[] documentBody = IOUtils.toByteArray(result);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Content-Type", "application/octet-stream");
        responseHeaders.add("Content-Disposition", "attachment; filename=\"out.docx\"");

        out.close();
        template.close();
        result.close();


        return new HttpEntity<>(documentBody, responseHeaders);//IOUtils.toByteArray(result);//
    }



    @GetMapping("/main")
    public String addMain(Model model) {
        Iterable<Document> documents = documentRepo.findAll();
        model.addAttribute("documents", documents);
        return "main";
    }

    @GetMapping("/main/{document}")
    public String userEditForm(@PathVariable Document document, Model model) {
        model.addAttribute("document", document);

        return "documentCreate";
    }
}
