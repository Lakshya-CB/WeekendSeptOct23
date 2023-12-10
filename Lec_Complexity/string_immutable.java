package Lec_Complexity;

public class string_immutable {
	public static void main(String[] args) {
		String str = "abcd";
		String str2 = str;
		str = str+"?";
		System.out.println(str);
		System.out.println(str2);
		
	}
}
