package Project.Model;

import java.time.LocalDate;

public class New extends Document{
    private LocalDate releaseDate;

    public New(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public New(int id, String name, String pubishName, int releaseNumber, LocalDate releaseDate) {
        super(id, name, pubishName, releaseNumber);
        this.releaseDate = releaseDate;
    }

    public New(String name, String pubishName, int releaseNumber, LocalDate releaseDate) {
        super(name, pubishName, releaseNumber);
        this.releaseDate = releaseDate;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "New{" +
                "releaseDate=" + releaseDate +
                '}';
    }
}
