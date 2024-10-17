import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validate_sdt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String REGEX = "^\\([0-9]{2}\\)-\\([0-9]{10}\\)$";
        System.out.println("Nhap so dien thoai");
        String name = sc.nextLine();
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(name);
        System.out.println( matcher.matches());
    }
}
