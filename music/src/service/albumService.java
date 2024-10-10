package service;

import model.Album;
import responsitory.IAlbumReponsitory;
import responsitory.albumResponsitory;

public class albumService implements IAlbumService <Album>{
    private IAlbumReponsitory albumReponsitory = new albumResponsitory();

    @Override
    public void addAlbums(Album albums) {
         this.albumReponsitory.addAlbums(albums);
    }
}
