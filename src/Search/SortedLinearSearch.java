package Search;

public class SortedLinearSearch {
	public static boolean search(int[] a, int k){
		for(int i = 0; i < a.length; i++){
			if(a[i] == k){
				return true;
			}else if(a[i] > k){
				return false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 4, 7};
		System.out.println(search(a, 1));
	}
}
