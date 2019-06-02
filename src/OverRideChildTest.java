
public class OverRideChildTest extends OverRideTest{
	
	int i = 1000;
	
	public void method(){
		System.out.println(i);
		i = super.i;
		System.out.println(i);
	}
	
	public static void main(String[] args){
		
		OverRideChildTest obj = new OverRideChildTest();
		obj.method();
		
	}
	

}
