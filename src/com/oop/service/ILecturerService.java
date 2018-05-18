package com.oop.service;

import com.oop.model.Course;
import com.oop.model.Lecturer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;


public interface ILecturerService {
	/** Initialize logger */
	public static final Logger log = Logger.getLogger(ILecturerService.class.getName());


	/**
	 * Add lecturers for lecturer table
	 * @param lecturer
	 */
	public void addLecturer(Lecturer lecturer);

	/**
	 * Get a particular lecturer
	 * 
	 * @param lecturerID
	 * @return Lecturer
	 */
	public Lecturer getLecturerByID(String lecturerID);
	
	/**
	 * Get all list of lecturers
	 * 
	 * @return ArrayList<Lecturer>
	 */
	public ArrayList<Lecturer> getLecturers();
	
	/**
	 * Update existing lecturer
	 * @param lecturerID
	 * @param lecturer
	 * 
	 * @return
	 */
	public Lecturer updateLecturer(String lecturerID, Lecturer lecturer);

	/**
	 * Remove existing lecturer
	 * 
	 * @param lecturerID
	 */
	public void removeLecturer(String lecturerID);
	
	/**
	 * Get a list of Courses
	 * 
	 * @param lecturerID
	 */
	public ArrayList<Course> getCourseList(String lecturerID);
}
