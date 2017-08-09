package Sort;

public class InsertSort {
	public static void sort(int[] a){
		int v, j;
		for(int i = 2; i < a.length; i++){
			v = a[i];
			j = i;
			while(a[j - 1] > v && j >= 1){
				a[j] = a[j - 1];
				j--;
			}
			a[j] = v;
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
