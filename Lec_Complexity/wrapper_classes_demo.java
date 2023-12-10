package Lec_Complexity;

public class wrapper_classes_demo {
	public static void main(String[] args) {
		int i  = 10;
		Integer  I = 11;
		System.out.println(i+10);
		System.out.println(I+10);
//		i = I; //A unboxing!!
		I = i;// B autoboxing!!
		System.out.println(I);
		
		I = null;
//		i = null;
//		i = I;
		System.out.println(I);
		System.out.println(i);
		
	}
}
