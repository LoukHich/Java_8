import java.math.BigInteger;
import java.util.Scanner;



public class Main3 {
	public static void main(String[] args) {
		int n1,n2 =2;
		/*Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		for(int i=0;i<3;i++){
			amount=(int) (amount*(1-0.1));
		}
		System.out.println(amount);*/
		
		int a=10005200;
		int res =0;
		System.out.println(Integer.toBinaryString(a));
		String str ="";
		//int count=0;
		//int res = 0;
		/*while(a!=0) {
		res +=(a%2) * ((int)(Math.pow(10, count)));
			 a=a/2;
			 count++;
		}
		// res += a * ((int)(Math.pow(10, count)));
	System.out.println(res);*/
		while(a!=0) {
			str=(a%2+str);
			a=a/2;
		}
	System.out.println(str);
		
	}
}
