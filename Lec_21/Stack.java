package Lec_21;

public class Stack {
	protected int[] arr;
	protected int tos;

	@Override
	public String toString() {
		String ans = "[";
		for (int i = 0; i <= tos; i++) {
			if (i == tos) {
				ans = ans + arr[i] + "]";
			} else {
				ans = ans + arr[i] + " ,";
			}
		}
		return ans;
	}

	public Stack(int cap) {
		arr = new int[cap];
		tos = -1;
	}

	public Stack() {
		this(5);
	}

	public int size() {
		return tos + 1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isFull() {
		return size() == arr.length;
	}

	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("haan bhai kya dekh rha hain?");
		}
		return arr[tos];
	}

	public void add(int ali) {
		if(isFull()) {
			throw new RuntimeException("kya daal rha hain?");
		}
		tos++;
		arr[tos] = ali;
	}

	public int pop() {
		if(isEmpty())
			throw new RuntimeException("kya nikaal rha hain?");
		int ans = arr[tos];
		tos--;
		return ans;
	}
}
