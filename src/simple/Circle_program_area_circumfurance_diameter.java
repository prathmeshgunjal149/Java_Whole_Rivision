package simple;
import java.util.*;
public class Circle_program_area_circumfurance_diameter
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The radius");
		int num=sc.nextInt();
		
		float k=3.14f;
		double a,diameter,cir;
		diameter=2*num;
		System.out.println(" the diameter is:  "+diameter);
		
		cir=2*k*num;
		System.out.println(" The circumfurance is the :->"+cir);
		a=k*num*num;
		System.out.println(" The area is the :->"+a);
	}

}
