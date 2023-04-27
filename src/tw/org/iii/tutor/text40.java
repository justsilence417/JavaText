package tw.org.iii.tutor;

import java.util.HashMap;
import java.util.Set;

public class text40 {

	public static void main(String[] args) {
		
		HashMap<String, Object> map = new HashMap<>();
		//Map 是用於以鍵值對儲存資料的介面，而 HashMap 是 Map 介面的實現類。
		map.put("name","Brad");
		map.put("gender", true);
		map.put("age",18);
		System.out.println("name");
		System.out.println("------");
		Set<String> keys = map.keySet();
		for(String key:keys) {
			System.out.println(map.get(key));
		}
	}

}
