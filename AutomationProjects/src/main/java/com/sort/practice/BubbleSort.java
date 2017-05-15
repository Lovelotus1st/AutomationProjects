package com.sort.practice;
import com.sort.practice.SortBase;
public class BubbleSort {
	public static void main(String[] args) {
		SortBase obj= new SortBase();
		int arr[]= new int[]{4,8,2,9,5,6};
		int num=0;
		for(int i=0;i<arr.length;i++){
			for(int j=1; j<arr.length-i;j++){
				if(arr[j-1]>arr[j]){
					num=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=num;
				}
				//System.out.println(" ");
			}
		}
		obj.ArrayDisplay(arr);

	}

}
