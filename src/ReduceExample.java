import java.util.*;
public class ReduceExample {
	  public static void main(String[] args)   
	    {   
		// Create a list of numbers either positve or negative  
	        List<Integer> numbers = Arrays.asList(8, -4, 16, 0, 1, -6, 3);   
	        // calculate sum of all the elements of the numbers array using the reduce method   
	        float sumOfElements = numbers.stream().reduce(0, (firstElement, secondElement) -> firstElement + secondElement);   
	        // show the result returned by the reduce method  
	        System.out.println("The sum of all elements of numbers array " + sumOfElements);   
	    }   
	    }
	      /*  // create a list of names to perform operations   
	        List<String> javaTpointStudents = Arrays.asList("Emma Watson", "Paul Walker", "Leesa",   
	                                           "James", "Lilly");   
	        // The reduce() method takes the lambda expression that take two string type values and returns a longer string  
	        //The Optional data is returned as a result from the reduce() method because the list can be emplty on which reduce() method is called.  
	        Optional<String> newString = javaTpointStudents.stream().reduce((firstName, secondName)-> firstName.length() > secondName.length()? firstName : secondName);   
	        // show the result returned by the reduce method  
	        newString.ifPresent(System.out::println);   
	    }   */

