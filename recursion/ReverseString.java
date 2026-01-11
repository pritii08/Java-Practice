/** Reversing a string using recursion */

import java.util.*;

public class ReverseString{

    public static String reverseString(String str){
        if(str.length()==0 || str==null){
            return "";
        }

        char lastChar=str.charAt(str.length()-1);
        String remainingStr=str.substring(0,str.length()-1);

        return ""+lastChar+reverseString(remainingStr);
    }



    public static void main(String arg[]){

        String name="Priti";

        System.out.println("Reverse String = "+reverseString(name));


    }
}