package com.demo.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="post")
public class Post {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int id;
public String name;
public String address;
public String moblie;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMoblie() {
	return moblie;
}
public void setMoblie(String moblie) {
	this.moblie = moblie;
}
@Override
public String toString() {
	return "Post [id=" + id + ", name=" + name + ", address=" + address + ", moblie=" + moblie + "]";
}

}
