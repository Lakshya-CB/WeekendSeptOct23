package Lec_OOPs;

public class Inherit_client_2 {
	public static void main(String[] args) {
		Parent P = new Parent(); // C1
		P.fn();
		P.fnP();
		System.out.println("===========");

		Child C = new Child(); // C2
		System.out.println(C.toString());
//		C.fnC();
//		C.fnP();
//		C.fn();
//
//		System.out.println("===========");
//		Parent ch = new Child(); // C3
//		((Child) ch).fnC();
//		((Child) ch).fnP();
////		Object x = 10.0;
//		System.out.println(10);
////		ch.

//		System.out.println("===========");
//		ch.fn();
//		((Child) ch).fn();
		

	}
}
