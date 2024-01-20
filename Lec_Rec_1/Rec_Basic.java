package Lec_Rec_1;

public class Rec_Basic {
	public static void main(String[] args) {
//		PI(4);
//		PDI(4);
//		System.out.println(Fac(4));
		System.out.println(Fib(3));
	}

	public static void PI(int n) {
		if (n == 1) {
			System.out.println(1);
			return;
		}
//		BP : PI(n)
//		SP : PI(n-1)
		PI(n - 1);
		System.out.println(n);
	}

	public static void PD(int n) {
		if (n == 1) {
			System.out.println(1);
			return;
		}
//		BP : PD(n)
//		SP : PD(n-1)
		System.out.println(n);
		PD(n - 1);
	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
//		BP : PDI (n)
//		SP :  PDI(n-1)
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static int Fac(int n) {
		if(n==0) {
			return 1;
		}
//		BP : Fac(5)
//		SP : Fac(4)
		int sp = Fac(n - 1);
		return sp * n;
	}
	public static int Fib(int n ) {
//		BP : Fibo(n)
//		SP : Fibo(n-1), Fibo(n-2)
		if(n==1) {
			return 1;
		}
		if(n==0) {
			return 0;
		}
		int sp1 = Fib(n-1);
		int sp2 = Fib(n-2);
		return sp1+sp2;
	}
}
