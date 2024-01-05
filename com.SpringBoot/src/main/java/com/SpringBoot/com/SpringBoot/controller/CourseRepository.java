package com.SpringBoot.com.SpringBoot.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.com.SpringBoot.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
