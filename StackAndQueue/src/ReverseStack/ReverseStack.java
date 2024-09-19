package ReverseStack;

import java.util.Stack;

public class ReverseStack {
    public static String reverseString(String str){
    Stack<String> stack = new Stack<>();
    String [] words = str.split(" ");
    for (String word : words){
        stack.push(word);
    }
        StringBuilder stringBuilder = new StringBuilder();
    while (!stack.isEmpty()){
        stringBuilder.append(stack.pop()).append(" ");
    }
    return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        String original = "Hello world this is Java";
        String reversed  = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed : " + reversed);
    }
}
