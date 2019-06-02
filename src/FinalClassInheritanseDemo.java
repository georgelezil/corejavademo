
final class A {
	System.out.println("Final class A");
}

class B extends A {
	System.out.println("Final class B extends A");
}

class FinalClassInheritanseDemo {
	
	public static void main(String[] args){
		B obj = new B();
		System.out.println("Compile time error");
	}
}
