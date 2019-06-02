
public class StaticMethodDemo {

	public static void main(String[] args) {
		//Compile time error
		//Return type alone cannot determine that function is overloaded
		//Eg: Same method name with same parameter but different return type 
		System.out.println("Main method gets called");
		StaticMethodDemo.method1();
		method1();
	}

	static {
		System.out.println("Inside static block");
	}
	
	public static void method1(){
		System.out.println("Inside static method");
	}
	
	public static int method1(){
		System.out.println("Inside static method");
		return 1;
	}
	

}
