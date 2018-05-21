package com.oop.model;

public class Course {

	private String id;
	private String name;
	private String category;
	private String lecturerId;
	private String description;
	
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
	 * @return the Name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param Name the name to set
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	/**
	 * @return the Category
	 */
	public String getCategory() {
		return this.category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String newCategory) {
		this.category = newCategory;
	}

	/**
	 * @return the lecturerId
	 */
	public String getLecturerId() {
		return this.lecturerId;
	}

	/**
	 * @param lecturerId the lecturerId to set
	 */
	public void setLecturerId(String newLecturerId) {
		this.lecturerId = newLecturerId;
	}
	
	/**
	 * @return the lecturerId
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param lecturerId the lecturerId to set
	 */
	public void setDescription(String newDescription) {
		this.description = newDescription;
	}

	@Override
	public String toString() {
		
		return "Course ID = " + id + "\n" 
			   +"Course Name = " + name + "\n" 
			   +"Course Category = " + category + "\n"
			   +"Course Description = " + description + "\n"
			   +"Lecturer ID = " + lecturerId + "\n";
	}
}
