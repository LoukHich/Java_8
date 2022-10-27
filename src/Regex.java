import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Regex {
	public void test( int...  elm2 ) {
		System.out.println(elm2.length);
	}
	public static void main2(String[] args) {
	     Scanner sc = new Scanner(System.in) ;
	     int taille = sc.nextInt();
	    // System.out.println(taille);
	     List<Integer> list = new ArrayList<Integer>();
	      for(int i=0;i<taille;i++){
	         list.add(sc.nextInt());
	       }
	      System.out.println(list);
	     int nbr =sc.nextInt();
	    // System.out.println(nbr);
	     for(int i=0;i<nbr;i++){
	    	 String req= sc.next();
	    	// System.out.println(req);
	          if(req.equals("Insert")){
	           int index = sc.nextInt(),val=sc.nextInt();
	         //  System.out.println(index+" "+val);
	           list.add(index,val);
	        //   System.out.println(list);
	           }else{
	        	   
	        	   
	        	   
	               int index = sc.nextInt();
	          //     System.out.println(index);
	               list.remove(index);
	           }
	     }
	    
	     sc.close();
	  list.forEach(elm->System.out.print(elm+" "));
	    }
	    
	public static void main1(String[] args) {
		String regex="^[A-Za-z]+@.+\\..+";
		String  regex1="^[^^]";
		String regex2="^[A-Za-z]{1}[A-Za-z0-9_]{7,10}";
		String input ="szdzdsdhssss";
	    
		
		boolean check =  input.matches(regex2);
		System.out.println(check);
	}
	public static void main(String[] args) {
		String regex ="^(((0|1){0,1}[0,9]{0,2}|2{0,1}[0-5]{0,2}).){3}";
         String reg ="^\\d{0,2}";
		String input = ".255.257";
		System.out.println(input.matches(regex));
		//System.out.println("".matches(reg));
	}
}
