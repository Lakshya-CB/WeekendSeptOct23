package Lec_20;

public class soooooooorting {
	public static void main(String[] args) {

	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int idx1 = 0;
		int idx2 = 0;
		int i = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] <= arr2[idx2]) {
				ans[i] = arr1[idx1];
				i++;
				idx1++;
			} else {
				ans[i] = arr2[idx2];
				i++;
				idx2++;
			}
		}
		while (idx1 < arr1.length) {
			ans[i] = arr1[idx1];
			i++;
			idx1++;
		}
		while (idx2 < arr2.length) {
			ans[i] = arr2[idx2];
			i++;
			idx2++;
		}
		return ans;
	}
	
	public static int[] mergeSort(int[] arr, int s, int e) {
		if(s==e) {
			int[] ans = new int[1];
			ans[0] = arr[s];
			return ans;
		}
		int mid = (s+e)/2;
		
		int[] sp1 = mergeSort(arr, s, mid);
		int[] sp2 = mergeSort(arr, mid+1, e);
		
		return merge(sp1, sp2);
	}
}
