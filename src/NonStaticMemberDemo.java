
public class NonStaticMemberDemo {

	int num;
	
	NonStaticMemberDemo(){
		System.out.println("Inside constructor");
	}
	
	{
		System.out.println("Non static block gets called when an object is created");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main");
		//NonStaticMemberDemo obj = new NonStaticMemberDemo();
		new NonStaticMemberDemo();
		new NonStaticMemberDemo();
	}

	static {
		System.out.println("Static block gets called only once when the class is loaded");
	}
}
