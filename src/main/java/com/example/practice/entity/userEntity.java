package com.example.practice.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "testuser")
public class userEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String name;
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
}