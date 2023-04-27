package tw.org.iii.tutor;

import java.util.ArrayList;

public class text39_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
		System.out.println(list); //[1, 2, 3, 4]
		list.add(0,1);
		list.add(0,2);
		list.add(0,3);
		list.add(0,4);
		System.out.println(list);//[4, 3, 2, 1]

	}

}
