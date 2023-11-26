package Lec_08;

public class array_basics_1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		int element = arr[0];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		System.out.println(arr.length);
		System.out.println(arr[arr.length - 1]);
		System.out.println("-=============");
		int[] arr2 = new int[10];
		int cnt = 2;
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = cnt;
			cnt = cnt + 2;
		}
//		for(int i=0;i<arr2.length;i++) {
//			System.out.println(arr2[i]);
//		}
//		System.out.println(arr[-1]);
		System.out.println("-=============");
		for (int ali : arr2) { // enchanced loop
//			read only loop; for each!!
//			System.out.println(ali);
			ali = 99;
		}
		for (int ali : arr2) { // enchanced loop
//			read only loop; for each!!
			System.out.println(ali);
		}

	}
}
