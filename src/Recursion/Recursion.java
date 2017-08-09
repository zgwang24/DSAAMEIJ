/**
 * @author zgwang
 *
 */
package Recursion;
public class Recursion{
	// 汉诺塔谜题（递归实现）
	public static void TowersOfHanoi(int n, char from, char to, char aux){
		if(n == 1){
			System.out.println(from + " move to " + to);
		}else if(n < 1){
			System.out.println("Please enter a bigger integer");
		}else{
			TowersOfHanoi(n - 1, from, aux, to);
			System.out.println(from + " move to " + to);
			TowersOfHanoi(n -1, aux, to, from);
		}
	}
	// 递归判断数组是否有序
	public static int isSortedArray(int[] arr, int len){
		if(len == 1){
			return 1;
		}
		return (arr[len-1] < arr[len-2])? 0: isSortedArray(arr, len-1);
	}
	
	public static void main(String[] args){
		
		// TowersOfHanoi(2, 'A', 'B', 'C');
		int[] arr = {1, 3, 5, 7, 6};
		System.out.println(isSortedArray(arr, arr.length));
	}
}