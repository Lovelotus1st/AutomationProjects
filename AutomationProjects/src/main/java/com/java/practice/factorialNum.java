package com.java.practice;

public class factorialNum {

	public static void main(String[] args) {
		int num=factorial(5);
		System.out.println(num);
	}
	public static int factorial(int num){
		int fact=1;
		for (int i=num; i>1;i--){
			fact=fact*i;
		}
		return fact;
	}

}
