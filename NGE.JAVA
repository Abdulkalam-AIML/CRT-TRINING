import java.util.*;

public class SET {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[] = new int[n];
        for (int o = 0; o < n; o++) {
            arr[o]=sc.nextInt();

        }


        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            ans.add(-1);
        }

            for (int i = arr.length-1; i >=0; i--) {

                while (!s.isEmpty() && s.peek() < arr[i]) {
                    s.pop();

                }
                if (!s.isEmpty()) {
                    ans.set(i, s.peek());
                }
                s.push(arr[i]);
            }


        for(int e:ans) {

            System.out.print(e+" ");
        }
    }
}

