import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int p;
        int sum = 0;
        int del=0;
        
        
       
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
         for (int i = 0; i < n; i++) {
             sum+=arr[i];
         }
          int d=sum%n;
          int avg=sum/n;
          int mov=0;
          for(int i=0;i<n;i++){
              int rem=arr[i]-avg;
              if(rem>0){
                  mov=mov+rem;
              }
          }
          
           mov = mov-del;
            
        System.out.println(del+" "+mov);
    }
}
