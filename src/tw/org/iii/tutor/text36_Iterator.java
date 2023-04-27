package tw.org.iii.tutor;

import java.util.HashSet;
import java.util.Iterator;

public class text36_Iterator {

	public static void main(String[] args) {
			//換成有泛型寫法
			HashSet<String> set = new HashSet<>();
			set.add("III"); //因泛型已經看到系統顯示()內已經變成字串不會是Object
			set.add("text");
			set.add("Amy");
			set.add("Tom");
			set.add("Lidia");
			//將捲線器拿出來 將傳回Iterator
				//只會往前不會往後
				Iterator<String> it = set.iterator();
				
				while (it.hasNext()) {
					System.out.println(it.next());
				}
				System.out.println("----上述是原理且只執行一次---");
				//可執行多次
				for (String v :set) {
					System.out.println(v);
				}
	}

}
