package Pratice.Recursion;

public class Recursion_1 {
    public static void main(String[] args) {
//        System.out.println(getSum(3));
        int n = 9;
        for(int i=1 ; i<= n;i++) {
            System.out.println(getFibonaci(i));
        }
    }

    public static int getSum(int n){
        return n == 1 ? 1 : n+getMultiply(n-1);
    }

    public static int getMultiply(int n){
        return n == 1 ? 1 : n*getMultiply(n-1);
    }

    public static int getFibonaci(int n){
        return n == 1 || n ==2 ?  1 :  getFibonaci(n-1) + getFibonaci(n-2);
    }
}
