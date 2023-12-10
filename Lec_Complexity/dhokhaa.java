package Lec_Complexity;

public class dhokhaa {
	public static void main(String[] args) {
		int n = 100000;
		long start = System.currentTimeMillis();
		String str = "";
//		int ans = 0;
		for(int i = 1;i<=n;i++) {
			str = str + i; //O(n)!! n is the size of your str
//			ans  = ans +i; // O(1)
			
		}

		long end = System.currentTimeMillis();
		
		System.out.println((end - start)/1000.0);
	}
}
