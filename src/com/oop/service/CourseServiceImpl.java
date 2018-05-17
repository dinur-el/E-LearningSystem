package com.oop.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.oop.model.Course;
import com.oop.util.CommonConstants;
import com.oop.util.DBConnectionUtil;
import com.oop.util.Database;
import com.oop.util.QueryUtil;

public class CourseServiceImpl implements ICourseService {
	/** Initialize logger */
	public static final Logger log = Logger.getLogger(CourseServiceImpl.class.getName());

	Database db = new Database();
	
	private static Connection connection;

	private static Statement statement;

	//static{
		//create table or drop if exist
		//createCourseTable();
	//}
	
	private PreparedStatement preparedStatement;

	/**
	 * This method initially drop existing Courses table in the database and
	 * recreate table structure to insert course entries
	 * 
	 * @throws SQLException
	 *             - Thrown when database access error occurs or this method is
	 *             called on a closed connection
	 * @throws ClassNotFoundException
	 *             - Thrown when an application tries to load in a class through
	 *             its string name using
	 * @throws SAXException
	 *             - Encapsulate a general SAX error or warning
	 * @throws IOException
	 *             - Exception produced by failed or interrupted I/O operations.
	 * @throws ParserConfigurationException
	 *             - Indicates a serious configuration error
	 * @throws NullPointerException
	 *             - Service is not available
	 * 
	 */
	
