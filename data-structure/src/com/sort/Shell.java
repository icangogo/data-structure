package com.sort;

public class Shell {
	// 希尔排序
	public static void shell_sort(int[] x) {
		int i,j;
		int r, temp;
		int k=0;
		for(r=x.length/2;r>=1;r/=2) {              //   分组
			for(i=r;i<x.length;i++) {
				temp=x[i];
				j=i-r;
				while(j>=0&&temp<x[j]) {
					x[j+r]=x[j];
					j-=r;
				}
				x[j+r]=temp;
			}
			System.out.println("步长-----"+r);
		}
	}
	public static void main(String[] args)
    {
        int[] x = { 6, 2, 4, 1, 5, 9 ,10,6,3,2,9,22,11,88,32,123};
        shell_sort(x);
        for(int i=0;i<x.length;i++)
        	System.out.println(x[i]);
    }
}
