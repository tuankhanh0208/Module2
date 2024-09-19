package ConvertStack;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class EmployeeDemerger {
    public static void main(String[] args) throws IOException {
        DemergingQueue [] demergingQueues = {
                new DemergingQueue("Khanh" , "Female" , "2003-02-08"),
                new DemergingQueue("Thao" , "Male" , "2003-02-08"),
                new DemergingQueue("Trang" , "Female" , "2003-02-08"),
                new DemergingQueue("Be" , "Male" , "2003-02-08"),
                new DemergingQueue("Vo Yeu" , "Female" , "2003-02-08"),
        };
        Queue<DemergingQueue> femaleQueue = new LinkedList<>();
        Queue<DemergingQueue> maleQueue = new LinkedList<>();

        for (DemergingQueue demergingQueue : demergingQueues){
            if(demergingQueue.gender.equalsIgnoreCase("Female")){
                femaleQueue.add(demergingQueue);
            } else if (demergingQueue.gender.equalsIgnoreCase("Male")) {
                maleQueue.add(demergingQueue);
            }
        }
        try  (PrintWriter outputFile = new PrintWriter(new FileWriter("abc.txt"))){
            while (!femaleQueue.isEmpty()){
                DemergingQueue queue = femaleQueue.poll();
                outputFile.println(queue);
            }
            while (!maleQueue.isEmpty()){
                DemergingQueue queue = maleQueue.poll();
                outputFile.println(queue);
            }
            System.out.println("Du lieu da duoc nhap");
        }catch (IOException e){
            System.out.println("Loi khi ghi file: " + e.getMessage());
        }
    }
}
