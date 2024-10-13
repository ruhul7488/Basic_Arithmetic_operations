 import java.util.Scanner;
 class Mean{
     void findmean(int [] ar){
        int sum=0;
        int result=0;
        for(int i=0;i<=ar.length;i++){
            sum=sum+i;
        }
        result=sum/ar.length;
        // return result;
        System.out.println("mean of given set is:"+result);
    }
        public static void main(String[] ar){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements for calculate the mean of given set");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<=n;i++){
            arr[i]=sc.nextInt();
        }
       Mean m= new Mean();
        m.findmean(arr);  
    }
}
