package com.cyient.helloworld;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breath = sc.nextInt();
		for(int i=0;i<length;i++){
			System.out.print("*");
		}
		System.out.println();// TODO Auto-generated method stub
		for(int i=0;i<breath;i++) {
			System.out.print("*");
			for(int j=0;j<length;j++){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for(int i=0;i<length;i++){
			System.out.print("*");
		}
	}

}
