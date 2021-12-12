import java.util.ArrayList;

public class _9_PalindromeNumber {

//    Given an integer x, return true if x is palindrome integer.
//    An integer is a palindrome when it reads the same backward as forward.
//    For example, 121 is a palindrome while 123 is not.

    public static void main (String args[]){
        System.out.println(isPalindrome(3123213));
    }

    public static boolean isPalindrome(int x) {
        boolean result = true;
        ArrayList<Integer> a = new ArrayList();

        if (x < 0)
            return false;

        else if (x == 0)
            return true;

        int modulo = 0;
        while(x > 0){
            modulo = x % 10;
            x = x / 10;
            a.add(modulo);
        }

        if(a.size() % 2 == 0){
            for(int y = 0; y<=a.size()/2; y++){
                if(!a.get(y).equals(a.get(a.size()-y-1))){
                    result = false;
                }
            }
        }else{
            a.remove(a.size()/2);
            for(int z = 0; z<a.size()/2; z++){
                if(!a.get(z).equals(a.get(a.size()-z-1))){
                    result = false;
                }
            }
        }
        return result;
    }
}
