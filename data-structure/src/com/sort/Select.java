package com.sort;

public class Select {
	// 选择排序
	static void select_sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					swap(arr,i,j);
				}
				
			}
		}
		
	}
	public static void main(String[] args)
    {
        int[] x = { 6, 2, 4, 1, 5, 9 };
        select_sort(x);
        for(int i=0;i<x.length;i++)
        	System.out.println(x[i]);
    }
	// 交换数据
	static void swap(int[] arr,int i,int j){
		if(i!=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
