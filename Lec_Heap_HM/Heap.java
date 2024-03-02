package Lec_Heap_HM;

import java.util.ArrayList;

public class Heap {
	ArrayList<Integer> AL = new ArrayList<>();

	public void add(int ali) {
		AL.add(ali);
		upheapify(AL.size() - 1);
	}

	private void upheapify(int ch) {
		int p = (ch - 1) / 2;
		if (AL.get(ch) < AL.get(p)) {
			swap(ch, p);
			upheapify(p);
		}

	}

	private void swap(int ch, int p) {
		int temp = AL.get(ch);
		AL.set(ch, AL.get(p));
		AL.set(p, temp);
	}
	public int poll() {
		int ans = AL.get(0);
		AL.set(0,AL.get(AL.size()-1));
		AL.remove(AL.size()-1);
		downHeapify(0);
		return ans;
	}

	private void downHeapify(int p) {
		int L = 2*p+1;
		int R = 2*p+2;
		int min = L;
		if(L<AL.size()&& AL.get(L)<AL.get(min)) {
			min = L;
		}
		if(R<AL.size()&& AL.get(R)<AL.get(min)) {
			min = R;
		}
		if(p!=min) {
			swap(min, p);
			downHeapify(min);
		}
	}
}
