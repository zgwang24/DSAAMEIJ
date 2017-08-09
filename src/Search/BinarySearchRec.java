package Search;

public class BinarySearchRec {
	public static boolean search(int[] a, int lo, int hi, int k){
		int mid = lo + (hi - lo)/2;
		if(a[mid] == k){
			return true;
		}else if(a[mid] < k){
			return search(a, mid + 1, hi, k);
		}else{
			return search(a, lo, mid - 1, k);
		}
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 4, 7};
		System.out.println(search(a, 0, a.length - 1, 7));
	}
}
