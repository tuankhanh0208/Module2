package BTVN;

import java.util.Scanner;

public class DieuKien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bài 1: Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a % b == 0){
            System.out.println("a chia het cho b");
        }else {
            System.out.println("a khong chia het cho b");
        }

//        Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
        int age = sc.nextInt();
        if (age > 10 ){
            System.out.println("Tuoi cua hoc sinh do la" + age);
        }else {
            System.out.println("Vui long nhap lai");
        }
//    Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 0
        int num =sc.nextInt();
        if(num >0){
            System.out.println("So ban vua nhap lon hon 0");
        }else {
            System.out.println("So ban vua nhap nho hon 0");
        }

//        Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("So lon nhat la " + num1);
        }else if ( num2 > num1 && num2 > num3){
            System.out.println("So lon nhat la" + num2);
        }else{
            System.out.println("So lon nhat la" +num3);
        }
//        Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ
        double diemKiemTra = sc.nextDouble();
        double diemGiuaKi = sc.nextDouble();
        double diemCuoiKi = sc.nextDouble();
        double tongDiem = diemKiemTra+diemGiuaKi+diemCuoiKi;
        if(tongDiem > 9 ){
            System.out.println("Đạt học lực giỏi");
        } else if (tongDiem > 6 && tongDiem < 8) {
            System.out.println("Đạt học lực khá");
        } else if (tongDiem > 4 && tongDiem <5){
            System.out.println("Đạt học lực trung bình");
        }else {
            System.out.println("Dat hoc luc yeu");
        }

//        Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng
        double doanhSo = sc.nextDouble();
        double hoaHong ;
        if(doanhSo > 100000 && doanhSo < 900000){
            hoaHong = doanhSo*0.25;
            System.out.println("Tien hoa hong la" + hoaHong);
        }else if( doanhSo < 1000000000 && doanhSo >2000000){
            hoaHong = doanhSo*0.5;
            System.out.println("Tien hoa hong la " + hoaHong);
        }else {
            hoaHong = doanhSo*0.75;
            System.out.println("Tien hoa hong la "+hoaHong);
        }

//        Bài 1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
        double  F = sc.nextDouble();
        double C = ((F-32)*5)/9;
        System.out.println("Sau khi chuyen doi do C bang = " +C);
//        Bài 2: Chuyển từ mét sang feet: ft =m * 3.2808
        double m = sc.nextDouble();
        double ft = m*3.2808;
        System.out.println("Sau khi chuyen m sang feet bang = " +ft);
//        Bài 3: Tính diện tích hình vuông khi biết cạnh a.
        double canhA = sc.nextDouble();
        double area = canhA*canhA;
        System.out.println("Dien tich hinh vuong la" + area);
//        Bài 4: Tính diện tích hình  chữ nhật khi biết 02 cạnh a, b.
        double canhB = sc.nextDouble();
        double canhC =sc.nextDouble();
        double areaHCN = canhC*canhB;
        System.out.println("Dien tich hinh chu nhat la " + areaHCN);
//        Bài 5: Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
        double tamgiacA = sc.nextDouble();
        double tamgiacB = sc.nextDouble();

        double areaTamGiac = Math.sqrt(tamgiacA*tamgiacA + tamgiacB*tamgiacB);
        System.out.println("Dien tich tam giac la" + areaTamGiac);
//      Bài 8:  Kiểm tra xem một số nhập vào có phải là tuổi của một người không. Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0.
        int agee = sc.nextInt();
        if(agee < 120 && agee >0 ){
            System.out.println("Tuoi cua ban la :" + agee);
        }else {
            System.out.println("Vui long nhap lai tuoi");
        }

//        Bài 9: Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác. Điều kiện để a,b,c là cạnh của một tam giác là:
//        a,b,c > 0
//        a + b > c
//        b + c > a
//        a + c > b
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        if(a1 > 0 && b1 > 0 && c1 > 0){
            if(a1 + b1 > c1 && b1 +c1 > a1 && a1 +c1 > b1){
                System.out.println("Do la mot tam giac");
            }else {
                System.out.println("Khong the tao thanh 1 tam giac");
            }
        }
        else {
            System.out.println("Cac canh phair lon hon 0");
        }

//        Bài 10: Viết chương trình tính giá điện.

        double kWh = sc.nextDouble();
        double totalCost = 0;

        if(kWh > 0){
            if (kWh <= 50){
                totalCost = kWh * 1678;
            } else if (kWh <= 100 ) {
                totalCost = 50 * 1678 + (kWh - 50) * 1734;
        } else if (kWh <= 200) {
            totalCost = 50 * 1678 + 50 * 1734 + (kWh - 100) * 2014;
        } else if (kWh <= 300) {
            totalCost = 50 * 1678 + 50 * 1734 + 100 * 2014 + (kWh - 200) * 2536;
        } else if (kWh <= 400) {
            totalCost = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (kWh - 300) * 2834;
        } else {
            totalCost = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (kWh - 400) * 2927;
        }
        System.out.println("Tong tien dien la: " + totalCost + " VND");
    } else {
        System.out.println("So dien phai lon hon 0.");
    }

}
    }


