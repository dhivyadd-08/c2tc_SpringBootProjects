package com.tnsif.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.many_to_many_mapping.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}