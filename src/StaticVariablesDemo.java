
public class StaticVariablesDemo {
	
	private static int num;
	private static String str;
	
	public static void main(String[] args) {
		
		System.out.println("Static variables accessed using class name : " + StaticVariablesDemo.num);
		System.out.println("Static variables accessed using class name : " + StaticVariablesDemo.str);
		
		privateMethodAccessStaticVariables();
		publicMethodAccessStaticVariables();
	}

	public static void privateMethodAccessStaticVariables(){
		System.out.println("Static variables accessed using class name : " + StaticVariablesDemo.num);
		System.out.println("Static variables accessed using class name : " + StaticVariablesDemo.str);
	}

	private static void publicMethodAccessStaticVariables(){
		System.out.println("Static variables accessed using class name : " + StaticVariablesDemo.num);
		System.out.println("Static variables accessed using class name : " + StaticVariablesDemo.str);
	}


}
