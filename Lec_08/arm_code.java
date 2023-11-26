package Lec_08;

public class arm_code {
	public static void main(String[] args) {
		int n = 100000000;
		printAllArmstrongTill(n);
	}

	public static void printAllArmstrongTill(int n) {
		for (int num = 1; num <= n; num++) {
			if (isArm(num)) {
				System.out.println(num);
			}
		}
	}

	public static boolean isArm(int num) {
		int nod = numOfDigits(num);
		int sum = 0;
		int baackup = num;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + (int) Math.pow(digit, nod);
			num = num / 10;
		}
		if (sum == baackup) {
			return true;
		} else {
			return false;
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
