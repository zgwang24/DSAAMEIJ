package Sort;

public class CountingSort {
	public static void sort(int[] a, int n, int[] b, int k){
		int[] c = null;
		for(int i = 0; i < k; i++){
			c[i] = 0;
		}
		for(int i = 0; i < n; i++){
			c[a[i]] = c[a[i]] + 1;
			for(int j = 1; i < k; j++){
				c[j] = c[j] + a[j - 1];
			}
			for(int j = n -1; j >= 0; j--){
				c[c[a[j]]] = a[j];
				c[a[j]] = c[a[j]] - 1;
			}
		}
	}
}
