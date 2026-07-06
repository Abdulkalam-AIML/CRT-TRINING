import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=0;
        int k = sc.nextInt();
     
        for(int i=1;i<=k;i++){
            if(k%i==0){
               p++;
               System.out.println(i);
             }
        }
      System.out.println(p);
    }
}
