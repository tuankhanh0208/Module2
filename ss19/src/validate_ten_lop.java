import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validate_ten_lop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String REGEX = "^[CAP 0-9{4} GHIK]{6}$";
        System.out.println("Nhap ten lop");
        String name = sc.nextLine();
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(name);
        System.out.println( matcher.matches());
    }
}
