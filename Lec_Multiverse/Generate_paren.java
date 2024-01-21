package Lec_Multiverse;

public class Generate_paren {
	public static void main(String[] args) {
		solve(2, 2, "");
	}

	public static void solve(int op, int cl, String path) {
		if (op == 0 && cl == 0) {
			System.out.println(path);
			return;
		}
		if(cl<op) { // -ve BC
			return;
		}
		if (op > 0) {
			solve(op - 1, cl, path + "(");
		}
		if (cl > 0) {
			solve(op, cl - 1, path + ")");
		}
	}

}
