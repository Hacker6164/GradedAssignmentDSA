package DSA;
import java.util.*;
public class Missing_Number_INArray {
    public static void MNA(int[] a,int N){
        int temp=0;
        for(int i=a[0];i<a[N-1];i++){
            if(a[temp]==i){
                temp++;
            }else{
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner In=new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int N=In.nextInt();
        int[] arr=new int[N];
        for(int j=0;j<N;j++){
            arr[j]=In.nextInt();
        }
        MNA(arr,N);
    }
}
//C:\Users\rsjh6\IdeaProjects\BasicJava\src\AssignmentPractice\Missing_Number_INArray.java