	public static void createCourseTable() {

		try {
			connection = DBConnectionUtil.getDBConnection();
			statement = connection.createStatement();
			// Drop table if already exists and as per SQL query available in
			// Query.xml
			statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_DROP_TABLE));
			// Create new courses table as per SQL query available in
			// Query.xml
			statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_CREATE_TABLE));

		} catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
	}
	
	
	/**
	 * Add set of courses for as a batch from the selected course List
	 * 
	 * @throws SQLException
	 *             - Thrown when database access error occurs or this method is
	 *             called on a closed connection
	 * @throws SAXException
	 *             - Encapsulate a general SAX error or warning
	 * @throws IOException
	 *             - Exception produced by failed or interrupted I/O operations.
	 * @throws ParserConfigurationException
	 *             - Indicates a serious configuration error.
	 * 
	 */
	@Override
	public void addCourse(Course course) {

		//String courseID = CommonUtil.generateIDs(getCourseIDs());
		
//		try {
//			connection = DBConnectionUtil.getDBConnection();
//			/*
//			 * Query is available in CourseQuery.xml file and user
//			 * insert_course key to extract value of it
//			 */
//			preparedStatement = connection
//					.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_INSERT_EMPLOYEES));
//			connection.setAutoCommit(false);
//			
//			//Generate course IDs
//			//course.setCourseID(courseID);
//			//preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, course.getCourseID());
//			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, course.getName());
//			preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, course.getEmail());
//			// Add course
//			preparedStatement.execute();
//			connection.commit();
//
//		} catch (SQLException | SAXException | IOException | ParserConfigurationException 
//				| ClassNotFoundException e) {
//			log.log(Level.SEVERE, e.getMessage());
//		} finally {
//			/*
//			 * Close prepared statement and database connectivity at the end of
//			 * transaction
//			 */
//			try {
//				if (preparedStatement != null) {
//					preparedStatement.close();
//				}
//				if (connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				log.log(Level.SEVERE, e.getMessage());
//			}
//		}
		
		db.connect();
		
		String name =course.getName();
		String duration =course.getDuration();
		String lecturer =course.getLecturerId();
		
		String query = "insert into course (name, duration, tutor_id) values (\""+name+"\",\""+duration+"\",\""+lecturer+"\")";
		System.out.println(query);
		
		try {
			int status = db.createOrUpdateOrDelete(query);
			
			//ResultSet  rs = db.select("");
			
			if (status == 1)
			{
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		db.disconnect();
	}

	/**
	 * Course details can be retrieved based on the provided course ID
	 * 
	 * @param courseID
	 *            - course details are filtered based on the ID
	 * 
	 * @see #actionOnCourse()
	 */
	@Override
	public Course getCourseByID(String courseID) {

		return actionOnCourse(courseID).get(0);
	}
	
	/**
	 * Get all list of courses
	 * 
	 * @return ArrayList<Course> 
	 * 						- Array of course list will be return
	 * 
	 * @see #actionOnCourse()
	 */
	@Override
	public ArrayList<Course> getCourses() {
		
		return actionOnCourse(null);
	}

	/**
	 * This method delete an course based on the provided ID
	 * 
	 * @param courseID
	 *            - Delete course according to the filtered course details
	 * @throws SQLException
	 *             - Thrown when database access error occurs or this method is
	 *             called on a closed connection
	 * @throws ClassNotFoundException
	 *             - Thrown when an application tries to load in a class through
	 *             its string name using
	 * @throws SAXException
	 *             - Encapsulate a general SAX error or warning
	 * @throws IOException
	 *             - Exception produced by failed or interrupted I/O operations.
	 * @throws ParserConfigurationException
	 *             - Indicates a serious configuration error.
	 * @throws NullPointerException
	 *             - Service is not available
	 */
	@Override
	public void removeCourse(String courseID) {

		// Before deleting check whether course ID is available
		if (courseID != null && !courseID.isEmpty()) {
			/*
			 * Remove course query will be retrieved from CourseQuery.xml
			 */
//			try {
//				connection = DBConnectionUtil.getDBConnection();
//				preparedStatement = connection
//						.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_REMOVE_EMPLOYEE));
//				preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, courseID);
//				preparedStatement.executeUpdate();
//			} catch (SQLException | SAXException | IOException | ParserConfigurationException
//					| ClassNotFoundException e) {
//				log.log(Level.SEVERE, e.getMessage());
//			} finally {
				/*
				 * Close prepared statement and database connectivity at the end
				 * of transaction
				 */
//				try {
//					if (preparedStatement != null) {
//						preparedStatement.close();
//					}
//					if (connection != null) {
//						connection.close();
//					}
//				} catch (SQLException e) {
//					log.log(Level.SEVERE, e.getMessage());
//				}
//			}
			
			db.connect();
			
			
			String query = "delete from course where course.id = \""+courseID+"\"";
			System.out.println(query);
			
			try {
				int status = db.createOrUpdateOrDelete(query);
				
				//ResultSet  rs = db.select("");
				
				if (status == 1)
				{
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			db.disconnect();
		}
	}

	/**
	 * This performs GET course by ID and Display all courses
	 * 
	 * @param courseID
	 *            ID of the course to remove or select from the list

	 * @return ArrayList<Course> Array of course list will be return
	 * 
	 * @throws SQLException
	 *             - Thrown when database access error occurs or this method is
	 *             called on a closed connection
	 * @throws ClassNotFoundException
	 *             - Thrown when an application tries to load in a class through
	 *             its string name using
	 * @throws SAXException
	 *             - Encapsulate a general SAX error or warning
	 * @throws IOException
	 *             - Exception produced by failed or interrupted I/O operations.
	 * @throws ParserConfigurationException
	 *             - Indicates a serious configuration error.
	 * @throws NullPointerException
	 *             - Service is not available
	 * 
	 * @see #getCourses()
	 * @see #getCourseByID(String)
	 */
	private ArrayList<Course> actionOnCourse(String courseID) {

		ArrayList<Course> courseList = new ArrayList<Course>();
		try {
			db.connect();
			String query;
			//connection = DBConnectionUtil.getDBConnection();
			/*
			 * Before fetching course it checks whether course ID is
			 * available
			 */
			if (courseID != null && !courseID.isEmpty()) {
				/*
				 * Get course by ID query will be retrieved from
				 * CourseQuery.xml
				 */
				
				query = "select * from course where id = \""+courseID+"\"";
				System.out.println(query);
				
			}
			/*
			 * If course ID is not provided for get course option it display
			 * all courses
			 */
			else {
				query = "select * from course";
				System.out.println(query);
			}
			ResultSet resultSet = db.select(query);

			while (resultSet.next()) {
				Course course = new Course();
	
				course.setID(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
				course.setName(resultSet.getString(CommonConstants.COLUMN_INDEX_TWO));
				course.setDuration(resultSet.getString(CommonConstants.COLUMN_INDEX_THREE));
				course.setLecturerId(resultSet.getString(CommonConstants.COLUMN_INDEX_FOUR));
				
				courseList.add(course);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return courseList;
	}

	/**
	 * Get the updated course
	 * 
	 * @param courseID
	 *            ID of the course to remove or select from the list
	 * 
	 * @return return the Course object
	 * 
	 */
	@Override
	public Course updateCourse(String courseID, Course course) {

		/*
		 * Before fetching course it checks whether course ID is available
		 */
		if (courseID != null && !courseID.isEmpty()) {
			/*
			 * Update course query will be retrieved from CourseQuery.xml
			 */
//			try {
//				connection = DBConnectionUtil.getDBConnection();
//				preparedStatement = connection
//						.prepareStatement("insert into course (name, email) values (\"dinura\",\"dnw\")");//QueryUtil.queryByID(CommonConstants.QUERY_ID_UPDATE_EMPLOYEE));
//				preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, course.getName());
//				preparedStatement.setString(CommonConstants.COLUMN_INDEX_FIVE, course.getEmail());
//				//preparedStatement.setString(CommonConstants.COLUMN_INDEX_EIGHT, course.getCourseID());
//				preparedStatement.executeUpdate();
//				
//
//			} catch (SQLException //| SAXException | IOException | ParserConfigurationException
//					| ClassNotFoundException e) {
//				log.log(Level.SEVERE, e.getMessage());
//			} finally {
				/*
				 * Close prepared statement and database connectivity at the end
				 * of transaction
				 */
//				try {
//					if (preparedStatement != null) {
//						preparedStatement.close();
//					}
//					if (connection != null) {
//						connection.close();
//					}
//				} catch (SQLException e) {
//					log.log(Level.SEVERE, e.getMessage());
//				}
//			}
			
			db.connect();
			
			String name =course.getName();
			String duration =course.getDuration();
			String lecturer =course.getLecturerId();
			
			
			String query = "update course as c" + 
					       "set c.name = \""+name+"\", c.duration = \""+duration+"\", c.lecturer_id = \""+lecturer+"\"" + 
					       "where l.id = \""+courseID+"\"";
			System.out.println(query);
			
			try {
				int status = db.createOrUpdateOrDelete(query);
				
				//ResultSet  rs = db.select("");
				
				if (status == 1)
				{
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			db.disconnect();
			
		}
		// Get the updated course
		return getCourseByID(courseID);
	}
	
	/**
	 *
	 * @return ArrayList<String> Array of course id list will be return
	 * 
	 * @throws SQLException
	 *             - Thrown when database access error occurs or this method is
	 *             called on a closed connection
	 * @throws ClassNotFoundException
	 *             - Thrown when an application tries to load in a class through
	 *             its string name using
	 * @throws SAXException
	 *             - Encapsulate a general SAX error or warning
	 * @throws IOException
	 *             - Exception produced by failed or interrupted I/O operations.
	 * @throws ParserConfigurationException
	 *             - Indicates a serious configuration error.
	 * @throws NullPointerException
	 *             - Service is not available
	 */
	private ArrayList<String> getCourseIDs(){
		
		ArrayList<String> arrayList = new ArrayList<String>();
		/*
		 * List of course IDs will be retrieved from CourseQuery.xml
		 */
//		try {
//			connection = DBConnectionUtil.getDBConnection();
//			preparedStatement = connection
//					.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_GET_EMPLOYEE_IDS));
//			ResultSet resultSet = preparedStatement.executeQuery();
//			while (resultSet.next()) {
//				arrayList.add(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
//			}
//		} catch (SQLException | SAXException | IOException | ParserConfigurationException
//				| ClassNotFoundException e) {
//			log.log(Level.SEVERE, e.getMessage());
//		} finally {
//			/*
//			 * Close prepared statement and database connectivity at the end of
//			 * transaction
//			 */
//			try {
//				if (preparedStatement != null) {
//					preparedStatement.close();
//				}
//				if (connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				log.log(Level.SEVERE, e.getMessage());
//			}
//		}
		
		try {
			db.connect();
			String query;
		
				
			query = "select s.id from course as s";
			System.out.println(query);
				
			
			ResultSet resultSet = db.select(query);

			while (resultSet.next()) {
				arrayList.add(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return arrayList;
	}
}
