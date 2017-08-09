package String;

public class BruteForceStringMatch {
	public static boolean bruteForceStringMatch(int[] T, int n, int[] P, int m){
		for(int i = 0; i <= n - m; i++){
			int j = 0;
			while(j < m && P[j] == T[i + j]){
				j = j+ 1;
			}
			if(j == m){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] T = {1, 2, 3, 4, 5};
		int[] P = {3, 8, 5};
		System.out.println(bruteForceStringMatch(T, T.length, P, P.length));
	}
}
