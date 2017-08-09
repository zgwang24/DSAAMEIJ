package Sort;

public class MergeSort {
	private static int[] aux;
	public static void sort(int[] a){
		aux = new int[a.length];
		sort(a, 0, a.length - 1);
	}
	private static void sort(int[] a, int lo, int hi) {
		if(hi <= lo){
			return ;
		}
		int mid = lo + (hi - lo)/2;
		sort(a, lo, mid);
		sort(a, mid + 1, hi);
		merge(a, lo, mid, hi);
	}
	private static void merge(int[] a, int lo, int mid, int hi) {
		int i = lo;
		int j = mid + 1;
		for(int k = lo; k <= hi; k++){
			aux[k] = a[k];
		}
		for(int k = lo; k <= hi; k++){
			if(i > mid){
				a[k] = aux[j++];
			}else if(j > hi){
				a[k] = aux[i++];
			}else if(aux[i] < aux[j]){
				a[k] = aux[i++];
			}else{
				a[k] = aux[j++];
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {1, 3, 4, 2, 7, 6, 5, 5};
		sort(a);
		for(int item : a){
			System.out.print(item + " ");
		}
	}
}
