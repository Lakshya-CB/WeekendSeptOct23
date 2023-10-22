package Lec_03;

public class Fibo {
	public static void main(String[] args) {
		int n = 5;
		int a = 0;
		int b = 1;
		int c = -999;
		
		int cnt=1 ;
		while(cnt<=n) {
			c = a+b;
			a = b;
			b = c;
			
//			cnt = cnt+1;
			cnt++;
		}
		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
	}
}
