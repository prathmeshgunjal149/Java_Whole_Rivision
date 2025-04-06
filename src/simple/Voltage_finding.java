package simple;
import java.util.*;
public class Voltage_finding
{
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the inpuit");
		float res=sc.nextInt();
		float curr=sc.nextInt();
		float vol=sc.nextInt();
		res=vol/curr;
		curr= vol/res;
		vol=curr*res;
		System.out.println("voltage is-->"+vol);
		System.out.println("current  is-->"+curr);
		System.out.println("resistance is-->"+res);
		
	}

}
