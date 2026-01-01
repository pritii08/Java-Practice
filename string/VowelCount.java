/** Here is this vowel count problem we will count the number of vowels present in given string
 *  Vowels= ['a','e','i','o','u']
 */

import java.io.*;

public class VowelCount{

    public int countVowel(String s){
        int c=0;

        s.toLowerCase();

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                c++;
            }
        }
        return c;
    }

    public static void main(String arg[])throws IOException{

        VowelCount vc=new VowelCount();

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter String : ");
        String s=bf.readLine();

        System.out.println("Vowel count = "+vc.countVowel(s));

    }
}