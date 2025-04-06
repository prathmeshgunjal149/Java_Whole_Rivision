package simple;
import java.util.*;
public class Farnite_to_celcies 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		float num=sc.nextInt();
		float cel;
		cel=(num-32)*5/9;
		System.out.println("the celcius is-->"+cel);
		
	}

}
