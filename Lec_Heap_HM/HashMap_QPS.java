package Lec_Heap_HM;

import java.util.HashMap;

public class HashMap_QPS {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 10, 20, 10, 10 };
		int[] arr2 = { 20, 30, 30, 30, 10, 40, 50 };
		Intersection(arr1, arr2);
	}

	public static int[] sum2(int[] arr, int target) {
		int[] ans = new int[2];
//		HashMap<idx,arr[idx]> HM ;
		HashMap<Integer, Integer> HM = new HashMap<>();
		for (int idx = 0; idx < arr.length; idx++) {
			HM.put(arr[idx], idx);
		}
		for (int i = 0; i < arr.length; i++) {
			int ali = arr[i];
			int dusra = target - ali;
			if (HM.containsKey(dusra) && HM.get(dusra) != i) {
				ans[0] = i;
				ans[1] = HM.get(dusra);
				return ans;
			}
		}
		return ans;
	}

	public static void Intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> HM = new HashMap<>();

		for (int ali : arr2) {
//			int prev_freq = 0;
//			if(HM.containsKey(ali)) {
//				prev_freq = HM.get(ali);
//			}
			int prev_freq = HM.getOrDefault(ali, 1);
			HM.put(ali, prev_freq + 1);
		}
		System.out.println(HM);
		for (int ali : arr1) {
			if (HM.containsKey(ali) && HM.get(ali) > 0) {
				System.out.println(ali);
				int prev_freq = HM.get(ali);
				HM.put(ali, prev_freq - 1);
			}
		}
		System.out.println(HM);
	}
}
