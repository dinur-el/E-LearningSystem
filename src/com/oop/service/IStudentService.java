package com.oop.service;

import com.oop.model.Student;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;


public interface IStudentService {
	/** Initialize logger */
	public static final Logger log = Logger.getLogger(IStudentService.class.getName());


	/**
	 * Add students for student table
	 * @param student
	 */
	public void addStudent(Student student);

	/**
	 * Get a particular student
	 * 
	 * @param studentID
	 * @return Student
	 */
	public Student getStudentByID(String studentID);
	
	/**
	 * Get all list of students
	 * 
	 * @return ArrayList<Student>
	 */
	public ArrayList<Student> getStudents();
	
	/**
	 * Update existing student
	 * @param studentID
	 * @param student
	 * 
	 * @return
	 */
	public Student updateStudent(String studentID, Student student);

	/**
	 * Remove existing student
	 * 
	 * @param studentID
	 */
	public void removeStudent(String studentID);
}
