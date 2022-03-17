import java.util.Stack;

public class _20_ValidParentheses {
    public static void main(String[] args) {

    }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(c == '}'){
                    if('{' != stack.pop()){
                        return false;
                    }
                }
                else if(c == ']'){
                    if('[' != stack.pop()){
                        return false;
                    }
                }
                else if(c == ')'){
                    if('(' != stack.pop()){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
