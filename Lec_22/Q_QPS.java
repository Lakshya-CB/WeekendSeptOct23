package Lec_22;

import java.util.LinkedList;
import java.util.Queue;

public class Q_QPS {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		System.out.println(Q);
		rev_Print(Q,Q.size());
		System.out.println(Q);
//		System.out.println(Q.poll());
//
//		System.out.println(Q);
	}
	public static void firstNeg(int[] arr, int k) {
		Queue<Integer> Q= new LinkedList<>();
		for(int i=0;i<k;i++) {
			if(arr[i]<0) {
				Q.add(i);
			}
		}

		System.out.println(arr[Q.peek()]);
		for(int s =1;s<=arr.length-k;s++) {
			if(!Q.isEmpty()&&Q.peek()==s-1) {
				Q.poll();
			}
			int e = s+k-1;
			if(arr[e]<0) {
				Q.add(e);
			}
			System.out.println(arr[Q.peek()]);
		}
	}
	public static void rev_Print(Queue<Integer> Q, 
			int cnt) {
		if (cnt==0) {
			return;
		}
		int ali = Q.poll();
		Q.add(ali);
		rev_Print(Q, cnt-1);
		System.out.println(ali);
	}
}
