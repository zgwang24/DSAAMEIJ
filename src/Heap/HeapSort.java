package Heap;

import sun.applet.Main;

public class HeapSort {
	public static void heapSort(int[] a){
		for(int i = a.length / 2; i >= 0; i--){
			down(a, i, a.length);
		}
		for(int j = a.length - 1; j > 0; j--){
			a[0] = a[0] + a[j] - (a[j] = a[0]);
			down(a, 0, j);
		}
	}

	private static void down(int[] a, int i, int j) {
		int child;
		while(2 * i + 1 < j){
			child = 2 * i + 1;
			if(child != j - 1 && a[child] < a[child + 1]){
				child++;
			}
			if(a[i] < a[child]){
				a[i] = a[i] + a[child] - (a[child] = a[i]);
			}else{
				break;
			}
			i = child;
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[5];
		a[1] = 10;
		a[2] = 3;
		a[3] = 5;
		a[4] = 4;
		heapSort(a);
		for(int i = 1; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}
