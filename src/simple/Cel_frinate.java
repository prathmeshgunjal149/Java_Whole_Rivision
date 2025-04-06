package simple;
import java.util.*;
public class Cel_frinate 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The celcious to convert in Faherinate");
		float num=sc.nextInt();
		float fah;
		fah=(num*9/5)+32;
		System.out.println("The Faherinate "+fah);
		
	}

}
