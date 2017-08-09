package dynamicprogramming;

public class LCS {
	static char[] a = "youxi".toCharArray();
	static char[] b = "uji".toCharArray();
	static int m = a.length;
	static int n = b.length;
	static int[][] f = new int[m + 1][n + 1];
	public static int lcs(char[] a, int m, char[] b, int n){
		for(int i = 0; i <= m; i++){
			f[i][n] = 0;
		}
		for(int i = 0; i <= n; i++){
			f[m][i] = 0;
		}
		for(int i = m - 1; i >= 0; i--){
			for(int j = n - 1; j >= 0; j--){
				f[i][j] = f[i + 1][j + 1];
				if(a[i] == b[j]){
					f[i][j]++;
				}
				if(f[i][j + 1] > f[i][j]){
					f[i][j] = f[i][j + 1];
				}
				if(f[i + 1][j] > f[i][j]){
					f[i][j] = f[i + 1][j];
				}
			}
		}
		return f[0][0];
	}
	public static void main(String[] args) {
		System.out.println(lcs(a, m, b, n));
	}
}
