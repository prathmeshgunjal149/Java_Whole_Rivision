package simple;

public class Dis {
	
	  public static void main(String args[])
	   {
	     System.out.println("Enter the Quantity");
	     int q=Integer.parseInt(args[0]);
	     System.out.println("Enter the rate");
	     int r=Integer.parseInt(args[1]);
	      int total=q*r;
	      int dis=total*10/100;
	     
	   System.out.println("Your final bill is-->"+total);


	   }
	 }

