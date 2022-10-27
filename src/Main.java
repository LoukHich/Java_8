import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	private static List<Person> getPeople() {
	    return List.of(
	        new Person("Antonio", 20, Gender.MALE),
	        new Person("Alina Smith", 33, Gender.FEMALE),
	        new Person("Helen White", 57, Gender.FEMALE),
	        new Person("Alex Boz", 14, Gender.MALE),
	        new Person("Jamie Goa", 99, Gender.MALE),
	        new Person("Anna Cook", 7, Gender.FEMALE),
	        new Person("Zelda Brown", 120, Gender.FEMALE)
	    );
	} 		
	
public static void main(String[] args) {
	    System.out.println("******* Bonjour Nadori *********");
	    List linkedlist = new LinkedList(); 
	    List arrayList = new ArrayList();
	    List vec_list = new Vector();   
	    List stck_list = new Stack();
	    
	    linkedlist.add(1);
	    linkedlist.add(null);
	    
	    linkedlist.add(5);
	    linkedlist.add(5);
	    linkedlist.add(3);
	    System.out.println(linkedlist);
	    vec_list.add(1);
	    vec_list.add(null);
	    vec_list.add(5);
	    vec_list.add(5);
	    vec_list.add(3);
	    System.out.println(vec_list);
	    stck_list.add(1);
	    stck_list.add(null);
	    stck_list.add(5);
	    stck_list.add(5);
	    stck_list.add(3);
	    System.out.println(stck_list);
	    
	    String[] strArray = {"Delhi", "Mumbai", "Kolkata", "Chennai"};
	       //initialize an immutable list from array using asList method
	        List<String> mylist = Arrays.asList(strArray);
	        //smylist.add("Nadori");
	        //print the list
	        System.out.println("Immutable list:");
	        mylist.forEach(elm->System.out.print(elm + " "));
	        System.out.println("\n");
	        //initialize a mutable list(arraylist) from array using asList method
	        List<String> arrayListe = new ArrayList<>(Arrays.asList(strArray));
	        System.out.println("Mutable list:");
	        //add one more element to list
	        arrayListe.add("Pune");
	        //print the arraylist
	         arrayListe.forEach(elm->System.out.print(elm + " "));
	         List<Integer> num_stack = new Stack<Integer>(){
	        	     {
	        		    add(10);add(20); 
	        		 }
	        	 }; 
	         System.out.println("Stack : " + num_stack.toString()); 
	         List lista = new ArrayList<Integer>() {{add(10);add(14);
	         }
	         };
	         System.out.println(lista);
	         
	         List<String> list1 = Stream.of("January", "February", "March", "April", "May") 
                     .collect(Collectors.toList()); 
        list1.add("Nadori");
// Print the list 
              System.out.println("List from Java 8 stream: "
              + list1.toString()); 
              
              List<String> strList = List.of("Delhi", "Mumbai", "Kolkata"); 
              strList.add("Nadori");
              // Print the List 
            System.out.println("List using Java 9 List.of() : " + strList.toString()); 
	    }



}
