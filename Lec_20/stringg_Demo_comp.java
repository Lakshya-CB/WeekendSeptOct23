package Lec_20;

public class stringg_Demo_comp {
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		String str = "";
		StringBuilder SB = new StringBuilder(str);
		for (int i = 0; i < 100000; i++) {
//			str = str + i;
			SB.append(i);
		}
		str = SB.toString();

		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000);
	}
}
