
public class ThisKeywordDemo {

	int num;
	
	ThisKeywordDemo() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		new ThisKeywordDemo();
		new ThisKeywordDemo();
	}

}
