
public class CheckWithOutStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    //Code
			System.out.println("Test0");
		    System.exit(0);
		    System.out.println("Test");
		}
		catch (Exception ex) {
		    //Log the exception
			 System.out.println("Test1");
		}
		finally {
			 System.out.println("Test2");
		    System.exit(1);
		}
	}

}
