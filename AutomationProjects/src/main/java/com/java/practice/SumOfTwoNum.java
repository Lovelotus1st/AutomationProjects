package com.java.practice;

import java.util.Arrays;

public class SumOfTwoNum {

	public static void main(String[] args) {
		int[] num=new int[]{8,5,4,7,1}; //{1,4,5,7,8}
		int[]  arr= new int[2];
		int target=11;
		arr=twoSum1(num,target);
		System.out.println(arr[0] + " " + arr[1]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int sum=0;
		int[] arr1=new int[2];
		//Arrays.sort(nums);
		for(int j=0;j<nums.length-1;j++){
			for(int i=j+1;i<nums.length;i++){
				sum=nums[j]+nums[i];
				if (sum==target){
					arr1[0]=j;
					arr1[1]=i;
					break;
				}
			}
		}
		return arr1;
	}
	
	public static int[] twoSum1(int[] nums, int target) {
		int k;
		int[] arr1=new int[2];
		Arrays.sort(nums);//2,4,5,10
		for(int j=0;j<nums.length-1;j++){
			k=Arrays.binarySearch(nums,target - nums[j]); //4
			if(k>-1){
				arr1[1]=j;
				arr1[0]=k;
			}
		}
		return arr1;
	}
}
