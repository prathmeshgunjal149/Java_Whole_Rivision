//Q1. WAP to create thread using Thread class and display five values with a difference
// of 10000 milliseconds time slot?
package thread.org;
class MyThread extends Thread
{
    @Override
    public void run() {
         try{

              for(int i=0;i<=10;i++)
              {
                  System.out.println("The Number Is.."+i);
                  Thread.sleep(1000);
              }
         }catch(Exception ex)
         {
             System.out.println("The Error is.."+ex);
         }
    }
}
public class Display_Number {
    public static void main(String args[])
    {
         MyThread mt=new MyThread();
         mt.start();
    }
}
