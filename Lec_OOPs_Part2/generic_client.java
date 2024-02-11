package Lec_OOPs_Part2;

public class generic_client {
	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student(10, "A");
		arr[1] = new Student(14, "C");
		arr[2] = new Student(17, "V");
		arr[3] = new Student(2, "B");
		arr[4] = new Student(9, "K");

		print(arr);
		sort(arr);
		print(arr);

	}

//	public static void print(Object[] arr) {
//		for(Object s: arr) {
//			System.out.println(s);
//		}
//		System.out.println("=========");
//	}
	public static <ui> void print(ui[] arr) {
		for (ui u : arr) {
			System.out.println(u);
		}
		System.out.println("=========");
	}

	public static <pui extends Comparable<pui>> void
	sort(pui[] arr) {
		for (int cnt = 1; cnt <= arr.length; cnt++) {
			for (int s = 0; s <= arr.length - 2; s++) {
//				 s ans s+1
//				arr[s].
//				if (arr[s].Age > arr[s + 1].Age) {
				if(arr[s].compareTo(arr[s+1])>0) {
					pui temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
		}
	}
}
