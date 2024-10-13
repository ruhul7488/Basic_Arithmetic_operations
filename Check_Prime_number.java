import java.util.Scanner;

public class Prime_Number {
    public static void main(String [] arg)
    {
         int n,i,count=0;
       
      Scanner ob =new Scanner(System.in);
      System.out.println("enter any number:");
      n=ob.nextInt();
      for(i=1;i<=n;i++)
      {
        if(n%i==0)
        count++;
      }
      if(count==2)
      System.out.println(n+"number is prime :");
      else{
        System.out.println(n+ "number not a prime number:");
      }


    }
    
}
