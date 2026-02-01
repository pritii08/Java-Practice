package array;

import java.util.*;
public class SecondLargest {

    public static int secondLargestElement(int[] arr){
        int max=Integer.MIN_VALUE;
        int seMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                seMax=max;
                max=arr[i];
            }else if(arr[i]<max && arr[i]>seMax){
                seMax=arr[i];
            }
        }

        return seMax;
    }


    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Second largest element = "+secondLargestElement(arr));
    }
}
