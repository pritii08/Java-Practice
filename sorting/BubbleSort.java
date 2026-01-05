import java.util.*;

public class BubbleSort{

    public static void arraySorting(int[] arr, int n){
        //Bubble sort: Sorting array by comparing and swapping adjacent elements
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted array : ");
        for(int i: arr){
            System.out.println(i);
        }


    }



    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the number : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Sorting array using bubble sort : ");
        BubbleSort.arraySorting(arr,n);
    }
}