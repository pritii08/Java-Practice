package sorting;

public class Practice {

    public static int[] bubbleSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


        return arr;
    }



    public static void main(String arg[]){

        int[] arr={10,20,30,40};

        for(int i:bubbleSort(arr)){
            System.out.println(i);
        }


    }
}
