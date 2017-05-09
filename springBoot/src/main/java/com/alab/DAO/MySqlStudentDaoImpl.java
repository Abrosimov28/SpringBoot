package com.alab.DAO;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.alab.Entity.Student;

@Repository
@Qualifier("mySqlDb")
public class MySqlStudentDaoImpl implements StudentDao {

	
	
	public Collection<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeStudentById(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	public void insertStudentToDb(Student student) {
		// TODO Auto-generated method stub
		
	}

}
