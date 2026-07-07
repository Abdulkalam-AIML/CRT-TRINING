import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int e=0,o=0;
        for (int i=0;i<n;i++) {
            int x=sc.nextInt();
            if (x%2==0)
                e++;
            else
                o++;
        }
        System.out.println(e + " " + o);
    }
}
