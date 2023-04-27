package tw.org.iii.tutor;

public class text42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b1 = new Bird();
		try {
		b1.setLeg(3);
		System.out.println("ok");
		}catch (Exception e) {
			System.out.println("Error");
		}
	}

}
class Bird{
	private int leg;
	void setLeg(int leg) throws Exception{
		if(leg>=0 && leg <= 2) {
			this.leg = leg;
		}else {
			throw new Exception();
		}
		
		
	}
}