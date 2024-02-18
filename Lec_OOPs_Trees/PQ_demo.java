package Lec_OOPs_Trees;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ_demo {
	public static void main(String[] args) {
//		 Rank!! , min Heap!!
		
//		Marks!! max heap!!
		PriorityQueue<Integer> PQ = 
				new PriorityQueue<>(Collections.reverseOrder());
		PQ.add(10); // log(n)
		PQ.add(6);
		PQ.add(5);
		PQ.add(15);
		while(!PQ.isEmpty()) {
			System.out.println(PQ.poll()); // log(n)
		}
	}
}
