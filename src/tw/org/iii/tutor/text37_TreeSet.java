package tw.org.iii.tutor;

import java.util.TreeSet;

public class text37_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//大樂透 選出不重複的六個數字
		//大樂透 1~49
//		HashSet<Integer> lottery = new HashSet<>();
		TreeSet<Integer> lottery = new TreeSet<>();
		//TreeSet 做排序
		while (lottery.size()<6) { //出六個數字
			
			lottery.add((int)(Math.random()*49+1));
		
		}
		System.out.println(lottery);
	}
	

}
