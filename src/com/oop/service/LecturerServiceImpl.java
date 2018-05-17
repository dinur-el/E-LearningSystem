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

import com.oop.model.Lecturer;
import com.oop.util.CommonConstants;
import com.oop.util.DBConnectionUtil;
import com.oop.util.Database;
import com.oop.util.QueryUtil;

public class LecturerServiceImpl implements ILecturerService {
	/** Initialize logger */
	public static final Logger log = Logger.getLogger(LecturerServiceImpl.class.getName());

	Database db = new Database();
	
	private static Connection connection;

	private static Statement statement;

	//static{
		//create table or drop if exist
		//createLecturerTable();
	//}
	
	private PreparedStatement preparedStatement;

	/**
	 * This method initially drop existing Lecturers table in the database and
	 * recreate table structure to insert lecturer entries
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
	
	public static void createLecturerTable() {

		try {
			connection = DBConnectionUtil.getDBConnection();
			statement = connection.createStatement();
			// Drop table if already exists and as per SQL query available in
			// Query.xml
			statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_DROP_TABLE));
			// Create new lecturers table as per SQL query available in
			// Query.xml
			statement.executeUpdate(QueryUtil.queryByID(CommonConstants.QUERY_ID_CREATE_TABLE));

		} catch (SQLException | SAXException | IOException | ParserConfigurationException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
	}
	
	
	/**
	 * Add set of lecturers for as a batch from the selected lecturer List
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
	public void addLecturer(Lecturer lecturer) {

		//String lecturerID = CommonUtil.generateIDs(getLecturerIDs());
		
//		try {
//			connection = DBConnectionUtil.getDBConnection();
//			/*
//			 * Query is available in LecturerQuery.xml file and user
//			 * insert_lecturer key to extract value of it
//			 */
//			preparedStatement = connection
//					.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_INSERT_EMPLOYEES));
//			connection.setAutoCommit(false);
//			
//			//Generate lecturer IDs
//			//lecturer.setLecturerID(lecturerID);
//			//preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, lecturer.getLecturerID());
//			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, lecturer.getName());
//			preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, lecturer.getEmail());
//			// Add lecturer
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
		
		String name =lecturer.getName();
		String educationLevel =lecturer.getEducationLevel();
		String email =lecturer.getEmail();
		String specializtion =lecturer.getSpecialization();
		String username =lecturer.getUsername();
		String password =lecturer.getPassword();
		
		
		String query = "insert into lecturer (name, educationLevel, email, specialization, username, password) values (\""+name+"\",\""+educationLevel+"\",\""+email+"\",\""+specializtion+"\",\""+username+"\",\""+password+"\")";
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

	/**
	 * Lecturer details can be retrieved based on the provided lecturer ID
	 * 
	 * @param lecturerID
	 *            - lecturer details are filtered based on the ID
	 * 
	 * @see #actionOnLecturer()
	 */
	@Override
	public Lecturer getLecturerByID(String lecturerID) {

		return actionOnLecturer(lecturerID).get(0);
	}
	
	/**
	 * Get all list of lecturers
	 * 
	 * @return ArrayList<Lecturer> 
	 * 						- Array of lecturer list will be return
	 * 
	 * @see #actionOnLecturer()
	 */
	@Override
	public ArrayList<Lecturer> getLecturers() {
		
		return actionOnLecturer(null);
	}

	/**
	 * This method delete an lecturer based on the provided ID
	 * 
	 * @param lecturerID
	 *            - Delete lecturer according to the filtered lecturer details
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
	public void removeLecturer(String lecturerID) {

		// Before deleting check whether lecturer ID is available
		if (lecturerID != null && !lecturerID.isEmpty()) {
			/*
			 * Remove lecturer query will be retrieved from LecturerQuery.xml
			 */
//			try {
//				connection = DBConnectionUtil.getDBConnection();
//				preparedStatement = connection
//						.prepareStatement(QueryUtil.queryByID(CommonConstants.QUERY_ID_REMOVE_EMPLOYEE));
//				preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, lecturerID);
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
			
			
			String query = "delete from lecturer where lecturer.id = \""+lecturerID+"\"";
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
	 * This performs GET lecturer by ID and Display all lecturers
	 * 
	 * @param lecturerID
	 *            ID of the lecturer to remove or select from the list

