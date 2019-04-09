
public class SingletonDemo {

	int a;

	public static SingletonDemo singletonDemoObj = null;
	
	public SingletonDemo() {
		a = 10;
	}
	
	public static SingletonDemo getObjectInstance (){
		
		if(singletonDemoObj == null){
			singletonDemoObj = new SingletonDemo();
		}
		return singletonDemoObj;
		
	}
	

	public static void main(String[] args) {
		SingletonDemo obj = SingletonDemo.getObjectInstance();
		System.out.println(obj.a);
		obj.a = 20;
		SingletonDemo objNew = SingletonDemo.getObjectInstance();
		System.out.println(objNew.a);

	}

}
