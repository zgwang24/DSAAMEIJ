package Sort;

public class ShellSort {
	public static void sort(int[] a){
		for(int h = a.length / 2; h > 0; h /= 2){
			for(int i = h; i < a.length; i++){
				for(int j = i; j >= h && a[j - h] > a[j]; j -= h){
					a[j - h] = a[j - h] + a[j] - (a[j] = a[j - h]);
				}
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
