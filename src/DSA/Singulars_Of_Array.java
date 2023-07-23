package DSA;
/*import java.util.*;
public class Singulars_Of_Array {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> cmap = new HashMap<>();
        for(int i:nums) {
            cmap.put(i, cmap.getOrDefault(i, 0) + 1);
        }
            int count=0;
            for(int j: cmap.values()){
                if(j%2!=0){
                    count+=1;
                }
            }
        return count;
    }

    public static void main(String[] args) {
        int[] num={10, 20, 20, 10, 10, 30, 50, 10, 20};
       int r= singleNumber(num);
        System.out.println(r);
    }
}*/

import java.util.*;
public class Singulars_Of_Array {

    private static int singleNumber(int[] nums) {
        Map<Integer, Integer> cmap = new HashMap<>();
        for(int i:nums) {
            cmap.put(i, cmap.getOrDefault(i, 0) + 1);
        }
        int count = countOddOccurrences(cmap);
        return count;
    }

    private static int countOddOccurrences(Map<Integer, Integer> cmap) {
        int count = 0;
        for (int j : cmap.values()) {
            if (j % 2 != 0) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] num = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            num[i] = Integer.parseInt(numbers[i]);
        }
        int r = singleNumber(num);
        System.out.println(r);
    }
}