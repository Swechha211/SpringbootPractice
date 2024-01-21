package com.example.jdbcbasic;

import com.example.jdbcbasic.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class JdbcBasicApplication implements CommandLineRunner {

    @Autowired
    private UserDao userDao;

    public static void main(String[] args) {

        SpringApplication.run(JdbcBasicApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.userDao.createTable());

        this.createUser();
    }

    public void createUser() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter userid");
        Integer userid= null;
        try {
            userid = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.print("Enter name");
        String username= null;
        try {
            username = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.print("Enter user age");
        Integer age= null;
        try {
            age = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.print("Enter user city");
        String city= null;
        try {
            city = br.readLine();
        } catch (IOException e) {

        }

        int i = this.userDao.insertUser(userid, username, age, city);
        System.out.println(i +"user added");



    }



}
