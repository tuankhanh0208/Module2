package VongLap;

import java.util.Scanner;

public class hien_thi_20_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double count = 0;
        int N = 2;
        while (count < number) {
            if (isPrime(N)) {
                System.out.println(N + " ");
                count++;
            }
            N++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
