package Lec_Rec_extra_class;

import java.util.Arrays;
import java.util.Scanner;

public class biggest_number {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			t--;
			int[] arr = new int[scn.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			for (int cnt = 1; cnt <= arr.length; cnt++) {
				for(int s =0;s<=arr.length-2;s++) {
//					bubble => s and s+1;
					if(compareTo(arr[s],arr[s+1])<0) {
						int temp = arr[s];
						arr[s] = arr[s+1];
						arr[s+1] = temp;
					}
				}
			}
//			System.out.println(Arrays.toString(arr));
			for(int ali: arr) {
				System.out.print(ali);
			}
			System.out.println();
		}
	}

	public static long compareTo(int n1, int n2) {
		String num1 = n1 + "" + n2;
		String num2 = n2 + "" + n1;
		return Long.parseLong(num1) - Long.parseLong(num2);
	}
}
