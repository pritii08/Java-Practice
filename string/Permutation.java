// Permutation - all possible strings can be created from given string


import java.util.*;

public class Permutation{

    public static void printPermut(String str,String perm){

        if(str.length()==0){
            System.out.println(perm);
            return;
        }

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            String newStr=str.substring(0,i)+str.substring(i+1);
            printPermut(newStr,perm+c);
        }
    }



    public static void main(String[] arg){
        String str="abc";
        printPermut(str,"");
    }
}