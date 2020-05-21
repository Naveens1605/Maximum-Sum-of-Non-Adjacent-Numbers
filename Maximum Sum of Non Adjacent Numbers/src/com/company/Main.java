package com.company;
import java.util.Scanner;

public class Main {
	public static int maxsum( int[] ar, int m){
		int incl = ar[0];
		int excl = 0;
		for (int j = 1; j < m; j++) {
			int excl_new = incl > excl ? incl : excl;
			incl = ar[j] + excl;
			excl = excl_new;
		}
		int res = (incl > excl) ? incl : excl;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements of Array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int c =  maxsum(arr,n);
		System.out.println("Maximum Sum of Non Adjacent Numbers is : " + c);
	}
}

