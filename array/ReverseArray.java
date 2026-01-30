package array;

import java.util.Scanner;

public class ReverseArray {

    public static int[] reverseArray(int[] arr){

        int left=0,right=arr.length-1;

        while(left<right && right>0){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }


        return arr;
    }


    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Reversed Array : ");
        for(int i: reverseArray(arr)){
            System.out.println(i);
        }

    }
}
