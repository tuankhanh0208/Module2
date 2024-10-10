package data;

import model.Album;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class readAndWrite {
    private File file = new File("src/albums.csv");

    public void writeAlbums(List<Album> albumList) {
        try (FileWriter fw = new FileWriter(this.file, true)) {
            BufferedWriter br = new BufferedWriter(fw);

            for (Album album : albumList) {
                br.write(album.getAlbumID() + "," + album.getNameAlbum() + "," + album.getDateCreated());
                br.newLine();
            }
            System.out.println("Thêm album thành công");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Album> readAlbums() {
        List<Album> albumList = new ArrayList<>();

        try (FileReader fr = new FileReader(this.file);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] strings = line.split(",");
                String albumId = strings[0];
                String nameAlbum = strings[1];
                LocalDate dateCreated = LocalDate.parse(strings[2]);
                Album albums = new Album(albumId, nameAlbum, dateCreated);
                albumList.add(albums);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return albumList;
    }
}
