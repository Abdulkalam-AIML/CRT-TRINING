import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int t = 0;

        for (int i = 0; i < n; i++) {
            t += sc.nextInt();
        }

            t=t-k*n-(n-2)*k;

        System.out.println(t);
    }
}
