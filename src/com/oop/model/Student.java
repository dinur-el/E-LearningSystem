package com.oop.model;

public class Student {

	//private String StudentID;
	
	private String Name;

	private String Email;
	
	/**
	 * @return the StudentID
	 */
	//public String getStudentID() {
	//	return StudentID;
	//}

	/**
	 * @param studentID the studentID to set
	 */
	//public void setStudentID(String studentID) {
	//	StudentID = studentID;
	//}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the designation
	 */
//	public String getDesignation() {
//		return Designation;
//	}

	/**
	 * @param designation the designation to set
	 */
//	public void setDesignation(String designation) {
//		Designation = designation;
//	}

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
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
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
				 "Student Name = " + Name + "\n" + "Email = " + Email;// + "\n"
				//+ "Faculty Name = " + FacultyName + "\n" + "Department = " + Department + "\n" + "Designation = "
				//+ Designation + "\n" + "Qualifications = " + Qualifications + "\n" + "Gender = " + Gender;
	}
}
