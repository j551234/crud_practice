package com.example.practice;



import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Service;

@RestController
public class userController {
	@Autowired
	userService addservice;

    @RequestMapping("/save")
    public void save() {
    	

    	
 
    	userBo bo =new userBo();
    	bo.setId(10);
    	bo.setName("sqltest");
    	addservice.add(bo);
    	
    	userBo boFind = addservice.get(10);
    	System.out.println(boFind);
    
    	
    	
    }
}