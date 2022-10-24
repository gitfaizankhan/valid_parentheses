import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([]{})";
        boolean b = validP(s);
        System.out.println(b);
    }
    static boolean validP(String s){
        Stack<Character> stack = new Stack<Character>();
        for(char value : s.toCharArray()){
            if(value == '('){
                stack.push(')');
            }else if (value == '{'){
                stack.push('}');
            }else if (value == '['){
                stack.push(']');
            }else if (stack.isEmpty() || stack.pop() != value){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
