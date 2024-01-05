package com.SpringBoot.com.SpringBoot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.com.SpringBoot.bean.Course;

@RestController
public class controller {

	@Autowired
	private CourseRepository repository;

	//http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {

		return repository.findAll();
		// return Arrays.asList(new Course(1, "Learn Microservices", "course"),
		// new Course(2, "full stack with angular and react", "course"));
	}

	// http://localhost:8080/courses/1
	@GetMapping("/courses/{id}")
	public Course getCourseDetail(@PathVariable int id) {
		Optional<Course> course = repository.findById((long) id);
		if (course.isEmpty()) {
			throw new RuntimeException("Course not found with this id" + id);
		}
		return course.get();
		// return new Course(1, "Learn Microservices 1", "course");

	}

	// POST method - create new resource
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
	}

	// PUT - update/replace a resource
	@PutMapping("/courses")
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {
		repository.save(course);
	}

	// DELETE - delete a resource
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id) {
		repository.deleteById(id);
	}
	}

