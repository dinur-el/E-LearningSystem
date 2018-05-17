package com.oop.model;

public class User {

	protected String id;
	
	protected String name;

	protected String email;
	
	protected String username;
	
	protected String password;
	
	/**
	 * @return the id
	 */
	public String getID() {
		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setID(String newId) {
		this.id = newId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String newPassword) {
		this.password = newPassword;
	}

	@Override
	public String toString() {
		
		return "User ID = " + this.id + "\n" 
				+"User Name = " + this.name + "\n"
				+"User Email = " + this.email + "\n"
				+"User Username = " + this.username + "\n"
				+"User Password = " + this.password + "\n";
		}
}
