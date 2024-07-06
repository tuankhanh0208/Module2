package VongLap;

import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        for (int N = 2;N <=100;N++){
                if(isPrime(N)){
                    System.out.println(N + "");
                }
        }
    }
    public  static boolean isPrime(int num ){
        if(num <1 ){
            return false;
        }
        for(int i =2 ;i< Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }return true;
    }
}
