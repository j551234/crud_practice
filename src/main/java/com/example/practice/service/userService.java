package com.example.practice.service;
import com.example.practice.entity.userBo;
import com.example.practice.entity.userDao;
import com.example.practice.entity.userEntity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class userService {
    @Autowired
    private userDao userDao;
    
    public void add(userBo bo) {
        userEntity entity = new userEntity();
        entity.setId(bo.getId());
        entity.setName(bo.getName());
        userDao.save(entity);
    }
    
    public userBo get(int id) {
        userEntity entity = userDao.findById(id).orElse(new userEntity());
        userBo bo = new userBo();
        bo.setId(entity.getId());
        bo.setName(entity.getName());
        
        return bo;
    }
    public Iterable<userEntity> findAll(){
    	return userDao.findAll();
    	
    }
    public void deleteAll(){
    	 userDao.deleteAll();
    	
    }
    public void updateAll(ArrayList<userEntity> entities) {
    	userDao.saveAll(entities);
    }
}