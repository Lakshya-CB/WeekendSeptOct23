package Lec_21;

public class Dynamic_Stack extends Stack {
	@Override
	public void add(int ali) {
		if(isFull()) {
//			grow!!
			int [] biggy = new int[this.arr.length*2];
			for(int i=0;i<=tos;i++) {
				biggy[i] = arr[i];
			}
			arr = biggy;
		}
		super.add(ali);
	}
}
