package OOP;

public class student {
    private String name;
    private int age;
    private int [] arr;
    public student(){
    }
    public student(String name , int age, int [] arr){
        this.name=name;
        this.age=age;
        this.arr = arr;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int[] getArr() {
        return arr;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public void display (){
        System.out.println(" Họ tên sinh viên là : " + this.name);
        System.out.println(" Tuoi của sinh viên là : " + this.age);
        System.out.println(" Điểm trung bình của sinh viên là: " + averger());
//        System.out.println("Sinh viên có điểm trung bình cao hơn là :");
    }
    public double averger (){
        int sum =0;
        for (int i =0;i<arr.length;i++){
            sum+=arr[i];
        }int averger =sum/arr.length;
        return averger;
    }

    public static void main(String[] args) {
        int [] arr1 = {2,4,6,8};
        student st1 = new student("Tuan Khanh" ,20,arr1);
        st1.display();
        System.out.println("\n");
        int [] arr2 = {1,3,5,7};
        student st2 = new student("Thu Thao" ,21,arr2);
        st2.display();
        System.out.println("\n");
        if(st1.averger() > st2.averger()){
            System.out.println("Sinh vien " + st1.getName() + " co diem cao hon");
        } else if (st1.averger() < st2.averger()) {
            System.out.println("Sinh vien " + st2.getName() +" co diem cao hon");
        }else {
            System.out.println("Hai sinh vien co diem bang nhau");
        }
    }

}
