package Lec_07;

public class scale_FC {
	public static void main(String[] args) {
		int minF = 0;
		int maxF = 100;
		int step = 20;
		for (int F = minF; F <= maxF; F = F + step) {
			int C = 5 * (F - 32) / 9;
			System.out.println(F + "  " + C);
		}

		boolean b = 3 < 0;
		if (b) {
			System.out.println("jaadu");
		}
		while (b) {
			System.out.println("aaag");
		}

	}
}
