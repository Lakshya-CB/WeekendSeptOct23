package Lec_Rec_1;

import Lec_10.subarra;

public class multi_p1 {
	public static void main(String[] args) {
//		CoinToss(2, "");
//		ClimbStairs(0, "", 3);
		SubSequence("ab", "");
	}

	public static void CoinToss(int n, String path) {
		if (n == 0) {
			System.out.println(path);
			return;
		}
		CoinToss(n - 1, path + "H");
		CoinToss(n - 1, path + "T");

	}
	public static void ClimbStairs(int curr, String path,
			int dest) {
		if(curr==dest) { //+ ve
			System.out.println(path);
			return;
		}
		if(curr>dest) { //-ve BC
			return;
		}
		
		ClimbStairs(curr+1, path+1, dest);
		ClimbStairs(curr+2, path+2, dest);
	}
	public static void SubSequence(String str, String path) {
		if(str.length()==0) {
			System.out.println(path+"==");
			return;
		}
//		BP : str = "abcd"
//		SP :  "bcd"
		char ch = str.charAt(0);
		String remain = str.substring(1);// bcd
		SubSequence(remain, path+ch);
		SubSequence(remain, path);
		
	}
}
