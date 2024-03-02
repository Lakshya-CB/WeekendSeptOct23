package Lec_Heap_HM;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_QPS {
	public static void main(String[] args) {

//		PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
//		PQ.add(10);
//		PQ.add(6);
//		PQ.add(16);
//		PQ.add(8);
//		System.out.println(PQ);
		int[] arr = { 1, 2, 3, 1, 0, 3, 1, 2, 3, 4 };
		medianOfRunning(arr);

	}

	public static void medianOfRunning(int[] arr) {
		PriorityQueue<Integer> Left = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> Right = new PriorityQueue<>();

		for (int ali : arr) {
			if (Left.isEmpty() || ali < Left.peek()) {
				Left.add(ali);
			} else {
				Right.add(ali);
			}
			if (Left.size() - Right.size() > 1) {
				Right.add(Left.poll());
			}
			if (Right.size() - Left.size() > 1) {
				Left.add(Right.poll());
			}
//			=============================
			System.out.println(Left + "||" + Right);
			if (Left.size() == Right.size()) {
				System.out.println((Left.peek() + Right.peek()) / 2);

			} else if (Left.size() > Right.size()) {
				System.out.println(Left.peek());
			} else {
				System.out.println(Right.peek());
			}
		}

	}
}
