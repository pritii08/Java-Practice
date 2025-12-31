//Take input String from user and reverse the string
import java.util.Scanner;

public class ReverseString{

    public String reverseString(String s){
        char[] arr=s.toCharArray();
        StringBuilder str=new StringBuilder();

        for(int i=arr.length-1;i>=0;i--){
            str.append(arr[i]);
        }

        return str.toString();
    }



    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        ReverseString r=new ReverseString();

        System.out.println("Enter the String : ");
        String s=sc.nextLine();

        System.out.println(s);
        System.out.println(r.reverseString(s));



    }
}