package Lec_OOPs_Trees;

public class client {
	public static void main(String[] args) {
		Student s1 = new Student(10, "A");
		try {
			System.out.println("a");
			s1.setAge(12);
			System.out.println("b");
			s1.setAge(-10);
			System.out.println("c");

		} catch (Exception e) {
			System.out.println("nacho!!");
//			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("END");
		}
		System.out.println(ll());
//		System.out.println("????");
//		System.out.println("END");
	}

	public static int ll() {
		try {
			System.exit(0);
			return 1;
		} finally {
			return -10;
		}
	}
}
