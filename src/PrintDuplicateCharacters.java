import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharacters {

	public PrintDuplicateCharacters() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayDuplicateCharecters("APPLE");
		displayDuplicateCharecters("LEZIL");
		
	}

	private static void displayDuplicateCharecters(String str) {
		char[] charecters = str.toCharArray();
		
		Map<Character , Integer> mapObj=new HashMap<Character, Integer>();
		for(Character c : charecters){
			System.out.println("charecters :" + c);
			if(mapObj.containsKey(c)){
				mapObj.put(c,mapObj.get(c)+ 1);
				System.out.println("Match Found :" + c);
			} else {
				mapObj.put(c, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> setObj = mapObj.entrySet();
		for (Map.Entry<Character, Integer> entry : setObj) 
		{ 
			if (entry.getValue() > 1) 
			{ 
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue()); 
			} 
		}

		
	}

}
