

package com.sort;




public class Fastsort {
	// 快速排序
	static void fast_sort(int[] arr,int left,int right) {
		int middle;
		if(left<right) {
			middle=getPartition(arr,left,right);
			fast_sort(arr, left, middle-1);
			fast_sort(arr, middle+1, right);
		}
		
	}
	private static int getPartition(int[] arr, int left, int right) {
		int pivot=arr[left];
		while(left<right) {
			while(left<right&&arr[right]>=pivot) {
				right--;
			}
            arr[left] = arr[right];
			while(left<right&&arr[left]<=pivot) {
				left++;
			}
            arr[right] = arr[left];
		}
		 arr[left] = pivot;
	     return left;
	}
	public static void main(String[] args)
    {
        int[] x = { 6,3,7,4,1 };
        fast_sort(x,0,x.length-1);
        for(int i=0;i<x.length;i++)
        	System.out.println(x[i]);
    }
}
