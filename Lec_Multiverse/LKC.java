package Lec_Multiverse;

public class LKC {
	public static void main(String[] args) {
		solve("26", "");
	}

	public static void solve(String buttons, String path) {
//	BP : 263
//	SP : 63
		if(buttons.length()==0) {
			System.out.println(path);
			return;
		}
		String remain = buttons.substring(1); // "63"
		String ops = Options(buttons.charAt(0));// "abc"
		
		for(int i=0;i<ops.length();i++) {
			char ch = ops.charAt(i);
			solve(remain, path+ch);
		}
		
	}

	private static String Options(char ch) {
		
//		ch = '2' => "abc"
//		ch = '3' => "ghi"
		String[] arr = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		
		return arr[ch-'2'];
	}
}
