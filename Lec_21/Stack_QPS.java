package Lec_21;
import java.util.Stack;
public class Stack_QPS {
	public static void main(String[] args) {
		int[] arr = { 5, 10, 8, 9, 14, 10, 20, 18, 21 };
		nextGreater(arr);
	}	

	public static void nextGreater(int[] arr) {
		Stack<Integer> S = new Stack<>();
		for(int B: arr) {
			while(!S.isEmpty()&& S.peek()<B) {
				System.out.println(S.pop() + " => "+B);
			}
			S.add(B);
		}
	}
}
