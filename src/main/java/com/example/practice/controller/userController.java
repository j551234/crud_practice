package com.example.practice.controller;

import com.example.practice.entity.userBo;

import com.example.practice.entity.userEntity;
import com.example.practice.service.userService;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.util.ArrayList;
import java.util.Iterator;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Service;

@RestController
public class userController {
	@Autowired
	userService addservice;
	userEntity User;
	@GetMapping("/")
	public String getUsers() {    
	return "/save 加資料  /all 看資料 /delete 全部刪除";
	}

	@PostMapping("/save")
	@ResponseBody
    public Iterable save(@RequestBody userEntity user) {
    	userBo bo =new userBo();
    	bo.setName(user.getName());
    	bo.setId(user.getId());
    	addservice.add(bo);
    	return addservice.findAll();
	
    }
	@RequestMapping("/all")
    @ResponseBody
	public Iterable findAll() {
		return addservice.findAll();
	}
	@RequestMapping("/delete")
	@ResponseBody
	public String deleteALL() {
	 addservice.deleteAll();
	 return "ALL DELETE";
	}
	@PostMapping("/update")
	@ResponseBody
    public Iterable update(@RequestBody ArrayList<userEntity> user) {
		addservice.updateAll(user);
		return addservice.findAll();
    }
}