	 * @return ArrayList<Lecturer> Array of lecturer list will be return
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
	 * @see #getLecturers()
	 * @see #getLecturerByID(String)
	 */
	private ArrayList<Lecturer> actionOnLecturer(String lecturerID) {

		ArrayList<Lecturer> lecturerList = new ArrayList<Lecturer>();
		try {
			db.connect();
			String query;
			//connection = DBConnectionUtil.getDBConnection();
			/*
			 * Before fetching lecturer it checks whether lecturer ID is
			 * available
			 */
			if (lecturerID != null && !lecturerID.isEmpty()) {
				/*
				 * Get lecturer by ID query will be retrieved from
				 * LecturerQuery.xml
				 */
				
				query = "select * from lecturer where id = \""+lecturerID+"\"";
				System.out.println(query);
				
			}
			/*
			 * If lecturer ID is not provided for get lecturer option it display
			 * all lecturers
			 */
			else {
				query = "select * from lecturer";
				System.out.println(query);
			}
			ResultSet resultSet = db.select(query);

			while (resultSet.next()) {
				Lecturer lecturer = new Lecturer();
	
				lecturer.setID(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
				lecturer.setName(resultSet.getString(CommonConstants.COLUMN_INDEX_TWO));
				lecturer.setEducationLevel(resultSet.getString(CommonConstants.COLUMN_INDEX_THREE));
				lecturer.setEmail(resultSet.getString(CommonConstants.COLUMN_INDEX_FOUR));
				lecturer.setSpecialization(resultSet.getString(CommonConstants.COLUMN_INDEX_FIVE));
				lecturer.setUsername(resultSet.getString(CommonConstants.COLUMN_INDEX_SIX));
				lecturer.setPassword(resultSet.getString(CommonConstants.COLUMN_INDEX_SEVEN));
				
				lecturerList.add(lecturer);
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
		return lecturerList;
	}

	/**
	 * Get the updated lecturer
	 * 
	 * @param lecturerID
	 *            ID of the lecturer to remove or select from the list
	 * 
	 * @return return the Lecturer object
	 * 
	 */
	@Override
	public Lecturer updateLecturer(String lecturerID, Lecturer lecturer) {

		/*
		 * Before fetching lecturer it checks whether lecturer ID is available
		 */
		if (lecturerID != null && !lecturerID.isEmpty()) {
			/*
			 * Update lecturer query will be retrieved from LecturerQuery.xml
			 */
//			try {
//				connection = DBConnectionUtil.getDBConnection();
//				preparedStatement = connection
//						.prepareStatement("insert into lecturer (name, email) values (\"dinura\",\"dnw\")");//QueryUtil.queryByID(CommonConstants.QUERY_ID_UPDATE_EMPLOYEE));
//				preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, lecturer.getName());
//				preparedStatement.setString(CommonConstants.COLUMN_INDEX_FIVE, lecturer.getEmail());
//				//preparedStatement.setString(CommonConstants.COLUMN_INDEX_EIGHT, lecturer.getLecturerID());
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
			
			String name =lecturer.getName();
			String educationLevel =lecturer.getEducationLevel();
			String email =lecturer.getEmail();
			String spcialization =lecturer.getSpecialization();
			String username = lecturer.getUsername();
			String password = lecturer.getPassword();
			
			
			String query = "update lecturer as l" + 
					       "set l.name = \""+name+"\", l.education_level = \""+educationLevel+"\", l.email = \""+email+"\", l.specialization = \""+spcialization+"\",l.username = \""+username+"\",l.password = \""+password+"\"" + 
					       "where l.id = \""+lecturerID+"\"";
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
		// Get the updated lecturer
		return getLecturerByID(lecturerID);
	}
	
	/**
	 *
	 * @return ArrayList<String> Array of lecturer id list will be return
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
	private ArrayList<String> getLecturerIDs(){
		
		ArrayList<String> arrayList = new ArrayList<String>();
		/*
		 * List of lecturer IDs will be retrieved from LecturerQuery.xml
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
		
				
			query = "select l.id from lecturer as l";
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
