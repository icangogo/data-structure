package com.sort;

public class Bubble {
	//冒泡排序
	public static void bubble_sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	public static void main(String[] args)
    {
        int[] x = { 6, 2, 4, 1, 5, 9 };
        bubble_sort(x);
        for(int i=0;i<x.length;i++)
        	System.out.println(x[i]);
    }
	
	static void swap(int[] arr,int i,int j){
		if(i!=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
    
}
