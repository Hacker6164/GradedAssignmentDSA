package DSA;
import java.util.*;
public class Java_SubArray_Problem {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] array1= new int[n];
            for(int i=0;i<n;i++){
                array1[i]=sc.nextInt();
            }
            int c=0;
            for(int j=0;j<n;j++){
                int s=0;
                for(int k=j;k<n;k++){
                    s=array1[k]+s;
                    if(s<0){
                        c++;
                    }
                }
            }
            System.out.println(c);
        }
}
