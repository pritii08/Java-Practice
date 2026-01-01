import java.io.*;
import java.util.*;
public class Anagram{

    public static boolean isAnagram(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] as1=s1.toCharArray();
        char[] as2=s2.toCharArray();

        Arrays.sort(as1);
        Arrays.sort(as2);

        return Arrays.equals(as1,as2);
    }

    public static void main(String arg[])throws IOException{

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter String : ");
        String s1=bf.readLine();
        String s2=bf.readLine();

        System.out.println("Is given two strings are anagram ? : "+Anagram.isAnagram(s1,s2));


    }
}