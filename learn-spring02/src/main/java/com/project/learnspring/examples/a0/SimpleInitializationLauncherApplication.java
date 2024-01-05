package com.project.learnspring.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
	private ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("ClassB initialization");
		this.classA = classA;
	}


	public void doSomething() {
		System.out.println("do something");
	}

}

@Configuration
@ComponentScan
public class SimpleInitializationLauncherApplication {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(SimpleInitializationLauncherApplication.class)) {
			// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println("initialization of xontext is completed");
			context.getBean(ClassB.class).doSomething();
		}


	}
	

}
