package Lec_HM_Graph_Big;

import java.util.HashMap;
import java.util.PriorityQueue;

public class top_K_modt_freq {
	public static void main(String[] args) {
		int[] arr = { 5, 1, 3, 5, 2 };
		int k = 2;
		solve(arr, k);
	}

	public static void solve(int[] arr, int k) {
		HashMap<Integer, Integer> HM = new HashMap<>();
		for (int ali : arr) {
			int prev_freq = HM.getOrDefault(ali, 0);
			HM.put(ali, prev_freq + 1);
			printTopK(HM, k);
		}
//		System.out.println(HM);
//		printTopK(HM, k);
	}

	static class pair implements Comparable<pair>{
		int ali;
		int freq;

		public pair(int a, int f) {
			ali = a;
			freq = f;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "{"+ali+"=>"+freq+"}";
		}
		public int compareTo(pair o) {
			int diff =  o.freq - this.freq;
			if(diff==0) {
				return this.ali - o.ali;
			}else {
				return diff;
			}
		}
	}

	private static void 
	printTopK(HashMap<Integer, Integer> HM, 
			int k) {
		PriorityQueue<pair> PQ = new PriorityQueue<>();
		for(int K: HM.keySet()) {
			PQ.add(new pair(K,HM.get(K)));
		}
		System.out.println(PQ);
		for(int cnt = 1;cnt <=k && cnt <= HM.size();cnt++) {
			System.out.print(PQ.poll().ali+" ");
		}
		System.out.println();
		System.out.println("==========");
	}
}
