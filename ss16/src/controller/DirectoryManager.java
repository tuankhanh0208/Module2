package controller;

import model.Directory;
import savedata.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;


public class DirectoryManager implements IDirectory<Directory> {
    private List<Directory> directories;
    ReadAndWrite readAndWrite = new ReadAndWrite();
   public DirectoryManager (){
       this.directories = this.readAndWrite.readDirectoryFromFile();
   }

    @Override
    public void add(Directory directory) {
        this.directories.add(directory);
        readAndWrite.writetoFileDirectory(this.directories);
    }

    @Override
    public void update(String phoneNumber, Directory directory) {
        for (int i = 0; i < directories.size(); i++) {
            if (directories.get(i).getPhoneNumber().equals(phoneNumber)) {
                directories.set(i, directory);
                saveDirectoryToFile();
                System.out.println("Cập nhật danh bạ thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy số điện thoại trong danh bạ.");
    }

    @Override
    public void delete(String phoneNumber) {
        for (int i = 0; i < directories.size(); i++) {
            if (directories.get(i).getPhoneNumber().equals(phoneNumber)) {
                directories.remove(i);
                saveDirectoryToFile();
                System.out.println("Xóa danh bạ thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy số điện thoại để xóa.");
    }
    public List<Directory> searchDirectoryByPhone(String phoneNumber) {
        List<Directory> directoryLists = new ArrayList<>();
        for (Directory directory : directories) {
            if (directory.getPhoneNumber().contains(phoneNumber)) {
                directoryLists.add(directory);
            }
        }
        return directoryLists;
    }
    public List<Directory> searchDirectoryByFullName(String fullName) {
        List<Directory> directoryList = new ArrayList<>();
        for (Directory directory : directories) {
            if (directory.getFullName().toLowerCase().contains(fullName.toLowerCase())) {
                directoryList.add(directory);
            }
        }
        return directoryList;
    }

    public void reloadDirectory() {
        this.directories = readAndWrite.readDirectoryFromFile();
    }
    public void saveDirectoryToFile () {
       readAndWrite.writetoFileDirectory(directories);
   }
    @Override
    public List<Directory> getAll() {
        return directories;
    }
}
