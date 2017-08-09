package Else;
/**
 * œ¥≈∆À„∑®
 * @author zgwang
 *
 */
public class Shuffle {
	public static void shuffle(int[] cards){
		for(int i = 0; i < cards.length; i++){
			cards[i] = i;
		}
		for(int i = 0; i < cards.length; i++){
			int r = (int) (i + Math.random() * (cards.length - i));
			cards[i] = cards[i] + cards[r] - (cards[r] = cards[i]);
		}
		for(int i = 0; i < cards.length; i++){
			System.out.print(cards[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[] cards = new int[52];
		shuffle(cards);
	}
}
