package Lec_Complexity;

import java.util.ArrayList;

public class arrayList_demo {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		
		System.out.println(AL);
		
		AL.add(10); //O(1)
		System.out.println(AL);
		
		AL.add(20);
		AL.add(30);
		
		System.out.println(AL);
		System.out.println(AL.size());
//		ith index ??!?!
		System.out.println(AL.get(0));
		System.out.println(AL.get(AL.size()-1));
//		
		AL.set(2, 99); //O(1)
		System.out.println(AL);
		
		AL.add(20000);
		System.out.println(AL);
//		AL.set(10, 9);
//		System.out.println(AL);
		
		AL.remove(0); //O(n)
		System.out.println(AL);
		
		AL.add(1,null); // O(n)
		System.out.println(AL);
			
	}
	public static ArrayList<Integer> IntersectionOf2arrays
	(int[] arr1,int[] arr2){
		
	}
}
