package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
     
	@Value("101")
	private int S_id;
	@Value("Akanksha")
	private String S_name;
	@Value("23")
	private int S_age;
	@Value("Nagpur")
	private String S_city;
    @Autowired
	private Department dept;

	public int getS_id() {
		return S_id;
	}

	public void setS_id(int s_id) {
		S_id = s_id;
	}

	public String getS_name() {
		return S_name;
	}

	public void setS_name(String s_name) {
		S_name = s_name;
	}

	public int getS_age() {
		return S_age;
	}

	public void setS_age(int s_age) {
		S_age = s_age;
	}

	public String getS_city() {
		return S_city;
	}

	public void setS_city(String s_city) {
		S_city = s_city;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [S_id=" + S_id + ", S_name=" + S_name + ", S_age=" + S_age + ", S_city=" + S_city + ", dept="
				+ dept + "]";
	}

	public Student(int s_id, String s_name, int s_age, String s_city, Department dept) {
		super();
		S_id = s_id;
		S_name = s_name;
		S_age = s_age;
		S_city = s_city;
		this.dept = dept;
	}

}