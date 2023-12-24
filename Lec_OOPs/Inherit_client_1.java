package Lec_OOPs;

import java.util.ArrayList;

public class Inherit_client_1 {
	public static void main(String[] args) {
		Parent P = new Parent(); // C1
		System.out.println(P);
		ArrayList<Integer> AL = new ArrayList<>();
		AL.add(10);
		System.out.println(AL);
//		parent.
//		System.out.println(P.data);
//		System.out.println(P.dataP);
		
		Child C = new Child(); //C2
		
//		System.out.println(C.dataC);
//		System.out.println(C.dataP);
//		System.out.println(C.data);
//		
		System.out.println("===========");
		Parent ch = new Child(); // C3
		System.out.println(ch);
//		System.out.println(ch.data);
//		System.out.println(((Child)ch).data);
//		System.out.println(ch.dataP);
		
		
//		Child P2 = new Parent(); //C4
//		System.out.println(P2.dataC);
		
		
	}
}
