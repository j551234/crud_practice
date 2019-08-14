package com.example.practice;
import com.example.practice.userBo;
import com.example.practice.userEntity;
import com.example.practice.userDao;

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
}