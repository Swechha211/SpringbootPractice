package com.example.jdbcblog2.controllers;

import com.example.jdbcblog2.helper.FileUploadHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {

    @Autowired
    private FileUploadHelper fileUploadHelper;

    @PostMapping("/upload-file")
    public ResponseEntity<String> uploadFile(@RequestParam("File")MultipartFile file)
    {
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getName());

        try {



        if (file.isEmpty()){

            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must contain file");

        }

        //file upload code
           boolean success = fileUploadHelper.uploadFile(file);
        if(success){
            return ResponseEntity.ok("File is successfully uploaded");
        }

        } catch (Exception e){
            e.printStackTrace();
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong. Please try again");
    }

}
