package week1Lab1;

import java.util.ArrayList;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. Show  an efficient way to create an array for first 50 integers?
		
		
//		IMPORT JAVA.UTIL.ARRAYS METHOD
//		Array.fill has two parameters, first is the name of the array, second is the value to fill it with
		
		int[] arrayToFill = new int[50];
		
		Arrays.fill(arrayToFill, 50);
		
		for(int value : arrayToFill  ) {
			
			System.out.println(value);
		};
		
		

		 
		
		
	}

}
