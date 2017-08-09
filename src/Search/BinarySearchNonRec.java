package Search;

public class BinarySearchNonRec {
	public static boolean search(int[] a, int k){
		int low = 0; 
		int high = a.length - 1;
		while(low <= high){
			int mid = low + (high - low)/2;
			if(a[mid] == k){
				return true;
			}else if(a[mid] < k){
				low = mid + 1;
			}else{
				high = mid - 1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 4, 7};
		System.out.println(search(a, 10));
	}
}
