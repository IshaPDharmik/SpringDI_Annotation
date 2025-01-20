package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfigClass;
import com.entity.Student;

public class Main_class {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		Student Std = context.getBean(Student.class);

		System.out.println(Std);

	}
}