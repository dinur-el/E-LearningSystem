package com.oop.model;

public class Tutor {

	private String id;
	
	private String name;

	private String email;
	
	private String specialization; 
	
	/**
	 * @return the StudentID
	 */
	public String getTutorID() {
		return id;
	}

	/**
	 * @param studentID the studentID to set
	 */
	public void setTutorID(String tutorID) {
		id = tutorID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the specialization
	 */
	public String getSpecialization() {
		return specialization;
	}

	/**
	 * @param specialization the specialization to set
	 */
	public void setSpecialzation(String specialization) {
		this.specialization = specialization;
	}

	/**
	 * @return the facultyName
	 */
//	public String getFacultyName() {
//		return FacultyName;
//	}

	/**
	 * @param facultyName the facultyName to set
	 */
//	public void setFacultyName(String facultyName) {
//		FacultyName = facultyName;
//	}

	/**
	 * @return the department
	 */
//	public String getDepartment() {
//		return Department;
//	}

	/**
	 * @param department the department to set
	 */
//	public void setDepartment(String department) {
//		Department = department;
//	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the qualifications
	 */
//	public String getQualifications() {
//		return Qualifications;
//	}

	/**
	 * @param qualifications the qualifications to set
	 */
//	public void setQualifications(String qualifications) {
//		Qualifications = qualifications;
//	}

	/**
	 * @return the gender
	 */
//	public String getGender() {
//		return Gender;
//	}

	/**
	 * @param gender the gender to set
	 */
//	public void setGender(String gender) {
//		Gender = gender;
//	}

	@Override
	public String toString() {
		
		return //"Student ID = " + StudentID + "\n" + ""
				 "Tutor Name = " + name + "\n" + "Email = " + email + "\n"+ "Specialization = " + specialization;
				//+ "\n" + "Department = " + Department + "\n" + "Designation = "
				//+ Designation + "\n" + "Qualifications = " + Qualifications + "\n" + "Gender = " + Gender;
	}

}
