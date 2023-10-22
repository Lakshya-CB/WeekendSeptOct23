package Lec_05;

public class prime_factor {
	public static void main(String[] args) {
		int num = 36*36*36;
		int div = 2;
		int flag = 1;
		while (num > 1) {
			if (num % div == 0) {
				num = num / div;
//				System.out.println(div);
				if (flag == 1) {
					System.out.println(div);
					flag = 0;
				}
			} else {
				div = div + 1;
				flag = 1;
			}
		}
	}
}
