package Lec_14;

import java.util.Arrays;

public class doubt {
	public static void main(String[] args) {
//	int n = 6;
//	int arr[] = {7,1,5,3,6,4};
//	int maxProfit = Integer.MIN_VALUE;
//	for(int i =0 ;i<arr.length-1 ; i++) {
//		for(int j = i+1 ; j<arr.length ; j++) {
//			int profit = arr[j]-arr[i];
//			if(profit>maxProfit) {
//				maxProfit = profit;
//			}
//		}
//	}
//	System.out.println(maxProfit);
//	System.out.println("=========");
//	buySell_2( arr);

		int targetArr[] = {1,2 , 3 , 4 , 5 , 6 ,7 ,8 , 9};
		int target = 10;
		targetSP(targetArr, target);
	}

	public static void buySell_2(int arr[]) {
		int min = arr[0];
		int maxProfit = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			int profit = arr[i] - min;
			if (profit > maxProfit) {
				maxProfit = profit;
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(maxProfit);
	}

	public static void targetSP(int arr[], int target) {
		Arrays.sort(arr);
		for (int k = 0; k < arr.length - 2; k++) {
			int i = k+1;
			int j = arr.length - 1;
			int rem = target - arr[k];
//			System.out.println(rem);
			while (i < j) {
				if (arr[i] + arr[j] == rem) {
					System.out.println(arr[k] + " , " + arr[i] + " and " + arr[j]);
					i++;
					j--;
				} else if (arr[i] + arr[j] > rem) {
					j--;
				} else {
					i++;
				}
			}
		}
	}

}
