package tw.org.iii.tutor;

public class text28 {

	public static void main(String[] args) {
		//宣告
//		text281 obj1 = new text281(2); //2是因為有定義 int a
//		text282 obj2 = new text282();
		text283 obj3 = new text283();		
	}
}

//少數會寫 不會是public 存取只會在相同的package
//演練過程
//所有的類別 不管任何類別 一定會有建構式
class text281 extends Object{ //這不是建構式，是個編譯器，所以要附屬Object變成一個建構式，要找無傳參數的建構式
	//定義建構式 就沒有無傳參數 
	//text281(){}是個建構子 可以省略
	text281(int a){ //宣告 {初始化}
		//()若這有加一個參數值，就建議補一個沒有參數值的
//		super();//若不寫 這是預設 第一句是super或this二擇一
		//第一句主要是將祖宗八代叫進來 = 將父類別初始化
		System.out.println("text281(int)");
	}
}

class text282 extends text281{ 
	//text282是定義，但也是預設，若沒有要對text282執行什麼這段可以忽略
	//若將這段註記後，會發現class的text282會出現錯誤，因text281(有 int a)代表宣告個參數給它
	text282(){ 
		super(0);//第一個話代表呼叫父類別 執行初始化 適用在text282 用來呼叫父類別的預設建構子，因text281(int a)因此super()裡放的是任何數字
		System.out.println("text282()"+3);
	}
}

class text283 extends text282{
	text283(){
		System.out.println("text283()");
	}
}

//建構式{裡的第一個敘述句代表呼叫爸爸 執行初始化}
