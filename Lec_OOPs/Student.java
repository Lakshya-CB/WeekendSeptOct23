package Lec_OOPs;

public class Student {
//	Student noun!! data members!! 
//	data parsing!!
	String Name;
	int Age;

	public Student() {
		Name = "Bhupender";
		Age = 40;
	}

	public Student(String nn) {
		
		Name = nn;
	}

	public Student(int A) {
		this.Age = A;
	}

	public Student(String Name, int Age) {
		this(Name);
		this.Age = Age;
	}

	public void Intro() {
//		System.out.println(this + "??");
		System.out.println(Name + " with " + Age);
	}

//	s1.party(s2.Name);
	public void party(String Name) {
		System.out.println(Name + " party with " + Name);
	}
}
