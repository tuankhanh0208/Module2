package savedata;

import model.Directory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class ReadAndWrite {
    private File file = new File("C:\\CodeGym\\Module2\\APJ-EXAM_C06_TranMaiTuanKhanh\\Data\\directory.csv");
    public void writetoFileDirectory(List<Directory> directories) {
        try (FileWriter fw = new FileWriter(this.file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            for (Directory directory : directories) {
                bw.write(directory.getPhoneNumber() + "," + directory.getGroup() + "," + directory.getFullName() + ","
                        + directory.getGender() + "," + directory.getAddress() + "," + directory.getBirthDay() + ","
                        + directory.getEmail());
                bw.newLine();
            }

            System.out.println("Ghi danh sách danh bạ thành công");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public List<Directory> readDirectoryFromFile() {
        List<Directory> directoryList = new ArrayList<>();

        try (FileReader fr = new FileReader(this.file);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] directoryDetails = line.split(",");
                String phoneNumber = directoryDetails[0];
                String group = directoryDetails[1];
                String fullName = directoryDetails[2];
                String gender = directoryDetails[3];
                String address = directoryDetails[4];
                LocalDate birthDay  = LocalDate.parse(directoryDetails[5]);
                String email = directoryDetails[6];
                Directory directory = new Directory(phoneNumber,group,fullName,gender,address,birthDay,email);
                directoryList.add(directory);
            }
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }

        return directoryList;
    }
}
