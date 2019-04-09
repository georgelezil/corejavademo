
public class Child extends RuntimePolymorphismDemo {

	public void display() {
		System.out.println("Child method display");
		super.display();
	}
	
	public static void main(String[] args){
		RuntimePolymorphismDemo parentObj = new Child();
		parentObj.display();
		
		RuntimePolymorphismDemo parentObj1 = new  RuntimePolymorphismDemo();
		parentObj1.display();
		
	}

}
