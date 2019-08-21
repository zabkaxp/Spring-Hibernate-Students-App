package com.studentsDal.studentsDal.repos;

import com.studentsDal.studentsDal.entities.Student;
import org.springframework.data.repository.CrudRepository;
//data access layer
public interface StudentRepository extends CrudRepository<Student, Long> {
}
