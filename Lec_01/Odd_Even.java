package Lec_01;

public class Odd_Even {
	public static void main(String[] args) {
		int num = 46;
		int rem = num % 2;
		System.out.println(rem);
		if(0==rem) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}

	}
}
