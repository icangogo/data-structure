package com.sort;

public class Heap {
	public static void heapSort(int[] arr, int n) {
		int i, j, k, h, t;
		for (i = n / 2 - 1; i >= 0; i--) {
			//System.out.println("i----------"+i);
			while (2 * i + 1 < n) {
				j = 2 * i + 1;
				if ((j + 1) < n) {
					if (arr[j] < arr[j + 1]) {
						//System.out.println(arr[j]+"-------------"+arr[j+1]);
						//System.out.println("------ggg----");
						j++;
					}
				}
				if (arr[i] < arr[j]) {
					//System.out.println(arr[i]+"+++++++"+arr[j]);
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
					i = j;
				} else {
					break;
				}
			}
		}
		System.out.println("原数据构成的堆");
		for(h=0;h<arr.length;h++) {
			System.out.println(""+arr[h]);
		}
		for (i = n - 1; i > 0; i--) {
			t = arr[0];
			arr[0] = arr[i];
			arr[i] = t;
			System.out.println(arr[i]);
			k = 0;
			while (2 * k + 1 < i) {
				System.out.println("hello    ===="+i);
				j = 2 * k + 1;
				if (j + 1 < i) {
					if (arr[j] < arr[j + 1]) {
						System.out.println(arr[j]+"-----"+arr[j + 1]);
						j++;
					}
				}
				if (arr[k] < arr[j]) {
					System.out.println(arr[k]+"-----"+arr[j]);
					t = arr[k];
					arr[k] = arr[j];
					arr[j] = t;
					k = j;
					System.out.println("k==========" +k);
				} else {
					break;
				}
			}
			/*System.out.println("第" +(n-i)+"步排序结果");
			for(h=0;h<arr.length;h++) {
				System.out.println(""+arr[h]);
			}*/
		}
	}



	public static void main(String[] args) {
		int[] arr = { 67, 65, 77, 38, 97, 3, 33, 49 };
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		System.out.println("-----------------------");
		Heap.heapSort(arr, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
