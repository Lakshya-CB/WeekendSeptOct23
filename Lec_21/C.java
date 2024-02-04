package Lec_21;

public class C extends P{

	int data = 11;
	public void fun() {
		System.out.println("Start");
		this.fun();
		System.out.println("fun of C");
		System.out.println("End");
	}
}
