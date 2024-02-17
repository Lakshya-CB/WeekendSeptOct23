package Lec_OOPs_Part2;

import java.util.Comparator;

public class generic_client {
	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student(10, "A");
		arr[1] = new Student(14, "C");
		arr[2] = new Student(17, "V");
		arr[3] = new Student(2, "B");
		arr[4] = new Student(9, "K");

		print(arr);
		sort(arr, new cc());
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
//			u.
			System.out.println(u);
		}
		System.out.println("=========");
	}

	public static <pui extends Comparable<pui>> void sort(pui[] arr) {
		for (int cnt = 1; cnt <= arr.length; cnt++) {
			for (int s = 0; s <= arr.length - 2; s++) {
//				 s ans s+1
//				arr[s].
//				if (arr[s].Age > arr[s + 1].Age) {
				if (arr[s].compareTo(arr[s + 1]) > 0) {
//					arr[s] - arr[s+1]>0
					pui temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
		}
	}

	static class cc implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.Age - o2.Age;
		}
	}

	public static <pui> void sort(pui[] arr, Comparator<pui> comp) {
		for (int cnt = 1; cnt <= arr.length; cnt++) {
			for (int s = 0; s <= arr.length - 2; s++) {
				if (comp.compare(arr[s], arr[s + 1]) > 0) {
					pui temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
		}
	}
}
