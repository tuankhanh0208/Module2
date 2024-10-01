package OOP;

import java.util.Random;

public class stop_watch {
    private long startTime ;
    private  long endTime ;

    public stop_watch(){
        this.startTime =System.currentTimeMillis();
    }
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        
        return endTime;
    }
    public  void start (){
        this.startTime = System.currentTimeMillis();
    }
    public void end (){
        this.endTime = System.currentTimeMillis();
    }
    public  long getElapsedTime(){
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int [] arr = new int[100000];
        Random rd = new Random();
        for (int i =0;i<arr.length;i++){
            arr[i] = rd.nextInt(100000);
        }
        stop_watch sw = new stop_watch();
        sw.start();
        selectionSort(arr);
        sw.end();

        long elapstime = sw.getElapsedTime();
        System.out.println(elapstime);
    }
    public  static  void  selectionSort(int [] arr){
        for (int i =0;i<arr.length;i++){
            int minIndex =1;
            for (int j=i+1 ;j <arr.length;j++){
                if (arr[j] <arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] =arr[i];
            arr[i] = temp;
        }
    }
}
