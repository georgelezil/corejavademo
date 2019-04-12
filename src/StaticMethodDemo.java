
public class StaticMethodDemo {

	public static void main(String[] args) {
		System.out.println("Main method gets called");
		StaticMethodDemo.method1();
		method1();
	}

	static {
		System.out.println("Inside static block");
	}
	
	static void method1(){
		System.out.println("Inside static method");
	}
	

}
