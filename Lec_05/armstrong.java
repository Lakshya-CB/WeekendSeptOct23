package Lec_05;

public class armstrong {
	public static void main(String[] args) {
		int num = 3123;
		int cnt = 0;

		int backup = num;
		while (num > 0) {
			num = num / 10;
			cnt++;
		}
//		System.out.println(cnt + " - " + num);
		num = backup;
		int ans = 0;
		while (num > 0) {
			int digit = num % 10;
//			System.out.println(digit);
			int temp = (int) Math.pow(digit, cnt);
			ans = ans + temp;
			num = num / 10;
		}
		if (ans == backup) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
//		System.out.println(ans);

//		int io  = (int)Math.pow(10,2);
//		System.out.println(Math.pow(10, 2));
	}
}
