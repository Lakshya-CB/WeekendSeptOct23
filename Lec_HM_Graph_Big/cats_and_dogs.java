package Lec_HM_Graph_Big;

import java.util.ArrayList;
import java.util.HashMap;

public class cats_and_dogs {
	public static void main(String[] args) {
		String s = "catsanddogs";
		String t = "taannod";
		solve(s, t);
	}

	public static int solve(String s, String t) {
		int ans = 0;
//		int ans =HashMap<K, V>	HM(ch, AL<index!!>)
		HashMap<Character, ArrayList<Integer>> HM= new HashMap<>();
		for(int idx = 0;idx< s.length();idx++) {
			char ch = s.charAt(idx);
			ArrayList<Integer> Ind = HM.getOrDefault(ch, new ArrayList<>());
			Ind.add(idx);
			HM.put(ch, Ind);
		}
		System.out.println(HM);
		int prev = -1;
		for(int i = 0;i<t.length();i++) {
			char ch = t.charAt(i);
			if(!HM.containsKey(ch)) {
				return -1;
			}
			ArrayList<Integer> Ind = HM.get(ch); 
			System.out.println(ch+"=="+Ind + "=="+prev);
			if(Ind.get(Ind.size()-1)<=prev) {
				prev = Ind.get(0);
				ans++;
				System.out.println(ch + " found on "+prev+" __ "+ans);
				System.out.println("===============");
				continue;
			}
			//[1,4,5,7,11]
			// prev = 5
			
			int start =0;
			int end = Ind.size()-1;
			int f = end;
			while(start<=end) {
				int mid = (start+end)/2;
				if(Ind.get(mid)<=prev) {
					start = mid+1;
				}else {
					f = mid;
					end = mid-1;
				}
			}
			prev = Ind.get(f);
			System.out.println(ch + " found on "+prev+" __ "+ans);
			System.out.println("===============");
		}
		return ans;
	}
}
