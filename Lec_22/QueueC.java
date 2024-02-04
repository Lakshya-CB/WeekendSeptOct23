package Lec_22;

public class QueueC {
	int s = 0;
	int size = 0;
	int[] arr;
	public QueueC(int cap) {
		arr = new int[cap];
	}
	public QueueC() {
		this(5);
	}
	public int size() {
		return size();
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==arr.length;
	}
	public void add(int ali) {
		int idx = s + size;
		idx = idx% arr.length;
		arr[idx] = ali;
		size++;
	}
	public int poll() {
		int ans = arr[s];
		s = (s+1)% arr.length;
		size--;
		return ans;
	}
}
