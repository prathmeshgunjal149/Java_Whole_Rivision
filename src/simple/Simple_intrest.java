package simple;
import  java.util.*;
public class Simple_intrest 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rate");
		int rate=sc.nextInt();
		System.out.println("Enter the principle");
	    int principle=sc.nextInt();
	    System.out.println("Enter the time");
	    int time=sc.nextInt();
	    int intrest=0;
	    intrest=principle*rate*time/100;
	    System.out.println("intrest is"+intrest);
	}

}
