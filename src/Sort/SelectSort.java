package Sort;

public class SelectSort {
	public static void sort(int[] a){
		int min;
		for(int i = 0; i < a.length - 1; i++){
			min = i;
			for(int j = i + 1; j < a.length; j++){
				if(a[j] < a[min]){
					min = j;
				}
			}
			a[min] = a[i] + a[min] - (a[i] = a[min]);
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
