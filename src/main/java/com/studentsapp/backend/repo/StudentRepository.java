package com.studentsapp.backend.repo;

import com.studentsapp.backend.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
