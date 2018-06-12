package com.oop.service;

import com.oop.model.Course;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

public interface ICourseService {
	/** Initialize logger */
	public static final Logger log = Logger.getLogger(ICourseService.class.getName());


	/**
	 * Add courses for course table
	 * @param course
	 */
	public void addCourse(Course course);

	/**
	 * Get a particular course
	 * 
	 * @param courseID
	 * @return Course
	 */
	public Course getCourseByID(String courseID);
	
	/**
	 * Get all list of courses
	 * 
	 * @return ArrayList<Course>
	 */
	public ArrayList<Course> getCourses();
	
	/**
	 * Update existing course
	 * @param courseID
	 * @param course
	 * 
	 * @return
	 */
	public Course updateCourse(String courseID, Course course);

	/**
	 * Remove existing course
	 * 
	 * @param courseID
	 */
	public void removeCourse(String courseID);
	
	
}
