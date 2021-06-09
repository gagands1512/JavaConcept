package com.cyient.student;

public class StudentTest {

	public static void main(String[] args) {
		Student.schoolName = "Global school";
		
		Student s1 = new Student();
		s1.studentId = 1001;
		s1.studentName = "Jack";
		s1.emailId = "jack@gmail.com";
		s1.studentPercent = 45;
		Student.printStudentDetails(s1);
		
		Student s2 = new Student();
		s2.studentId = 1002;
		s2.studentName = "Peter";
		s2.emailId = "peter@gmail.com";
		s2.studentPercent = 96;
		Student.printStudentDetails(s2);
		
		Student s3 = new Student();
		s3.studentId = 1003;
		s3.studentName = "Mark";
		s3.emailId = "mark@gmail.com";
		s3.studentPercent = 89;
		Student.printStudentDetails(s3);// TODO Auto-generated method stub

	}

}
