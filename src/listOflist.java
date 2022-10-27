import java.util.*;

public class listOflist {
	
	
	public static void main1(String[] args) {
		 //create list of lists
	    List<ArrayList<String>> java_listOfLists = new ArrayList<ArrayList<String>>();
	    //create a language list and add elements to it
	    ArrayList<String> lang_list = new ArrayList<String>();
	    lang_list.add("Java");
	    lang_list.add("C++");
	    //add language list to java list of list
	    java_listOfLists.add(lang_list);
	    Iterator<String> itr_list = lang_list.iterator();
	    while(itr_list.hasNext()) {
	    	System.out.println(itr_list.next());
	    }
	    
	    //create a city list and add elements to it
	    ArrayList<String> city_list = new ArrayList<String>();
	    city_list.add("Pune");
	    city_list.add("Mumbai");
	    //add the city list to java list of lists
	    java_listOfLists.add(city_list);

	    //display the contents of list of lists     
	    System.out.println("Java list of lists contents:");
	    java_listOfLists.forEach(list-> list.forEach(elm->System.out.print(elm+" ")));
	  //--------------------------------------------------------------------------------
	}
	 public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<Integer>();
	        numbers.add(12);
	        numbers.add(8);
	        numbers.add(2);
	        numbers.add(23);
	        
	        
	        for(int i=0;i<numbers.size();++i ) {
	        	if(numbers.get(i)<10) {
	        		numbers.remove(i);
	        	}
	        }
	        Iterator<Integer> it = numbers.iterator();
	       while(it.hasNext()) {
	          Integer i = it.next();
	          if(i < 10) {
	            it.remove();
	          }
	        }
	        System.out.println(numbers);
	      }
	}
	

