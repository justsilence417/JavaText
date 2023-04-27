package tw.org.iii.tutor;

import java.util.HashSet;

public class text35_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new  HashSet<>();
		set.add("text");
		set.add(123); // 將(int)基本類別轉成物件這動作稱作auto-boxing(自動裝箱)
		set.add("text");
		set.add(123); 
		System.out.println(set.size());
		//會看到有兩個 重複的不算
		System.out.println(set.toString());
		//不會看到記憶體位置是因為已經轉換成物件
	}

}
