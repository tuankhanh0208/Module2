package VongLap;

import java.util.Arrays; // Import để in mảng

public class Main {
    public static void main(String[] args) {
        System.out.println(getArray());
    }

    public static int[] getArray() {
        int[] arr = new int[255];

        // Khởi tạo giá trị cho mảng, ví dụ: gán giá trị cho từng phần tử
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;  // Gán giá trị i cho từng phần tử
        }

        // In các phần tử của mảng bằng cách trả về
        return arr;
    }
}
