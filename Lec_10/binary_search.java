package Lec_10;

public class binary_search {
	public static void main(String[] args) {
		int[] arr= {10,11,15,20,27,100,105};
		System.out.println(find(arr, 101));
	}

	public static boolean find(int[] arr, int target) {
		int s =0;
		int e = arr.length-1;
		while(s<=e) {
			int mid = (s+e)/2;
			if(arr[mid]<target) {
				s = mid+1;
			}else if(arr[mid]>target) {
				e= mid-1;
			}else {
				return true;
			}
		}
		return false;
	}
}
