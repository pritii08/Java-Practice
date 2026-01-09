public class InsertionSort{

    public static void sortArray(int[] arr){

        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= current;
        }


        System.out.println("Sorted array : ");
        for(int i : arr){
            System.out.println(i);
        }


    }


    public static void main(String arg[]){
        int[] arr={7,8,3,2,1};
        sortArray(arr);

    }
}