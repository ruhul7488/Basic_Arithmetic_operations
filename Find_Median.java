 import java.util.Scanner;
import java.util.Arrays;
 class Median{
      void median(int [] ar){
        int result=0;
        int n=ar.length;
        Arrays.sort(ar);
        int nth=n/2;
        int nth2=(n+1)/2;
        if(n%2==0)
        {
            int sum=(ar[nth-1]+ar[nth]);
            result=sum/2;
           System.out.println("median of given set is:"+result);

        }
        else{
            result=(ar[nth2-1]);
            System.out.println("median of given set is:"+result);

        }
      }
    
}

public class Main{
    public static void main(String[] arg){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements for calculate the median of given set");

        n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       Median m= new Median();
        m.median(arr);

    }
}
