package com.cyient.helloworld;

import java.util.Scanner;

public class AssendingOrder {

	public static void main(String[] args) {
		
		int[] number = new int[4];
		Scanner sc = new Scanner(System.in);
	      for(int i=0;i<number.length;i++) {
	    	  number[i] = sc.nextInt();
	      }
	      for(int i=0;i<number.length;i++) {
	    	  for(int j=0;j<number.length-i-1;j++) {
	    		  if(number[j]>number[j+1]){
			    	  number[j]=number[j+1]+number[j];
			    	  number[j+1]=number[j]-number[j+1];
			    	  number[j]=number[j]-number[j+1];
			      }
	    	  }
	    	  
	      }
	      for(int i=0;i<number.length;i++) {
	    	  System.out.println(number[i]);
	      }
	      // TODO Auto-generated method stub

	}

}
