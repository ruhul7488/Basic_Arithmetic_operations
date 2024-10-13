import java.util.Scanner;

public class fact {
    public static void main(String [] arg)
    {
    int n,f=1,i;
      Scanner ob =new Scanner(System.in);
      System.out.println("enter number for factorial:");
      n = ob.nextInt();
      for(i=1;i<=n;i++)
      {
          f=f*i;
      }
      System.out.println("factorial is : "+f);
