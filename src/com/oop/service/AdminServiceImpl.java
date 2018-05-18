package com.oop.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.oop.model.Course;
import com.oop.util.CommonConstants;
import com.oop.util.Database;

public class AdminServiceImpl implements IAdminService {
	
	Database db = new Database();

	public ArrayList<Course> getOtherCourses(String studentID){
		ArrayList<Course> courseList = new ArrayList<Course>();
		
		try {
			db.connect();
			String query;
			Course course = new Course();
				
			query = "select c.id, c.name from student as s, course as c, enrolment e "
					+ "where s.id = e.student_id AND c.id = e.course_id AND e.student_id !=\""+studentID+"\"";
			System.out.println(query);
				
			
			ResultSet resultSet = db.select(query);

			while (resultSet.next()) {
				course.setID(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
				course.setName(resultSet.getString(CommonConstants.COLUMN_INDEX_TWO));
				
				courseList.add(course);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return courseList;
	}
	
	
	public String login(String username,String password) {
		String userType=null;
		String query;
		
		try {
			db.connect();
			
			
	
			query = "select a.id from admin as a, "
					+ "where a.username =\""+username+"\" AND a.password =\""+password+"\"";
			System.out.println(query);
				
			ResultSet resultSet = db.select(query);
				
			if(resultSet.wasNull()) {	
				
				query = "select s.id from student as s, "
						+ "where s.username =\""+username+"\" AND a.password =\""+password+"\"";
				System.out.println(query);
				
			
				resultSet = db.select(query);

				if(resultSet.wasNull()) {
					query = "select l.id from lecturer as l, "
							+ "where l.username =\""+username+"\" AND a.password =\""+password+"\"";
					System.out.println(query);
				
					resultSet = db.select(query);
				
					if(resultSet.wasNull()) {
						userType = null;
					}
					
					else{
						userType = "lecturer";	
					}
				}
				
				else {					
					userType = "student";				
				}
				
			}
			
			else {
				userType = "admin";
			}
			
			return userType;

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return userType;
	}
}
