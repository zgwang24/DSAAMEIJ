package Sort;
public class BucketSort {
	private static int BUCKETS = 10;
	public static void sort(int[] a, int n){
		int[] buckets = new int[BUCKETS];
		for(int i = 0; i < BUCKETS; i++){
			buckets[i] = 0;
		}
		for(int i = 0; i < n; i++){
			++buckets[a[i]];
		}
		for(int i = 0, j = 0; j < BUCKETS; j++){
			for(int k = buckets[j]; k > 0; --k){
				a[i++] = j;
			}
		}
	}
}
