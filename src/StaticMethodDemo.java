
public class StaticMethodDemo {

	public static void main(String[] args) {
		System.out.println("Main get called");
		StaticMethodDemo.method1();
	}
	
	static void method1(){
		System.out.println("Inside static method");
	}
	
	static {
		System.out.println("Inside static block");
		StaticMethodDemo.method1();
	}

}
