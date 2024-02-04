package Lec_21;

public class Client_S {
	public static void main(String[] args) {
		Stack S = new Dynamic_Stack();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);
		S.add(60);
		System.out.println(S);
		recRevPrint(S);
		System.out.println(S);
		
//		Rev(S);
//		System.out.println(S);
		
//		
//		System.out.println(S);
//		System.out.println(S.peek());
//		S.pop();
//		System.out.println(S.peek());	
	}

	public static void Rev(Stack S) {
		Stack Ex1 = new Stack();
		while (!S.isEmpty()) {
			Ex1.add(S.pop());
		}
		Stack Ex2 = new Stack();
		while (!Ex1.isEmpty()) {
			Ex2.add(Ex1.pop());
		}
		while (!Ex2.isEmpty()) {
			S.add(Ex2.pop());
		}
	}
	public static void RevPrint(Stack S) {
		Stack Ex1 = new Stack();
		while (!S.isEmpty()) {
			Ex1.add(S.pop());
		}
		while (!Ex1.isEmpty()) {
			System.out.println(Ex1.peek());
			S.add(Ex1.pop());
		}
	}
	public static void recRevPrint(Stack S) {
		if(S.isEmpty()) {
			return;
		}
		int ali = S.pop();
		recRevPrint(S);
		System.out.println(ali);
		S.add(ali);
	}
}
