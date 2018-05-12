package com.oop.model;

public class Course {

	private int id;
	private String name;
	private String duration;
	private int tutorId;
	
	/**
	 * @return the id
	 */
	public int getID() {
		return this.id;
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
	 * @return the tutorId
	 */
	public int getTutorId() {
		return this.tutorId;
	}

	/**
	 * @param tutorId the tutorId to set
	 */
	public void setFacultyName(int newTutorId) {
		this.tutorId = newTutorId;
	}

	@Override
	public String toString() {
		
		return "Course ID = " + id + "\n" 
			   +"Course Name = " + name + "\n" 
			   +"Course Duration = " + duration + "\n"
			   +"Tutor ID = " + tutorId + "\n";
	}
}
