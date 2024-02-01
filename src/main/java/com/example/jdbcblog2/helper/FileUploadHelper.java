package com.example.jdbcblog2.helper;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Component
public class FileUploadHelper {
    // By using static method
//    public final String UPLOAD_DIR ="C:\\Users\\Acer\\IdeaProjects\\JdbcBlog2\\src\\main\\resources\\static\\image";

    //By using dynamic method
public final String UPLOAD_DIR =new ClassPathResource("static/image/").getFile().getAbsolutePath();

    public FileUploadHelper() throws IOException {
    }

    public boolean uploadFile(MultipartFile multipartFile){
        boolean f = false;
        try {

            InputStream inputStream = multipartFile.getInputStream();
            byte data[] = new byte[inputStream.available()];
            inputStream.read(data);

            //to write data
            FileOutputStream fileOutputStream = new FileOutputStream(UPLOAD_DIR+ File.separator+multipartFile.getOriginalFilename());
            fileOutputStream.write(data);
            fileOutputStream.flush();
            fileOutputStream.close();
            f = true;


        } catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }
}
