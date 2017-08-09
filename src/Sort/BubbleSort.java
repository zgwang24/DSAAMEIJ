package Sort;

public class BubbleSort {
	public static void sort(int[] a){
		boolean tag = true;
		for(int i = a.length - 1; i >= 0 && tag; i--){
			tag = false;
			for(int j = 0; j < i; j++){
				if(a[j] > a[j + 1]){
					a[j] = a[j] + a[j + 1] - (a[j + 1] = a[j]);
					tag = true;
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
