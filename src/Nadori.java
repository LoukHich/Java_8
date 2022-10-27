import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Nadori {
	
	
	
	public static String concat(String s1) {
		return s1 + "Nador";
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases-- !=0){
			
           
                String pattern = in.next();
         try{
              Pattern.compile(pattern);
              System.out.println("Valid");
          }catch(PatternSyntaxException  e){
             System.out.println("Invalid");
          }
              
		}
	}
	
	public static void main1(String[] args) {
		
		
		  Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        String[] tokensVal = s.trim().split("[! ,?._'@]+");
	        if(s.trim().length()==0){
                System.out.println("0");
                return ;
           }
	    System.out. println(tokensVal.length);
	        for(String str :tokensVal) {
	        	System.out.println(str);
	        }
	        scan.close();
		
		/*String st= "nadori";
		System.out.println(st.substring(1));
		
		StringBuilder str = new StringBuilder(3);
		str.append("nadori");
		System.out.println(str.toString().length());
		String str1 ="";
		System.out.println(str1.toString().equals(str.toString()));
		String s2 ="ville ";
		System.out.println(concat(s2));
	}*/
	}
}

