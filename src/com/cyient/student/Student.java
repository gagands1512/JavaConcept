package com.cyient.student;

public class Student {
	int studentId;
	String studentName;
	String emailId;
	static String schoolName;
	int studentPercent;
	public static void printStudentDetails(Student s) {
		System.out.println(s.studentId);
		System.out.println(s.studentName);
		System.out.println(s.emailId);
		System.out.println(schoolName);
		System.out.println(s.studentPercent);
		System.out.println();
	}
}
