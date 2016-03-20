package test;
import java.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;;

public class MapTest {

	public static void main(String[] args){
		//creates a map that has an object for the key and a string for the value
		Map<Integer, String> testMap = new HashMap<Integer, String>();
		
	//Put data into the map
		testMap.put(1, "A");
		testMap.put(2, "B");
		testMap.put(3, "C");
		testMap.put(4, "Hello");
		testMap.put(4, "D"); //Because keys can only have one value Hello is overwritten.
		
		//shows the value in spot 4
		String text = testMap.get(4);
		System.out.println(text);
		
		//shows all values with keys
		System.out.println(testMap);
		
		
		//access via Iterator
		Iterator<Map.Entry<Integer, String>> iterator = testMap.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.printf("Key : %s and Value: %s %n", entry.getKey(), entry.getValue());
			}
		testMap.remove(2);
		System.out.println(testMap);
		
		//Nasty Paths
		Map testMap2 = new HashMap();
		
		testMap2.put(1, "A");
		testMap2.put(2, "B");
		testMap2.put(3, "C");
		testMap2.put(4, "D");
		
		System.out.println("Trying to combine two maps");
		 try {
	            testMap2.putAll(testMap);
	            System.out.println(testMap2);
	        } catch (Exception e) {
	            System.out.println("failure");
	        }
		 System.out.println("Getting a key that does not exist");
	        try {
	            System.out.println(testMap.get(45));
	        } catch (Exception e) {
	        	System.out.println("failure");
	        }
	        
	        try {
	            System.out.println(testMap.get(null));
	        } catch (Exception e) {
	        	System.out.println("failure");
	        }
		
}
	}
