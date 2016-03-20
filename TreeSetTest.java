package test;

import java.*;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args){
		
		//creates a new TreeSet named newtree
	TreeSet newtree = new TreeSet();
	
	//assigns values into newtree
	newtree.add("Hello");
	newtree.add(",");
	newtree.add(" this");
	newtree.add("is");
	newtree.add("a");
	newtree.add("TreeSet");
	newtree.add("!");
	
	System.out.println(newtree);
	//checks to see if Hello is present in the treeset
	System.out.println(newtree.contains("Hello"));
	
	//removes , from treeset
	newtree.remove(",");
	System.out.println(newtree);
	
	//crteates treeset tree2 and assigns number values
	TreeSet tree2 = new TreeSet();
	tree2.add(1);
	tree2.add(2);
	tree2.add(3);
	tree2.add(4);
	
	System.out.println(tree2);
	
	
	 //creates an iterator of the newtree
    Iterator iterator = newtree.iterator();
   
    System.out.println("TreeSet contains : ");
    while(iterator.hasNext())
    	System.out.println(iterator.next());
    
    //Nasty Paths
    
    
    try {
        tree2.remove(11);
        System.out.println("Trying to remove an element that does not exist");
        System.out.println(tree2);
    } catch (Exception e) {
        System.out.println("Failure");
    }
    
    try {
        tree2.add(null);
        System.out.println("ATrying to add a null to tree2");
        System.out.println(tree2);
    } catch (Exception e) {
        System.out.println("Failure");
    }
    
    
    	
	}
}
