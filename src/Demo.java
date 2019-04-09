
public class Demo {

	static Demo obj;

	static {
		System.out.println(obj);
		Demo.init();
		System.out.println(obj);
	}

	public static void main(String[] args) {
		System.out.println(obj);

	}
	
	static void init(){
		Demo.obj = new Demo();
	}

}
