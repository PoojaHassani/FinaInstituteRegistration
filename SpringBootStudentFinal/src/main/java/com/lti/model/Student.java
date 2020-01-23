package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_registration")
public class Student {
	@Id
	@Column(name="student_id")
	private int studentId;
	@Column(name="domicile_state")
	private String domicileState;
	@Column(name="student_name")
	private String studentName;
	@Column(name="gender")
	private String gender;
	@Column(name="mobile_number")
	private int mobileNumber;
	@Column(name="email_id")
	private String emailId;
	@Column(name="password")
	private String studentPassword;
	@Column(name="institute_verification")
	private boolean isInstituteVerified;
	@Column(name="nodal_verification")
	private boolean isNodalVerified;
	@Column(name="ministry_verification")
	private boolean isMinistryVerified;
	
	
	public Student(int studentId, String domicileState, String studentName, String gender, int mobileNumber,
			String emailId, String studentPassword, boolean isInstituteVerified, boolean isNodalVerified,
			boolean isMinistryVerified) {
		super();
		this.studentId = studentId;
		this.domicileState = domicileState;
		this.studentName = studentName;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.studentPassword = studentPassword;
		this.isInstituteVerified = isInstituteVerified;
		this.isNodalVerified = isNodalVerified;
		this.isMinistryVerified = isMinistryVerified;
	}
	public Student() {
		super();
	}

	
	

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getDomicileState() {
		return domicileState;
	}
	public void setDomicileState(String domicileState) {
		this.domicileState = domicileState;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	public boolean isInstituteVerified() {
		return isInstituteVerified;
	}
	public void setInstituteVerified(boolean isInstituteVerified) {
		this.isInstituteVerified = isInstituteVerified;
	}
	public boolean isNodalVerified() {
		return isNodalVerified;
	}
	public void setNodalVerified(boolean isNodalVerified) {
		this.isNodalVerified = isNodalVerified;
	}
	public boolean isMinistryVerified() {
		return isMinistryVerified;
	}
	public void setMinistryVerified(boolean isMinistryVerified) {
		this.isMinistryVerified = isMinistryVerified;
	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", domicileState=" + domicileState + ", studentName=" + studentName
				+ ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ ", studentPassword=" + studentPassword + ", isInstituteVerified=" + isInstituteVerified
				+ ", isNodalVerified=" + isNodalVerified + ", isMinistryVerified=" + isMinistryVerified + "]";
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="institution_code")
	private Institute institute;
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="aadhar_no")
//	private Aadhar aadhar;
}