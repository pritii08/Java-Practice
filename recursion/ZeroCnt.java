package recursion;

public class ZeroCnt {

    public static int zeroCount(int num){
        if(num==0){
            return 0;
        }
        int lastdigit=num%10;

        if(lastdigit==0){
            return 1+zeroCount(num/10);
        }
            return zeroCount(num/10);

    }

    public static void main(String arg[]){

        System.out.println(zeroCount(102030));

    }
}
