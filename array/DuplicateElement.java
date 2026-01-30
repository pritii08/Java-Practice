package array;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElement {

    public static void duplicateElement(int[] arr){
        HashSet<Integer> set=new HashSet<Integer>();
        System.out.println("Duplicate Elements :");
        for(int i:arr){
            if (!set.add(i)){
                System.out.println(i);
            }
        }
    }




    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        duplicateElement(arr);


    }
}
