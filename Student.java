package week3.day1.student;

import week3.day1.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name - Sachin");
	}

	public void studentDept() {
		System.out.println("Student Dept - ECE ");
	}

	public void studentID() {
		System.out.println("Student ID - 8545");
	}

	public static void main(String[] args) {

		Student details = new Student();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
		details.departmentName();
		details.studentName();
		details.studentDept();
		details.studentID();

	}

}
