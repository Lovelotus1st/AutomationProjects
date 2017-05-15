package com.sort.practice;
import com.sort.practice.SortBase;
public class InsertionSort {

	public static void main(String[] args) {
		SortBase obj= new SortBase();
		int arr[]=new int[]{9,8,4,5,10};
		int j=0;
		int index=0;
		for(int i=1;i<arr.length;i++){
			index=arr[i];//8
			j=i-1;//0
			while(j>=0 && arr[j]>index){
				//System.out.println(j + ": arr[j+1] = " + arr[j+1] + " arr[j] = " + arr[j]);
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=index;
			//System.out.println(j + "index : arr[j+1] = " + index);
		}
		obj.ArrayDisplay(arr);

	}

}
