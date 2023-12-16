package Lec_13;

public class array_2d {
	public static void main(String[] args) {
		int[][] arr = new int[5][3];// 5 rows and 3 column
		System.out.println(arr.length); // number of rows!!
		System.out.println(arr);
		
		for(int[] row : arr) {
			System.out.println(row);
		}
		System.out.println("============");
		System.out.println(arr[0][0]);
//		arr[0][0]= 1;
//		arr[0][1]= 2;
//		arr[0][2]= 3;
//		
//		arr[1][0]= 4;
//		arr[1][1]= 5;
//		arr[1][2]= 6;
		int cnt = 0;
		for(int r = 0;r<arr.length;r++) {
			for(int c = 0;c<arr[r].length;c++) {
				arr[r][c] = cnt;
				System.out.print(arr[r][c]+ " ");
				cnt++;
			}
			System.out.println();
		}
//		for(int r = 0;r<arr.length;r++) {
//			for(int c = 0;c<arr[r].length;c++) {
//				System.out.print(arr[r][c]+ " ");
//			}
//			System.out.println();
//		}
		System.out.println("===========");
		for(int[] row : arr) {
			for(int ali:row) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
		
	}
}	
