package Lec_08;

public class rotate_a_num {
	public static void main(String[] args) {
		int num = 12345;
		int r = 3;
		rotate2(num, r);
	}

	public static void rotate2(int num, int r) {

		int nod = numOfDigits(num);
		r = r % nod;
		int div = (int) Math.pow(10, r); // 1000
		int p1 = num / div; // 12
		int p2 = num % div;// 345
		System.out.println(p2*Math.pow(10, nod-r)+p1);;
	}

	public static void rotate(int num, int r) {
		int nod = numOfDigits(num);
		r = r % nod;
		for (int cnt = 1; cnt <= r; cnt++) {
			int p1 = num / 10; // 1234
			int p2 = num % 10;// 5

			num = (int) (p2 * Math.pow(10, nod - 1)) + p1;
			System.out.println(num);
		}
	}

	public static int numOfDigits(int num) {
		int cnt = 0;
		while (num > 0) {
			cnt++;
			num = num / 10;
		}
		return cnt;
	}
}
