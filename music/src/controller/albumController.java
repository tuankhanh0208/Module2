package controller;

import model.Album;
import service.IAlbumService;
import service.albumService;

public class albumController {
    private IAlbumService albumService = new albumService();
    public void addAlbums( Album albums) {
         this.albumService.addAlbums(albums);
    }

}
