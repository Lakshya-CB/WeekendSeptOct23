package Lec_11;

public class string_Demo {
	public static void main(String[] args) {
		String str = "sky is the blue is is is the";
		String str2 = "??";
//		content compare!!
		System.out.println(str.equals(str2));
		
		
		System.out.println(str.length());
//		ith index!!?
		System.out.println(str.charAt(str.length() - 1));
//		prefix!!
		System.out.println(str.startsWith("Abc"));
//		suffix!!
		System.out.println(str.endsWith("cd"));
//		find function!!, first occurrence 
		System.out.println(str.indexOf("sky"));
//		find!! last occurrence
		System.out.println(str.lastIndexOf("sky"));
		str = "nittin";
//		printAllSubStrings(str);
		palinSS(str);

	}

	public static boolean isPalin(String str) {
		int l = 0;
		int r = str.length() - 1;
		while (l < r) {
			if (str.charAt(l) != str.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

	public static void printAllSubStrings(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				String ss = str.substring(s, e);
				if (isPalin(ss)) {
					System.out.println(ss);
				}
			}
		}
	}
	public static void palinSS(String str) {
		for(int axis = 0;axis < str.length();axis++) {
			grow(str, axis, axis); // odd
			grow(str, axis, axis+1); // even!!
			
		}
	}
	public static void grow(String str, int L, int R) {
		while(L>=0 && R<str.length()) {
			if(str.charAt(L)!=str.charAt(R)) {
				return;
			}
			System.out.println(str.substring(L,R+1));
			L--;R++;
			
		}
		
	}
	public static boolean isAnangram(String str, String tar) {
		int[] batua =  new int[26];
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			batua[ch-'a']++;
		}
		
		for(int i=0;i<tar.length();i++) {
			char ch = tar.charAt(i);
			batua[ch-'a']--;
		}
		for(int freq :batua) {
			if(freq!=0) {
				return false;
			}
		}
		return true;
	}

}
