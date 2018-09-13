package com.tian.demoStudy.dao;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	@JsonInclude(Include.NON_NULL)
	private String name;
	
	//指定别名
	@JsonProperty("account")
	private Integer age;
	
	//指定字符不显示
	//@JsonIgnore
	@JsonAlias("sa")
	private Double salary;
	
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")
	private Date date;
	
	public User(String name, Integer age, Double salary, Date date) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", salary=" + salary + ", date=" + date + "]";
	}
	
	
}
