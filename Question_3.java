package com.question;
import java.util.Arrays;

public class Question_3 {
	
	public static int nthsmallest(int[] arg, int x){
		Arrays.sort(arg);
		return arg[x-1];
	}

	public static void main(String[] args) {
		int n=5;
		//Generates 500 random numbers between 1-500.
		int[] numbers=new int[500];
		for(int i=0; i<numbers.length; i++){
			numbers[i]=(int)(Math.random()*500+1);
		}
		System.out.println(Arrays.toString(numbers)); //Print the list of numbers
		System.out.println(n+"th smallest number is: "+nthsmallest(numbers,n)); //Print the nth smallest number.
	 }
	}
	