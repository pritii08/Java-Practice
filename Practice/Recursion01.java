package Practice;

public class Recursion01 {
    //Printing numbers from 1 to 10
    public static void printNumbers(int i){
        if(i==10){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        i++;
        printNumbers(i);
    }

    //Number sum till n
    public static int numberSum(int n){
        if(n==0){return 0;}
        return n+numberSum(n-1);
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int digitCnt(int n){
        if(n==0){return 0;}
        return 1+digitCnt(n/10);
    }

    public static int reverseNum(int num){
        if(num==0){
            return 0;
        }
        int lastDigit=num%10;
        int remaining=num/10;
        return lastDigit*(int) Math.pow(10,digitCnt(num/10))+reverseNum(remaining);
    }

    public static String reverseString(String str){
        if(str==null || str.isEmpty()){
            return "";
        }
        char ch=str.charAt(str.length()-1);
        String substring=str.substring(0,str.length()-1);
        return ""+ch+reverseString(substring);
    }


    public static void main(String arg[]){

        //printNumbers(1);

//        System.out.println(numberSum(5));
//        System.out.println(factorial(5));
        System.out.println(digitCnt(1));
        System.out.println(reverseNum(123456));
        System.out.println(reverseString("PRITI"));

    }
}
