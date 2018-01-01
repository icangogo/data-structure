package com.sort;

public class Insert {
    static void insertion_sort(int[] arr)
    {
    	for(int i=1;i<arr.length;i++) {
    		if(arr[i-1]>arr[i]) {
    			int temp=arr[i];
    			int j=i;
    			while(j>0&&arr[j-1]>temp) {
    				arr[j]=arr[j-1];
    				j--;
    			}
    			arr[j]=temp;
    		}
    	}
        
    }

    public static void main(String[] args)
    {
        int[] x = { 6, 2, 4, 1, 5, 9 };
        insertion_sort(x);
        for(int i=0;i<x.length;i++)
        	System.out.println(x[i]);
    }

}
