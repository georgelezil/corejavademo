
public class StringDemo {
	
	public static void main(String[] args){
		String s1="Hi Friend";
		String s2=new String("Hi Friend");
		//Will be false
		System.out.println(s1==s2);
		
		String s3="Hi Friend";
		String s4="Hi Friend";
		//Will be true
		System.out.println(s3==s4);
		
		String s5="Hi Friend";
		String s6=s5;
		//Will be true and have the same value
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s5==s6);
	}

}
