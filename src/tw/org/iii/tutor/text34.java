package tw.org.iii.tutor;

public class text34 {

	public static void main(String[] args) {
	}

}

interface text341{
	void m2();
}

interface text342{
	void m2();
}
//定義了343將其從341發揚光大(extends) 可以有多個父類別
interface text343 extends text341,text342{
	void m3();
}

//可迭代 interable 都可以被foreach可使用
class text344 implements text343{
	public void m1() {}
	public void m2() {}
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	
}
