import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://www.softwaretestinghelp.com/java-list-how-to-create-initialize-use-list-in-java/#
public class List_exemple {
	public static void main(String[] args) 
    { 
        // Creating a list 
        List<Integer> intList = new ArrayList<Integer>(); 
        //add two values to the list
        intList.add(0, 10); 
        intList.add(1, 20);  
        System.out.println("The initial List:\n" + intList);  
 
        // Creating another list 
        List<Integer> cp_list = new ArrayList<Integer>(); 
       cp_list.add(30); 
       cp_list.add(40); 
       cp_list.add(50); 
 
        // add list cp_list to intList from index 2 
        intList.addAll(2, cp_list); 
        System.out.println("List after adding another list at index 2:\n"+ intList); 
 
        // Removes element from index 0 
        intList.remove(0); 
        System.out.println("List after removing element at index 0:\n" + intList); 
 
        // Replace value of last element 
        intList.set(3, 60); 
        System.out.println("List after replacing the value of last element:\n" + intList); 
      //list of even numbers
        List<Integer> evenlist = Arrays.asList(2,4,6,8,10,12,14);
        // print list using streams
        System.out.println("Contents of evenlist using streams:");
        evenlist.stream().forEach(S ->System.out.print(S + " "));
    } 
}
