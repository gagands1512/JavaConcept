package com.cyient.helloworld;

import java.util.Scanner;

public class BinaryTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		for(int i=0;i<no;i++){
			for(int j=0;j<i;j++) {
				if((i+j)%2==0)
					System.out.print(0);
				else
					System.out.print(1);
			}
			System.out.println();
		}// TODO Auto-generated method stub

	}

}
