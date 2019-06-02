import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class UniqueObjectsSortedDemo {

	public static void main(String[] args) {
		//Unique objects in a sorted manner
		
		//LinkedList
		//SortedList
		//TreeSet
		
		//java.util.List is a child interface of Collection
		//It is an ordered collection of objects in which duplicate values can be stored
		//List preserves the insertion order it allows positional access and insertion of elements
		//List Interface is implemented by ArrayList, LinkedList, Vector and Stack classes.
		
		List a = new ArrayList();
		List b = new LinkedList();
		List c = new Vector(); 
		List d = new Stack();
		
		TreeSet<String> ts1 = new TreeSet<String>(); 
		  
	    // Elements are added using add() method 
	    ts1.add("A"); 
	    ts1.add("D");
	    ts1.add("DB");
	    ts1.add("DC");
	    ts1.add("C"); 
		  
	    // Duplicates will not get insert 
	    ts1.add("C"); 
	  
	    ts1.add("B");
	    // Elements get stored in default natural 
	    // Sorting Order(Ascending)
	    // Output [A, B, C, D, DB, DC]
	    System.out.println(ts1); 
	    
	    LinkedList<String> friends = new LinkedList<>();

        // Adding new elements to the end of the LinkedList using add() method.
        friends.add("Rajeev");
        friends.add("John");
        friends.add("David");
        friends.add("Chris");
        friends.add("Rajeev");

        System.out.println("Initial LinkedList : " + friends);
	    
	    
	    
	}

}
