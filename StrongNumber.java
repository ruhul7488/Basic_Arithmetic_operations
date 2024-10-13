import java.util.*;
public class StrongNumber {
    public int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public void strong(int num){
        int no=num;
        int sum=0;
        while(num!=0){
            int r=num%10;
         sum=sum+fact(r);
         num=num/10;
        }
        if(no==sum){
            System.out.println("the number is strong number:");
        }
        else{
            System.out.println("the number is not Strong number:");
        }
    }
public static void main(String[]a){
    StrongNumber ob=new StrongNumber();
    int number;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter any number:");
  number=sc.nextInt();
ob.strong(number);

}
}
