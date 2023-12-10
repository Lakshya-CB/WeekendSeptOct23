package Lec_Complexity;

public class SOE {
//sieve of eratosthenes 
	public static void main(String[] args) {
		printPrimeTillN(250000000);
	}

	public static void printPrimeTillN(int N) {
		boolean[] isComp = new boolean[N + 1];
		for (int div = 2; div * div <= N; div++) {
			if (isComp[div] == false) {
				for (int table = div * div; table <= N; table = table + div) {
//					System.out.print(table + " ");
					isComp[table] = true;
				}
				System.out.println();
			}
		}
		for (int i = 2; i <= N; i++) {
			if (isComp[i] == false) {
				System.out.println(i);
			}
		}

	}

}
