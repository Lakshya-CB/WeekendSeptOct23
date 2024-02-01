package Lec_Rec_extra_class;

public class N_stairs_comb {
	public static void main(String[] args) {
		solve(0, 1,"", 4);
	}

	public static void solve(int curr, int prev, String path, int dest) {
		if(curr>dest) {
			return;
		}
		if(curr==dest) {
			System.out.println(path);
			return;
		}
		if(prev==1) {
			solve(curr+1, 1, path+1, dest);
			solve(curr+2, 2, path+2, dest);
		}else {
			solve(curr+2, 2, path+2, dest);
		}
	}
}
