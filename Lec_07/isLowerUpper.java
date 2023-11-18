package Lec_07;

import java.util.Scanner;

public class isLowerUpper {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		System.out.println(ch + "-----");

		if (ch >= 'a' && ch <= 'z') {
			System.out.println("lower");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Uppper");
		} else {
			System.out.println("patanahi!!");
		}

		System.out.println("Hello" + 10);
		System.out.println("Hello" + 10 + 20);
		System.out.println(10 + "Hello" + 10 + 20);
		System.out.println(20 + 10 + "Hello" + 10 + 20);
		System.out.println(20 + 10 + "Hello" + (10 + 20));

	}
}
