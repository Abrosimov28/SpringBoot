package com.alab.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alab.DAO.StudentDao;
import com.alab.Entity.Student;

@Service
public class StudentService {
	
	@Autowired
	@Qualifier("mySqlDb")
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}

	public void removeStudentById(int id) {
		this.studentDao.removeStudentById(id);
	}
	
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}

	public void insertStudent(Student student) {
		studentDao.insertStudentToDb(student);		
	}
	
}
