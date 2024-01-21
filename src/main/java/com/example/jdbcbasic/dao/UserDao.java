package com.example.jdbcbasic.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public UserDao(){

    }

    public int createTable(){
        String query = "CREATE TABLE IF NOT EXISTS User(id int primary key, name varchar(200), age int, city varchar(50))";
        int update = this.jdbcTemplate.update(query);
        return update;

    }

    public int insertUser(Integer id, String name, Integer age, String city){
        String query = "insert into user(id, name, age, city) values(?,?,?,?)";
        int update = this.jdbcTemplate.update(query, new Object[]{id, name, age, city});
        return update;

    }


}
