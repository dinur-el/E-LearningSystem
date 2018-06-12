package com.oop.model;

public class CourseContent {

	private String id;
	private String name;
	private String dateUploaded;
	private String lecturerId;
	private String courseId;
	
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
	 * @return the dateUploaded
	 */
	public String getDateUploaded() {
		return this.dateUploaded;
	}

	/**
	 * @param dateUploaded the dateUploaded to set
	 */
	public void setDateUploaded(String newDate) {
		this.dateUploaded = newDate;
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
	 * @return the courseId
	 */
	public String getCourseId() {
		return this.courseId;
	}

	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(String newCourseId) {
		this.courseId = newCourseId;
	}

	@Override
	public String toString() {
		
		return "Course ID = " + id + "\n" 
			   +"Content Name = " + name + "\n" 
			   +"Content Upload Date = " + dateUploaded + "\n"
			   +"Course = " + courseId + "\n"
			   +"Lecturer ID = " + lecturerId + "\n";
	}
}
