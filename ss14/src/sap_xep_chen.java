import javax.crypto.spec.PSource;
import java.util.Scanner;

public class sap_xep_chen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Nhập 5 phần tử cho mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        insertionSort(array);

        System.out.println("Mảng sau khi sắp xếp:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
