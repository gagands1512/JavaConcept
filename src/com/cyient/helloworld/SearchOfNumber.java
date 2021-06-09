package com.cyient.helloworld;

import java.util.Scanner;

public class SearchOfNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);// TODO Auto-generated method stub
		int number = sc.nextInt();
		int search = sc.nextInt();
		int count=0;
		
		while(number!=0) {			
			int r = number%10;
			if(search==r) {
				count++;
			}
			number = number/10;
		}
		System.out.println(count);
	}

}
