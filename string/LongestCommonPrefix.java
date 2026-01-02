/*** 
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "". 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 */

import java.io.*;

public class LongestCommonPrefix{

    public static String longestPrefix(String[] s){
        String prefix=s[0];

        for(int i=0;i<s.length;i++){
            while(s[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }

        return prefix;
        

    }

    public static void main(String arg[])throws IOException{

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the array size: ");
        int n=Integer.parseInt(bf.readLine());
        String[] s=new String[n];
        System.out.println("Enter the strings : ");
        for(int i=0;i<n;i++){
            s[i]=bf.readLine();
        }

        System.out.println("Longest common prefix = "+LongestCommonPrefix.longestPrefix(s));

        



    }
}