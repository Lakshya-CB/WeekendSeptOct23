package Lec_Rec_1;

public class Rec_basic_2 {
	public static void main(String[] args) {
		System.out.println(pow(2, 3));
	}

	public static int pow(int a, int b) {
		if(b==0) {
			return 1;
		}
//		BP : p(a,b)
//		SP : p(a,b-1)
		int sp = pow(a,b-1);
		return sp*a;
	}
}
