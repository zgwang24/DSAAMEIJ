package Else;
/**
 * Ğı×ªËã·¨
 * @author zgwang
 *
 */
public class ArrayRotate {
	public static void arrayRotate(int[] a, int d){
		reverseArray(a, 0, d - 1);
		reverseArray(a, d, a.length - 1);
		reverseArray(a, 0, a.length - 1);
		for(int i= 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	private static void reverseArray(int[] a, int s, int e){
		while(s < e){
			a[s] = a[s] + a[e] - (a[e] = a[s]);
			s++;
			e--;
		}
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		arrayRotate(a, 2);
	}
}
