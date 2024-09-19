import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class index {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");

        // Try to sum numbers; if fails, concatenate the strings
        try {
            int sum = 0;
            for (String token : tokens) {
                sum += Integer.parseInt(token);
            }
            System.out.println(sum);
        } catch (NumberFormatException e) {
            StringBuilder concatenatedString = new StringBuilder();
            for (String token : tokens) {
                concatenatedString.append(token);
            }
            System.out.println(concatenatedString.toString());
        }
    }
}