package com.cyient.helloworld;

public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int percent =33;
		
		if(percent>=90 && percent<=100) {
			System.out.println("A");
		}
		else if(percent<90 && percent>=80){
			System.out.println("B");
		}
		else if(percent<80 && percent>=60){
			System.out.println("C");
		}
		else if(percent<60 && percent>=33){
			System.out.println("D");
		}
		else {
			System.out.println("E");
		}
	}

}
