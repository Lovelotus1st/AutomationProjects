package com.java.practice;

import java.util.Arrays;

public class ReverseNumber {

	public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
		ReverseNumber rn = new ReverseNumber();
		int a = rn.reverse(-1235899999);
		System.out.println(a);		
	}
	//123
	public int reverse(int x){
		int mod=0, div=x, result=0, newresult=0;
		while(div!=0){
			mod=div%10;
			div=div/10;
			newresult=(result*10)+mod;
			if(newresult/10!=result){
				return 0;
			}
			result=newresult;	
		}
		return result;
	}
	public static int reverse1(int x)throws ArrayIndexOutOfBoundsException {
		int len=0;
		char c;
		boolean b=true;
		String con=null;
		if (x<0){
			b=false;
		}
		len=String.valueOf(x).length();
		for (int i=len;i>0;i--){
			c=String.valueOf(x).charAt(i-1);
			if (con==null)
			{
				con=Character.toString(c);
			}else{
				if(i==1 && b==false)
				{
					con="-"+con;
				}else {
					con=con+Character.toString(c);
				}
			}
		}
		return Integer.parseInt(con);
    }

}
