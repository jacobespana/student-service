package com.studentmicroservice.StudentService.student;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> retrieveAllStudents() {
		
		return studentRepository.findAll();
	}
	
	public Student retrieveStudent(long id) throws Exception { 
		
		Optional<Student> student = studentRepository.findById(id);

		if (!student.isPresent())
			throw new Exception("The student with id: " + id + " does not exist.");

		return student.get();
	}
	
	public void deleteStudent(long id) { 
		
		studentRepository.deleteById(id);
	}
	
	public ResponseEntity<Object> createStudent(Student student) {
		
		Student savedStudent = studentRepository.save(student);

		return ResponseEntity.noContent().build();
	}
	
	public ResponseEntity<Object> updateStudent(Student student, long id) {
		
		Optional<Student> studentOptional = studentRepository.findById(id);

		if (!studentOptional.isPresent())
			return ResponseEntity.notFound().build();

		student.setId(id);
		
		studentRepository.save(student);

		return ResponseEntity.noContent().build();
	}
}
