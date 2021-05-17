package synthriders.favoritestoplaylist.init;


import synthriders.favoritestoplaylist.model.ImmutablePlaylist;
import synthriders.favoritestoplaylist.model.ImmutablePlaylistSong;
import synthriders.favoritestoplaylist.model.Playlist;

public class Main {

    public static void main(String[] args) {

        Playlist playlist = ImmutablePlaylist.builder()
                .addPlaylistSongs(ImmutablePlaylistSong.builder().build())
                .build();


    }
}
