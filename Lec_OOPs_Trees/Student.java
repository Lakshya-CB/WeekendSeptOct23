package Lec_OOPs_Trees;

public class Student implements Comparable<Student> {
	int Age;
	String Name;
	static int total_S = 2;

	public static int getTotal() {
//		Student.getTotal();
//		this.
		Math.max(total_S, total_S);
		return total_S;
	}

	public void fun() {
//		s1.fun();
	}

	public Student(int A, String S) {
		Age = A;
		Name = S;
		// TODO Auto-generated constructor stub
		total_S++;
	}

	@Override
	public String toString() {
		return Name + ", " + Age;
	}

	@Override
	public int compareTo(Student o) {
//		s1.copmapreTo(s2)
//		s1- s2
//		this = s1 , o= s2;
		return this.Age - o.Age;
//		return o.Age - .Age;

	}
	public void setAge(int ans) throws Exception {
		if(ans<0) {
//			throw new RuntimeException("mat kar bhai");
			throw new Exception("checked !!");
		}
		Age = ans;
	}
}
