import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=0;
        int k = sc.nextInt();
        int l=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int d=sc.nextInt();
        for(int i=0;i<=d;i++){
            if(i%k!=0&&i%l!=0&&i%m!=0&&i%n!=0){
               p++;
             }
        }
      System.out.println(d-p);
    }
}
