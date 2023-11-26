package Lec_08;

public class fn_Demo_1 {

	public static void main(String[] args) {
		int ans = pow(10,2);
		System.out.println(ans);
		Math.pow(10, 2);
	}

	public static void nacho() {
		System.out.println("naach");
	}

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void add3(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static int pow(int a, int b) {
		int ans = 1;

		for (int i = 1; i <= b; i++) {
			ans = ans * a;
		}
		System.out.println(ans);
		return ans;
	}

}
