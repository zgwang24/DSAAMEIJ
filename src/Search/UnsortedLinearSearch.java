package Search;

import sun.applet.Main;

public class UnsortedLinearSearch {
	public static boolean search(int[] a, int k){
		for(int i = 0; i < a.length; i++){
			if(a[i] == k){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {1, 3, 2, 4, 7, 5, 4};
		System.out.println(search(a, -1));
	}
}
