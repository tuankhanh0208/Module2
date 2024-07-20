package XML.Student;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        double[] points1 = {1.2, 2.3, 3.0};
        double[] points2 = {3.4, 2.1, 4.0};
        double[] points3 = {2.8, 3.5, 4.2};

        Student student1 = new Student("Khanh","Nam", points1);
        Student student2 = new Student("Thao","Nu", points2);
        Student student3 = new Student("Dao Thao","Nam", points3);

        manager.addStudents(student1);
        manager.addStudents(student2);
        manager.addStudents(student3);
        for (int i=0;i<manager.getSize();i++){
            System.out.println(manager.getListStudents()[i]);
        }

        double [] point4 = {1,4,6};
        Student student4 = new Student("QAX","Nam" ,point4);
        manager.edit(2,student4);
        System.out.println("\n");
        for (int i=0;i<manager.getSize();i++){
            System.out.println(manager.getListStudents()[i]);
        }

        System.out.println(manager.getAvg());
        System.out.println(manager.getMaxAvg());
//        System.out.println(manager.findStudentsById(1));
//        manager.removeStudents(1);
//        for (int i=0;i<manager.getSize();i++){
//            System.out.println(manager.getListStudents()[i]);
//        }
    }
    }