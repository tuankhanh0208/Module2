package Project.Model;

public class Manazine extends Document{
    private int lssueNumber;
    private int releaseMonth;
    public Manazine(){}

    public Manazine(int lssueNumber, int releaseMonth) {
        this.lssueNumber = lssueNumber;
        this.releaseMonth = releaseMonth;
    }

    public Manazine(int id, String name, String pubishName, int releaseNumber, int lssueNumber, int releaseMonth) {
        super(id, name, pubishName, releaseNumber);
        this.lssueNumber = lssueNumber;
        this.releaseMonth = releaseMonth;
    }

    public Manazine(String name, String pubishName, int releaseNumber, int lssueNumber, int releaseMonth) {
        super(name, pubishName, releaseNumber);
        this.lssueNumber = lssueNumber;
        this.releaseMonth = releaseMonth;
    }

    public int getLssueNumber() {
        return lssueNumber;
    }

    public void setLssueNumber(int lssueNumber) {
        this.lssueNumber = lssueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return "Manazine{" +
                "lssueNumber=" + lssueNumber +
                ", releaseMonth=" + releaseMonth +
                '}';
    }
}
