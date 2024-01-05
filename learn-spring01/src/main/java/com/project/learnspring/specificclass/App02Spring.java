package com.project.learnspring.specificclass;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02Spring {

//chceme tu pridat spring context a managovat tu veci (objekty)
//@Configuration
	public static void main(String[] args) {
		
		// try with resources
		try (var context = new AnnotationConfigApplicationContext(SpringConfigurationClass.class);) {
		//var context = new AnnotationConfigApplicationContext(SpringConfigurationClass.class);
		// context.getBean("name");
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address2"));

		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		// context.getBeanDefinitionNames()
	}
}
}
