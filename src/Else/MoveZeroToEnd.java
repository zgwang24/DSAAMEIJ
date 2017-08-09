package Else;

public class MoveZeroToEnd {
	public static void move(int[] a){
		for(int i = 0, j = 0; i < a.length; i++){
			if(a[i] != 0){
				exchange(a, i, j++);						
			}
		}
	}
	private static void exchange(int[] a, int i, int j) {
		a[i] = a[i] + a[j] - (a[j] = a[i]);
	}
	public static void main(String[] args) {
		int[] a = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		move(a);
		for(int item : a){
			System.out.print(item + " ");
		}
	}
}
