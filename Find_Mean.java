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
    
}
