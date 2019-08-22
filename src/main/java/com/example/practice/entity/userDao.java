package com.example.practice.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;;

@Repository
public interface userDao extends JpaRepository<userEntity, Integer>{

}
