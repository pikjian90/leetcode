import java.util.HashMap;
import java.util.Map;

public class _13_RomanToInteger {
    public static void main(String[] args) {
        String s  = "MCMXIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s){
        Map<Character,Integer> hashmap = new HashMap<>();
        hashmap.put('I',1);
        hashmap.put('V',5);
        hashmap.put('X',10);
        hashmap.put('L',50);
        hashmap.put('C',100);
        hashmap.put('D',500);
        hashmap.put('M',1000);

        int sum = hashmap.get(s.charAt(s.length()-1));
        System.out.println("sum = " + sum);

        for(int i = s.length()-2;i>=0;i--){
            if(hashmap.get(s.charAt(i)) >= hashmap.get(s.charAt(i+1))){
                sum += hashmap.get(s.charAt(i));
                System.out.println(s.charAt(i) + ": " + hashmap.get(s.charAt(i)) + " + ");
            }
            else {
                sum -= hashmap.get(s.charAt(i));
                System.out.println(s.charAt(i) + ": " + hashmap.get(s.charAt(i)) + " - " );
            }
        }
        return sum;
    }
}
