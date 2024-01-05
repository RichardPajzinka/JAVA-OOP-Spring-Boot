package com.springboot.learnjpaandhibernate.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.learnjpaandhibernate.Course;

public interface SpringDataJpaRepository extends JpaRepository<Course, Long> {

}