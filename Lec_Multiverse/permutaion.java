package Lec_Multiverse;

public class permutaion {
	public static void main(String[] args) {
		int n =  3;
		int r = 2;
		utha(n, r, "", new boolean[n]);
//		utha(n, r, "");
	}

	public static void utha(int totalBox, 
			int r, String path) {
		if (r == 0) {
			System.out.println(path);
			return;
		}

		for (int box = 0; box < totalBox; box++) {
			utha(totalBox, r - 1, path + "b" + box);
		}
	}

	public static void print(boolean[] arr) {
		for (boolean b : arr) {
			if (b) {
				System.out.print("#");
			} else {
				System.out.print("-");
			}
		}
		System.out.println();
	}

	public static void utha(int totalBox, int r,
			String path, boolean[] isPicked) {
		if (r == 0) {
			System.out.println(path);
			print(isPicked);
//			System.out.println("===========");
			return;
		}

		for (int box = 0; box < totalBox; box++) {
			if (isPicked[box] == false) {
				isPicked[box] = true; // prep!!
				utha(totalBox, r - 1, path + "b" + box, isPicked);
				isPicked[box] = false; // undo!!
			}
		}
	}
}
