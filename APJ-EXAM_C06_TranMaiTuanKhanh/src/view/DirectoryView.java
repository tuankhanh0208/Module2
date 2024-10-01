package view;

import common.ExceptionHandler;
import manager.DirectoryManager;
import model.Directory;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectoryView {
    private static Scanner sc = new Scanner(System.in);
    private static Scanner  scString = new Scanner(System.in);
    private DirectoryManager directoryManager = new DirectoryManager();
    int choice;
    public void renderMenu(){
        showMenu();
    }
    public void showMenu(){
        do {

        System.out.println("----CHƯƠNG TRÌNH QUẢN LÍ DANH BẠ----");
        System.out.println("Chọn chức năng theo số(để tiếp tục) :");
        System.out.println("1.Xem danh sách");
        System.out.println("2.Thêm mới");
        System.out.println("3.Cập nhập");
        System.out.println("4.Xóa");
        System.out.println("5.Tìm kiếm");
        System.out.println("6.Đọc từ file");
        System.out.println("7.Ghi vào file");
        System.out.println("8.Thoát");
        System.out.println("Chọn chức năng : ");
        choice = ExceptionHandler.checkParseInt();

        switch (choice){
            case 1:
                showDisplay();
                break;
            case 2:
                showAddDirectory();
                break;
            case 3:
                showEditDirectory();
                break;
            case 4:
                showRemoveDirectory();
                break;
            case 5:
                showSearchDirectory();
                break;
            case 6:
                showReadToFile();
                break;
            case 7:
                showWriteToFile();
                break;
            case 8:
                System.out.println("=======THOÁT========");
                break;
            default:
                System.out.println("Mời bạn nhập lại");
        }
        }while (choice != 8);
    }

    private void showWriteToFile() {
        System.out.println("====LƯU VÀO FILE====");
        if (true) {
            directoryManager.saveDirectoryToFile();
            System.out.println("Lưu danh bạ vào file thành công.");
        } else {
            System.out.println("Lưu vào file đã bị hủy.");
        }
    }

    private void showReadToFile() {
        System.out.println("====ĐỌC TỪ FILE====");
        if (true) {
            directoryManager.reloadDirectory();
            System.out.println("Cập nhật danh bạ từ file thành công.");
        } else {
            System.out.println("Đọc từ file đã bị hủy.");
        }
    }

    private void showSearchDirectory() {
        do {
            System.out.println("======TÌM KIẾM DANH BẠ========");
            System.out.println("1.Tìm theo số điện thoạt :");
            System.out.println("2.Tìm theo họ tên :");
            int choice = ExceptionHandler.checkParseInt();
            List<Directory> directoryLists = new ArrayList<>();
            switch (choice){
                case 1:
                    System.out.println("Nhập số dđiện thoạt :");
                    String phoneNumber = scString.nextLine();
                    directoryLists = directoryManager.searchDirectoryByPhone(phoneNumber);
                    break;
                case 2:
                    System.out.println("Nhập họ tên: ");
                    String fullName = scString.nextLine();
                    directoryLists = directoryManager.searchDirectoryByFullName(fullName);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    return;
            }
            if (directoryLists.isEmpty()) {
                System.out.println("Không tìm thấy kết quả phù hợp.");
            } else {
                System.out.println("Kết quả tìm kiếm:");
                for (Directory directory : directoryLists) {
                    System.out.println(directory);
                }
            }
        }while (choice!=3);
    }

    private void showRemoveDirectory() {
        System.out.println("====XÓA DANH BẠ====");
        String phoneNumber;
        do {
            System.out.print("Nhập số điện thoại cần xóa (nhấn Enter để quay lại Menu): ");
            phoneNumber = scString.nextLine();
            if (phoneNumber.isEmpty()) {
                System.out.println("Quay lại Menu chính.");
                return;
            }
            Directory directory = (Directory) directoryManager.searchDirectoryByPhone(phoneNumber);
            if (directory != null) {
                System.out.println("Bạn có chắc muốn xóa danh bạ với số điện thoại " + phoneNumber + " không? (Nhập 'Y' để xác nhận): ");
                String confirm = scString.nextLine();
                if (confirm.equalsIgnoreCase("Y")) {
                    directoryManager.delete(phoneNumber);
                    System.out.println("Danh bạ với số điện thoại " + phoneNumber + " đã được xóa.");
                } else {
                    System.out.println("Hủy thao tác xóa. Quay lại Menu.");
                }
                return;
            } else {
                System.out.println("Không tìm thấy danh bạ với số điện thoại này. Vui lòng nhập lại.");
            }
        } while (true);
    }


    private void showEditDirectory() {
        System.out.println("====CẬP NHẬT DANH BẠ====");

        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại  cần sửa :");
            phoneNumber = scString.nextLine();
            if (phoneNumber.isEmpty() || !ExceptionHandler.isVaildPhoneNumber(phoneNumber)){
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            }
        }while (phoneNumber.isEmpty() || !ExceptionHandler.isVaildPhoneNumber(phoneNumber));

        String group;
        do {
            System.out.print("Nhập nhóm của danh bạ : ");
            group = scString.nextLine();
            if (group.isEmpty()) {
                System.out.println("Nhóm không được để trống. Vui lòng nhập lại.");
            }
        } while (group.isEmpty());

        String fullName;
        do {
            System.out.print("Nhập họ tên : ");
            fullName = scString.nextLine();
            if (fullName.isEmpty()) {
                System.out.println("Họ tên không được để trống. Vui lòng nhập lại.");
            }
        } while (fullName.isEmpty());

        String gender;
        do {
            System.out.print("Nhập giới tính : ");
            gender = scString.nextLine();
            if (gender.isEmpty()) {
                System.out.println("Giới tính không được để trống. Vui lòng nhập lại.");
            }
        } while (gender.isEmpty());

        String address;
        do {
            System.out.print("Nhập địa chỉ : ");
            address = scString.nextLine();
            if (address.isEmpty()) {
                System.out.println("Địa chỉ không được để trống. Vui lòng nhập lại.");
            }
        } while (address.isEmpty());

        LocalDate birthDay = null;
        while (birthDay == null) {
            System.out.print("Nhập ngày sinh (YYYY-MM-DD): ");
            String birthDayInput = scString.nextLine();
            try {
                birthDay = LocalDate.parse(birthDayInput);
            } catch (DateTimeParseException e) {
                System.out.println("Ngày sinh không hợp lệ. Vui lòng nhập lại theo định dạng YYYY-MM-DD.");
            }
        }

        String email;
        do {
            System.out.print("Nhập email : ");
            email = scString.nextLine();
            if (email.isEmpty() || !ExceptionHandler.isVaildEmail(email)) {
                System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
            }
        } while (email.isEmpty() || !ExceptionHandler.isVaildEmail(email));

        Directory newDirectory = new Directory(phoneNumber, group, fullName, gender, address, birthDay, email);
        directoryManager.update(phoneNumber, newDirectory);
    }

    private void showAddDirectory() {
        System.out.println("====THÊM DANH BẠ====");

        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại  :");
            phoneNumber = scString.nextLine();
            if (phoneNumber.isEmpty() || !ExceptionHandler.isVaildPhoneNumber(phoneNumber)){
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            }
        }while (phoneNumber.isEmpty() || !ExceptionHandler.isVaildPhoneNumber(phoneNumber));

        String group;
        do {
            System.out.print("Nhập nhóm của danh bạ : ");
            group = scString.nextLine();
            if (group.isEmpty()) {
                System.out.println("Nhóm không được để trống. Vui lòng nhập lại.");
            }
        } while (group.isEmpty());

        String fullName;
        do {
            System.out.print("Nhập họ tên : ");
            fullName = scString.nextLine();
            if (fullName.isEmpty()) {
                System.out.println("Họ tên không được để trống. Vui lòng nhập lại.");
            }
        } while (fullName.isEmpty());

        String gender;
        do {
            System.out.print("Nhập giới tính (bắt buộc): ");
            gender = scString.nextLine();
            if (gender.isEmpty()) {
                System.out.println("Giới tính không được để trống. Vui lòng nhập lại.");
            }
        } while (gender.isEmpty());

        String address;
        do {
            System.out.print("Nhập địa chỉ: ");
            address = scString.nextLine();
            if (address.isEmpty()) {
                System.out.println("Địa chỉ không được để trống. Vui lòng nhập lại.");
            }
        } while (address.isEmpty());

        LocalDate birthDay = null;
        while (birthDay == null) {
            System.out.print("Nhập ngày sinh (YYYY-MM-DD): ");
            String birthDayInput = scString.nextLine();
            try {
                birthDay = LocalDate.parse(birthDayInput);
            } catch (DateTimeParseException e) {
                System.out.println("Ngày sinh không hợp lệ. Vui lòng nhập lại theo định dạng YYYY-MM-DD.");
            }
        }

        String email;
        do {
            System.out.print("Nhập email : ");
            email = scString.nextLine();
            if (email.isEmpty() || !ExceptionHandler.isVaildEmail(email)) {
                System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
            }
        } while (email.isEmpty() || !ExceptionHandler.isVaildEmail(email));

        Directory directory = new Directory(phoneNumber, group, fullName, gender, address, birthDay, email);
        directoryManager.add(directory);
        System.out.println("Danh bạ mới đã được thêm thành công.");
    }


    private void showDisplay() {
        System.out.println("====DANH SÁCH DANH BẠ====");
        List<Directory> directories = directoryManager.getAll();
        if (directories.isEmpty()) {
            System.out.println("Danh sách danh bạ trống.");
        } else {
            int total = directories.size();
            int count =0;
            for (Directory directory : directories){
                System.out.println("Số điện thoại: " + directory.getPhoneNumber());
                System.out.println("Nhóm: " + directory.getGroup());
                System.out.println("Họ tên: " + directory.getFullName());
                System.out.println("Giới tính: " + directory.getGender());
                System.out.println("Địa chỉ: " + directory.getAddress());
                count++;
                if (count % 5 == 0 && count < total){
                    System.out.println("Nhấn enter để tiếp tục...");
                    scString.nextLine();
                }
            }
        }
    }
}
