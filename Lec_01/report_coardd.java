package Lec_01;

public class report_coardd {
	public static void main(String[] args) {
		int marks = 72;
		if (90 > marks && marks >= 80) {
			System.out.println("B");
		} else if (70 > marks && marks >= 60) {
			System.out.println("D");
		} else if (80 > marks && marks >= 70) {
			System.out.println("C");
		} else if (marks >= 90) {
			System.out.println("A");
		} else if (60 > marks && marks >= 50) {
			System.out.println("E");
		} else {
			System.out.println("F");
		}
	}
}
