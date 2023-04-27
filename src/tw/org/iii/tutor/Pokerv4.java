package tw.org.iii.tutor;
	import java.util.ArrayList;
	import java.util.Collections;
public class Pokerv4 {

	public static void main(String[] args) {
		//java.util>arrays>binarysearch()
		//java.util>collections
		//shuffle()
		
			ArrayList<Integer> poker = new ArrayList<>();
			for (int i=0; i<10; i++) poker.add(i);
			for (Integer v: poker) {
				System.out.println(v);
			}
			System.out.println("-----");
			Collections.shuffle(poker); //洗牌
			for (Integer v: poker) {
				System.out.println(v);
			}
		
	}
}


