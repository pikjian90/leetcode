import java.util.ArrayList;
import java.util.List;

public class _412_FizzBuzz {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>();
        for(int x=1;x<=n;x++){
            if(x % 5 == 0 && x % 3 ==0){
                result.add("FizzBuzz");
                continue;
            }
            else if(x % 3 == 0){
                result.add("Fizz");
            }
            else if(x % 5 == 0){
                result.add("Buzz");
            }
            else{
                result.add(String.valueOf(x));
            }
        }
        return result;
    }
}
