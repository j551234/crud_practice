package com.example.practice;

import com.example.practice.userEntity;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Service;

@RestController
public class userController {
	@Autowired
	userService addservice;
	@GetMapping("/")
	public String getUsers() {    
	return "Hello Spring Security";
	}

	@RequestMapping("/save")
    @ResponseBody
    public Iterable save() {
    	userBo bo =new userBo();
    	bo.setId(20);
    	bo.setName("miny");
    	System.out.println(bo.getName());
    	addservice.add(bo);
    	bo.setName("jim");
    	bo.setId(1);
    	addservice.add(bo);
    	bo.setId(23);
    	bo.setName("an");
    	addservice.add(bo);
    	return addservice.findAll();
    
    	
    }
	@RequestMapping("/all")
    @ResponseBody
	public Iterable findAll() {
		return addservice.findAll();
	}
}