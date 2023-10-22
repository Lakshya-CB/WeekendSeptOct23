package Lec_05;

public class Inverse {
	public static void main(String[] args) {
		int num = 15234;
		int pos = 1;
		int ans = 0;
		while (num > 0) {
			int digit = num % 10;
//			System.out.println(digit + "-" + pos);
			ans = ans + pos * (int) Math.pow(10, (digit - 1));
			num = num / 10;
			pos++;
		}
		System.out.println(ans);
	}
}
