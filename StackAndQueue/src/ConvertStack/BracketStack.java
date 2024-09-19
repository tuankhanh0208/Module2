package ConvertStack;

import java.util.Stack;

public class BracketStack {
    public static boolean isBracketStack(String expression){
        Stack<Character> stack = new Stack<>();
        for (char sym : expression.toCharArray()){
            if(sym == '(' || sym == '{' || sym == '['){
                stack.push(sym);
            } else if (sym == ')' || sym == '}' || sym == ']') {
                if (stack.isEmpty()){
                    return false;
                }
                char left = stack.pop();
                if(     (sym == ')' && left != '(' ) ||
                        (sym == '}' && left != '{' ) ||
                        (sym == ']' && left != '[' )){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        // Một số ví dụ về biểu thức toán học
        String[] expressions = {
                "s * (s – a) * (s – b) * (s – c)",  // Well
                "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))", // Well
                "s * (s – a) * (s – b * (s – c)",   // Not well
                "s * (s – a) * s – b) * (s – c)",   // Not well
                "(– b + (b^2 – 4*a*c))^(0.5/ 2*a)"  // Well
        };

        // Kiểm tra từng biểu thức
        for (String expression : expressions) {
            boolean result = isBracketStack(expression);
            System.out.println("\"" + expression + "\" là " + (result ? "đúng" : "sai") + " về dấu ngoặc.");
        }
    }
}
