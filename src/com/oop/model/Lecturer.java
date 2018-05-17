package com.oop.model;

public class Lecturer extends User {
	
	private String specialization; 
	
	private String educationLevel;
	
//	/**
//	 * @return the id
//	 */
//	public String getId() {
//		return this.id;
//	}
//
//	/**
//	 * @param id the id to set
//	 */
//	public void setID(String newId) {
//		this.id = newId;
//	}
//
//	/**
//	 * @return the name
//	 */
//	public String getName() {
//		return this.name;
//	}
//
//	/**
//	 * @param name the name to set
//	 */
//	public void setName(String newName) {
//		this.name = newName;
//	}
//
//	/**
//	 * @return the email
//	 */
//	public String getEmail() {
//		return this.email;
//	}
//
//	/**
//	 * @param email the email to set
//	 */
//	public void setEmail(String newEmail) {
//		this.email = newEmail;
//	}
//	
	/**
	 * @return the specialization
	 */
	public String getSpecialization() {
		return this.specialization;
	}

	/**
	 * @param specialization the specialization to set
	 */
	public void setSpecialization(String newSpecialization) {
		this.specialization = newSpecialization;
	}
	
	/**
	 * @return the educationLevel
	 */
	public String getEducationLevel() {
		return this.educationLevel;
	}

	/**
	 * @param specialization the specialization to set
	 */
	public void setEducationLevel(String newEducationLevel) {
		this.educationLevel = newEducationLevel;
	}
	
//	/**
//	 * @return the username
//	 */
//	public String getUsername() {
//		return this.username;
//	}
//
//	/**
//	 * @param username the username to set
//	 */
//	public void setUsername(String newUsername) {
//		this.username = newUsername;
//	}
//
//	/**
//	 * @return the password
//	 */
//	public String getPassword() {
//		return this.password;
//	}
//
//	/**
//	 * @param password the password to set
//	 */
//	public void setPassword(String newPassword) {
//		this.password = newPassword;
//	}

	@Override
	public String toString() {
		
		return "Lecturer ID = " + this.id + "\n" 
			   +"Lecturer Name = " + this.name + "\n" 
			   +"Lecturer Email = " + this.email + "\n"
			   +"Lecturer Specialization = " + this.specialization + "\n";
	}

}
