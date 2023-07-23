package DSA;
import java.util.*;
public class Java_DEQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        System.out.print("Enter Number of Integers: ");
        int n = in.nextInt();
        System.out.print("Enter SubArray Size: ");
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element: " + (i+1));
            int input = in.nextInt();

            dq.add(input);
            set.add(input);

            if (dq.size() == m) {
                //If the set size matches the subarray size then the temporary variable value is updated with set size.
                if (set.size() > max)
                    max = set.size();
                System.out.println("Current situation in Set= " + set);
                int first = dq.remove();//Removes the first element from the DEQueue.
                if (!dq.contains(first)) set.remove(first);//if the element removed from queue
            }

        }    System.out.println(max);

    }
}