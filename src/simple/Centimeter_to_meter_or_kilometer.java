package simple;
import java.util.*;

public class Centimeter_to_meter_or_kilometer 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		float num=sc.nextInt();
		float meter,km;
		meter=num/100;
		km=num/10000;
		System.out.println(meter+"    "+km);
		
		
	}

}
