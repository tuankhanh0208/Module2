package model;

import java.time.LocalDate;

public class album {
    private String albumID ;
    private String nameAlbum;
    private LocalDate dateCreated;
    public album (){}

    public album(String albumID, String nameAlbum, LocalDate dateCreated) {
        this.albumID = albumID;
        this.nameAlbum = nameAlbum;
        this.dateCreated = dateCreated;
    }

    public String getAlbumID() {
        return albumID;
    }

    public void setAlbumID(String albumID) {
        this.albumID = albumID;
    }

    public String getNameAlbum() {
        return nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "album{" +
                "albumID='" + albumID + '\'' +
                ", nameAlbum='" + nameAlbum + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
