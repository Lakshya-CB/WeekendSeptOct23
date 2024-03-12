package Lec_March_extra;

import java.util.Scanner;

public class Max_NUmber_K_swap {
	static long global = 0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long l = scn.nextLong();
		int k = scn.nextInt();
		solve((l+"").toCharArray(), k);
		System.out.println(global);
		
	}
	public static void solve(char[] arr, int k) {
		String ans ="";
		for(char ch : arr) {
			ans = ans + ch;
		}
		Long ansI = Long.parseLong(ans);
//		System.out.println(ansI);
		global = Math.max(global, ansI);
		if(k==0) {
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
//				i and j swap!!
				swap(arr,i,j);
				solve(arr,k-1);
				swap(arr,j,i);
			}
		}
	}
	private static void swap(char[] arr, int j, int i) {
		// TODO Auto-generated method stub
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
