package DAY4;
import java.util.Scanner;
public class Task1 {
		public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		try{
			System.out.println("Enter the number");
			int Number=s.nextInt();
			int total=10/Number;
			System.out.println("Total:"+total);
	}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		}
	}


