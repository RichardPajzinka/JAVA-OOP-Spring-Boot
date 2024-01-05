package com.project.learnspring.specificclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//record - nepotrebujeme getter alebo setter toto sa použiva od novej javy
record Person(String name, int age) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class SpringConfigurationClass {
	@Bean
	@Primary
	public String name() {
		return "Richard";
	}

	@Bean
	public int age() {
		return 24;
	}

	@Bean
	public Person person() {
		return new Person("Richard", 24);
		// return person;
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Blatna 29", "Rozhanovce");
		// return person;
	}

}
