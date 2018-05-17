package com.oop.model;

public class Course {

	private String id;
	private String name;
	private String duration;
	private String lecturerId;
	
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
	 * @return the Duration
	 */
	public String getDuration() {
		return this.duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String newDuration) {
		this.duration = newDuration;
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

	@Override
	public String toString() {
		
		return "Course ID = " + id + "\n" 
			   +"Course Name = " + name + "\n" 
			   +"Course Duration = " + duration + "\n"
			   +"Lecturer ID = " + lecturerId + "\n";
	}
}
