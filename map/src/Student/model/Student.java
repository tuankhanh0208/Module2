package Student.model;

public class Student {
    private int id;
    private String name;
    private String gender;
    private double scoreMath;
    private double scoreLiterature;
    private  double scoreEnglish;
    private static int indexId=1;


    public Student(int id, String name, String gender, double scoreMath, double scoreLiterature, double scoreEnglish) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.scoreMath = scoreMath;
        this.scoreLiterature = scoreLiterature;
        this.scoreEnglish = scoreEnglish;
    }

    public Student(String name, String gender, double scoreMath, double scoreLiterature, double scoreEnglish) {
        this.id=indexId;
        indexId++;
        this.name = name;
        this.gender = gender;
        this.scoreMath = scoreMath;
        this.scoreLiterature = scoreLiterature;
        this.scoreEnglish = scoreEnglish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScoreLiterature() {
        return scoreLiterature;
    }

    public void setScoreLiterature(double scoreLiterature) {
        this.scoreLiterature = scoreLiterature;
    }

    public double getScoreEnglish() {
        return scoreEnglish;
    }

    public void setScoreEnglish(double scoreEnglish) {
        this.scoreEnglish = scoreEnglish;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public  double avgScore(){
        return (getScoreMath()+getScoreEnglish()+getScoreLiterature())/3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", avenger='" + avgScore() + '\''+
                '}';
    }
}
