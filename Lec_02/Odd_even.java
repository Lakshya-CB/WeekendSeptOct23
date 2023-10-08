package Lec_02;

public class Odd_even {
	public static void main(String[] args) {
		int num = 37;
		int Q = num / 2;
		int Rem = num % 2;
		System.out.println(Q);
		System.out.println(Rem);
		if(Rem==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}
