import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int w=sc.nextInt();
       int f,t,n;
        //x+y=v;
        //y=v-x;
        //2x+4(v-x)=w;
        //f=v-x;
        n=w/2;
        t=n-v;
        f=v-t;
        System.out.println(f);
        System.out.println(t);
    }
}
//concept : if. the v-5
               //   w-16
                 // then 
                  //16/2=8-5=3 3 is the four w
                  //v-3=5-3=2 2-w
