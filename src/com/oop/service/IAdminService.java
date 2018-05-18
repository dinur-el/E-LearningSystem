package com.oop.service;

import java.util.ArrayList;

import com.oop.model.Course;

public interface IAdminService {
	
	/**
	 * Get not enrolled course list of a student.
	 * 
	 * @param studentID
	 */
	public ArrayList<Course> getOtherCourses(String studentID);
	
	/**
	 * check the validity of login
	 * @param username
	 * @param password
	 * 
	 * @return userType
	 */
	public String login(String username,String password);
}
