package DSA;
import java.util.*;
public class Cumulative_Multiple_of_an_Array {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter a size for array");
        int n=k.nextInt();
        System.out.println("Enter Elemens: ");
        int[] arrNum=new int[n];
        try {
            for (int i = 0; i < arrNum.length; i++) {
                arrNum[i] = k.nextInt();
            }
            cumulativeMultiple(arrNum);
        }catch (InputMismatchException e){
            System.err.println("Give only integer Inputs");
        }
       cumulativeMultiple(arrNum);
    }
    public static void cumulativeMultiple(int[] arrNum){
       int cm=1;
       for(int i=0;i<arrNum.length;i++){
            cm = cm*arrNum[i];
            arrNum[i]=cm;
        }
        for(int j: arrNum){
            System.out.print(j + " ");
        }
    }
}
