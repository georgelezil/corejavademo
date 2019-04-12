
public class ThisKeywordDemo {

	int num;
	
	ThisKeywordDemo() {
		System.out.println("Check the reference of this : " + this);
	}

	public static void main(String[] args) {
		new ThisKeywordDemo();
		new ThisKeywordDemo();
	}

}
