package string;

import java.io.*;

public class WordCnt {

    public static int wordC(String s){
        if(s == null || s.trim().isEmpty()){
            return 0;
        }
        String[] str=s.trim().split("\\s+");
        return str.length;
    }

    public static void main(String arg[])throws IOException{

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string : ");
        String s=bf.readLine();

        System.out.println("Word count : "+wordC(s));



    }
}
