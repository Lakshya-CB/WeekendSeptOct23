package Lec_Complexity;

public class create_string {
	public static void main(String[] args) {
		String str1 = new String("hello"); // new
		String str2 = "hello"; // literal

		String str3 = new String("hello");
		String str4 = "hello";

		System.out.println((str1 == str2) + " - " + str1.equals(str2));
		System.out.println((str1 == str3) + " - " + str1.equals(str3));
		System.out.println((str1 == str4) + " - " + str1.equals(str4));

	}
}
