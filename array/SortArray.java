import java.util.*;

public class SortArray{

    public static void sortArrayAsce(int[] arr){
        int n=arr.length;
        //Ascending order
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }

    }

    public static void sortArrayDesc(int[] arr){
        int n=arr.length;
        //Desending order
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }


    }

    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Sorting array ascending : ");
        sortArrayAsce(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("Sorting array descending : ");
        sortArrayDesc(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
        
        

    }
}