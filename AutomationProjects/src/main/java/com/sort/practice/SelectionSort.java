package com.sort.practice;
import com.sort.practice.SortBase;
public class SelectionSort{

	public static void main(String[] args){
		SortBase obj=new SortBase();
		int[] arr= new int[]{4,9,8,2,10};
		int num=0;
		for(int i=0; i<arr.length;i++){
			for(int j=i+1; j<arr.length;j++){
				if (arr[i]<=arr[j]){
					num=arr[i];
				}else {
					num=arr[j];
					arr[j]=arr[i];
					arr[i]=num;
				}
			}
		}
		obj.ArrayDisplay(arr);
	}

}
