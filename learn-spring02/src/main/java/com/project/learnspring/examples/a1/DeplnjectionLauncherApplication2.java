package com.project.learnspring.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class yourBusinessClass {
	@Autowired
	Dependency1 dependency1;
	@Autowired
	Dependency2 dependency2;

	@Autowired
	public yourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	/*
	 * @Autowired public Dependency1 getDependency1() {
	 * System.out.println("setter Injection"); return dependency1; }
	 * 
	 * @Autowired public void setDependency1(Dependency1 dependency1) {
	 * this.dependency1 = dependency1; }
	 * 
	 * @Autowired public Dependency2 getDependency2() { return dependency2; }
	 * 
	 * @Autowired public void setDependency2(Dependency2 dependency2) {
	 * this.dependency2 = dependency2; }
	 * 
	 * @Autowired public String toString() { return "Using " + dependency1 +
	 * dependency2; }
	 */
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan("com.project.learnspring.examples.a1")
public class DeplnjectionLauncherApplication2 {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(DeplnjectionLauncherApplication2.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(yourBusinessClass.class));
			// context.getBean(yourBusinessClass.class)
		}


	}
	

}
