package com.studentsDal.studentsDal;

import com.studentsDal.studentsDal.entities.Student;
import com.studentsDal.studentsDal.repos.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentsDalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent(){
		Student student = new Student();
		student.setName("Jon");
		student.setCourse("React");
		student.setFee(30.9);
		studentRepository.save(student);
	}
	@Test
	public void testFindStudentById(){

	}
}
