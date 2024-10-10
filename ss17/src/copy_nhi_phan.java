import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class copy_nhi_phan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập đường dẫn tệp nguồn");
        String sourcePath = sc.nextLine();

        System.out.println("Nhập đường dẫn tệp đích");
        String targerPath = sc.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targerPath);

        if (!sourceFile.exists()){
            System.out.println("Tệp nguồn không tồn tại");
            return;
        }

        if (targetFile.exists()){
            System.out.println("Tệp đích đã tồn tại");
            return;
        }

        try(FileInputStream fileInputStream = new FileInputStream(sourceFile);
            FileOutputStream fileOutputStream = new FileOutputStream(targetFile))
        {
            byte [] buffee = new byte[1024];
            int bytesRead;
            int total = 0;

            while ((bytesRead = fileInputStream.read(buffee)) != -1){
                fileOutputStream.write(buffee , 0 ,bytesRead);
                total += bytesRead;
            }
            System.out.println("Sao chép thành công"+total);

        } catch (IOException e){
            System.out.println("Đã xảy ra lỗi");
        }
    }
}
