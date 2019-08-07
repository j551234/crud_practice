package com.example.practice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.userEntity;;

@Repository
public interface userDao extends CrudRepository<userEntity, Integer>{

}
