package ConvertStack;

import java.util.Stack;

public class ConvertStack {
    public static String decimalToBinary(int decimalNumber){
        Stack<Integer> stack = new Stack<>();
        if(decimalNumber==0){
            return "0";
        }
        while (decimalNumber >0){
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber=decimalNumber/2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 111;
        String binaryResult = decimalToBinary(decimalNumber);
        System.out.println("So " + decimalNumber + " he thap phan la " + binaryResult +" o he nhi phan ");
    }
}
