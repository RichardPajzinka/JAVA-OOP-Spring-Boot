package com.springboot.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learnjpaandhibernate.Course;
import com.springboot.learnjpaandhibernate.jpa.SpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	/*
	 * @Autowired private jdbcRepository repository;
	 */

	/*
	 * @Autowired private JpaaRepository repository;
	 */

	@Autowired
	private SpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1, "learn aws now", "Richard"));
		repository.save(new Course(2, "learn azure", "Richard"));
		repository.save(new Course(3, "learn devops", "Richard"));
		repository.deleteById((long) 1);
		System.out.println(repository.findById((long) 2));
		System.out.println(repository.findById((long) 3));

	}

}
