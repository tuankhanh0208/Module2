package ConvertStack;

import java.util.Queue;

import java.util.LinkedList;
import java.util.Stack;

public class Palindrome {
    public static boolean isPalindrome(String input){
        String s = input.replaceAll("[^a-zA-Z]" ,"").toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            queue.add(ch);
            stack.push(ch);
        }
        while (!queue.isEmpty()){
            char queueChar = queue.poll();
            char stackChar = stack.pop();
            if(queueChar != stackChar){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "Able was I ere I saw Elba";
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" là chuỗi Palindrome.");
        } else {
            System.out.println("\"" + input + "\" không phải là chuỗi Palindrome.");
        }
    }
}
