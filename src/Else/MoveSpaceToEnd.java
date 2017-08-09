package Else;

public class MoveSpaceToEnd {
	public static void move(char[] c){
		for(int i = 0, j = 0; i < c.length; i++){
			if(c[i] != ' '){
				exchange(c, i, j++);
			}
		}
	}
	private static void exchange(char[] c, int i, int j) {
		char t = c[i];
		c[i] = c[j];
		c[j] = t;
	}
	public static void main(String[] args) {
		char[] c = {'a', 'b', ' ', ' ', 'r'};
		move(c);
		for(char item : c){
			System.out.print(item + " ");			
		}
		System.out.println(c.length);
	}
}
