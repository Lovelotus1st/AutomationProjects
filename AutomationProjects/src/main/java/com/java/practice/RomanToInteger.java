package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
//	Given a roman numeral, convert it to an integer.
//	Input is guaranteed to be within the range from 1 to 3999.
//	I=1
//	V=5
//	X=10
//	L=50
//	C=100
//	D=500
//	M=1000

	public static void main(String[] args) {
		RomanToInteger roi=new RomanToInteger();
		int num=roi.romanToInt("X");
		System.out.println(num);

	}
	public int romanToInt(String s) {
		Map<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('I', 1);hm.put('V', 5);hm.put('X', 10);hm.put('L', 50);
		hm.put('C', 100);hm.put('D', 500);hm.put('M', 1000);
		int len=s.length();
		int r=0,result=0, num1=0,num2=0, num=0;
		if (len==1){
			return hm.get(s.charAt(0));
		}
		for(int i=0;i<len-1;i++){
			num1=hm.get(String.valueOf(s).charAt(i));
			num2=hm.get(String.valueOf(s).charAt(i+1));
			if (i==0){r=num1;num=num1;}
			if (num1>num2 ){
				r=r+num2;
				num=num2;
			}else if(num1<num2){
				r=r+(num2-num1)-num;
			}else if (num1==num2){
				r=r+num2;
			}
			result=r;
		}
		return result;
    }

}
