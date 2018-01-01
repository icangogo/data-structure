package com.sort;

public class MergeSort {
	
	// 完成一遍排序
	private static void mergeOne(int []arr,int [] nums,int n,int len) {
		int i,j,k,s,e;                       // i代表前一个有序列的下标，j代表后一个有序列的下标，e判断是否越界
		s=0;                                // 每次都要在s位置遍历
		while(s+len<n) {
			e=s+2*len-1;
			if(e>=n) { 
				e=n-1;
			}
			// 相邻两个有序段合并
			k=s;
			i=s;
			j=s+len;
			while(i<s+len&&j<=e) {
				System.out.println(i+"---------------"+j);
				if(arr[i]<=arr[j]) {
					nums[k++]=arr[i++];
					System.out.println(nums[k-1]);
				}else {
					nums[k++]=arr[j++];
					System.out.println(nums[k-1]);
				}
			}
			while(i<s+len) {
				nums[k++]=arr[i++];
				System.out.println(nums[k-1]);
			}
			while(j<=e) {
				nums[k++]=arr[j++];
				System.out.println(nums[k-1]);
			}
			s=e+1;
		}
		// 把剩余的数合并
		if(s<n) {
			for(;s<n;s++) {
				nums[s]=arr[s];
			}
		}
		
	}
	// 归并排序
	public static void mergeSort(int [] arr,int n) {
		int h,count,len,flag;
		count=0;
		len=1;                              // 步长
		flag=0;
		int  [] p=new int[n];
		while(len<n) {
			if(flag==1) {
				MergeSort.mergeOne(p,arr,n,len);
			}else {
				MergeSort.mergeOne(arr,p,n,len);
			}
			len=len*2;
			flag=1-flag;
			count++;
			System.out.println("第"+count+"步排序结果");
			for(h=0;h<n;h++) {
				System.out.println(arr[h]);
			}
		}
		if(flag==1) {
			for(h=0;h<n;h++) {
				arr[h]=p[h];
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr = { 67, 65, 77, 38, 97, 3, 33, 49,34 };
		MergeSort.mergeSort(arr,arr.length);
		System.out.println("-----------------------------");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
