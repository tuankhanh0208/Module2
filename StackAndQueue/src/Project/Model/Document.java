package Project.Model;

public class Document {
    private int id;
    private String name;
    private String pubishName;
    private  int releaseNumber;
    public static int idIndex =1;
    public Document(){}

    public Document(int id, String name, String pubishName, int releaseNumber) {
        this.id = id;
        this.name = name;
        this.pubishName = pubishName;
        this.releaseNumber = releaseNumber;
    }
    public Document(String name, String pubishName, int releaseNumber) {
        this.id = idIndex;
        this.name = name;
        this.pubishName = pubishName;
        this.releaseNumber = releaseNumber;
        idIndex++;
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

    public String getPubishName() {
        return pubishName;
    }

    public void setPubishName(String pubishName) {
        this.pubishName = pubishName;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pubishName='" + pubishName + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
