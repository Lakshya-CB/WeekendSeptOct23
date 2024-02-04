package Lec_22;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
//		int[] arr = { 5, 10, 8, 9, 14, 10, 20, 18, 21 };
//		nextGreater(arr);
		int[] arr ={2,1,5,6,2,3};
		nextSmallerR(arr);
		System.out.println("======");
		nextSmallerL(arr);
		
	}
//	{2,1,5,6,2,3}

	public static int[] nextSmallerR(int[] arr) {
		Stack<Integer> S = new Stack<>();
		int[] ans = new int[arr.length];
		int B_idx = 0;
		for (int B : arr) {
			while (!S.isEmpty() && arr[S.peek()] > B) {
				int A_idx = S.pop();
				ans[A_idx] = B_idx;
				System.out.println(arr[A_idx] + " => " + B);
			}
			S.add(B_idx);
			B_idx++;
		}
		while (!S.isEmpty()) {
			int A_idx = S.pop();
			ans[A_idx] = arr.length;
		}
		System.out.println(Arrays.toString(ans));
		return ans;
	}

	public static int[] nextSmallerL(int[] arr) {
		Stack<Integer> S = new Stack<>();
		int[] ans = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int A = arr[i];
			while(!S.isEmpty()&& A<arr[S.peek()]) {
				S.pop();
			}
			if(!S.isEmpty()) {
				System.out.println(A+ "=>"+arr[S.peek()]);
				ans[i] = S.peek();
			}else{
				System.out.println(A+ "=>"+-1);
				ans[i] = -1;
			}
			S.add(i);
		}
		System.out.println(Arrays.toString(ans));
		return ans;
	}

	public static void nextGreater2(int[] arr) {
		Stack<Integer> S = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			int A = arr[i];
			while (!S.isEmpty() && S.peek() < A) {
				S.pop();
			}
			if (!S.isEmpty()) {
				System.out.println(A + " => " + S.peek());
			} else {
				System.out.println(A + "=> X");
			}
			S.add(A);
		}
	}

	public static void nextGreater(int[] arr) {
		Stack<Integer> S = new Stack<>();
		int[] ans = new int[arr.length];
		int B_idx = 0;
		for (int B : arr) {
			while (!S.isEmpty() && arr[S.peek()] < B) {
				int A_idx = S.pop();
				ans[A_idx] = B;
				System.out.println(arr[A_idx] + " => " + B);
			}
			S.add(B_idx);
			B_idx++;
		}
		System.out.println(Arrays.toString(ans));
	}
}
