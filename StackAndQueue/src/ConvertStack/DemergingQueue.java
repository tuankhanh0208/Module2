package ConvertStack;

public class DemergingQueue {
    String name;
    String gender;
    String birthday;

    public DemergingQueue(String name, String gender, String birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "DemergingQueue{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
