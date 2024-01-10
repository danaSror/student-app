package com.studentsapp.backend.repo;


import com.studentsapp.backend.model.StudentGrade;
import org.springframework.data.repository.CrudRepository;

public interface StudentGradeRepository extends CrudRepository<StudentGrade,Long> {

}
