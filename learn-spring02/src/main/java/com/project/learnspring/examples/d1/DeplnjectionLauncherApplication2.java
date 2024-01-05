package com.project.learnspring.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.project.learnspring.examples.a1")
public class DeplnjectionLauncherApplication2 {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(DeplnjectionLauncherApplication2.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}


	}
	

}