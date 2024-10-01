package mang;

public class min_mang {
    public static void main(String[] args) {
        int [] arr = {4,12,3,1,2,45,3,5,6};
        int index = minValue(arr);
        System.out.println("Phan tu be nhat trong mang la:" + arr[index]);
    }
    public static int minValue(int [] array){
        int min = 0;
        for(int i=1;i<array.length;i++){
            if(array[i] <array[min] ){
                min = i;
            }
        }return min;
    }
}
