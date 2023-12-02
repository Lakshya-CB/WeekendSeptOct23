package Lec_10;

public class nthRootM {
	public static void main(String[] args) {

		int n = 3;
		int m = 342;
		System.out.println(nthRoot(m, n));

//		double ans= Math.pow(m, 1.0 / n);
//		if(ans-(int)ans >0.999999) {
//			ans = (int)ans+1;
//		}else {
//			ans = (int)ans;
//		}
//		System.out.println(ans);
	}

	public static int nthRoot(int m, int n) {
		int s = 1;
		int e = m;
		int ans = -1;
		while (s <= e) {
			int mid = (s + e) / 2;
			
			double pow = Math.pow(mid, n);
			System.out.println(mid + " - "+pow);
			if (pow == m) {
				return mid;
			} else if (pow < m) {
				s = mid + 1;
				ans = mid;
			} else {
				e = mid - 1;
			}

		}
		return ans;
	}

}
