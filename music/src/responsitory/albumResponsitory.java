package responsitory;

import data.readAndWrite;
import model.Album;

import java.util.List;
import java.util.ArrayList;

public class albumResponsitory implements IAlbumReponsitory<Album>{
    private List<Album> list ;
    readAndWrite readAndWrites = new readAndWrite();
    public albumResponsitory(){
        this.list = this.readAndWrites.readAlbums();
    }
    @Override
    public void addAlbums(Album albums) {
        this.list.add(albums);

    }
}
