package synthriders.favoritestoplaylist.control;

import com.fasterxml.jackson.databind.ObjectMapper;
import synthriders.favoritestoplaylist.model.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Converter {
    private final ObjectMapper mapper = new ObjectMapper();
    private final String favoritesFilePath, playlistName;

    public Converter(String favoritesFilePath, String playlistName) {
        this.favoritesFilePath = favoritesFilePath;
        this.playlistName = playlistName;
    }

//    public String convert() throws IOException {
//        JSONObject o = FileHost;
//    }

    public String convert() throws IOException {
        String file = Files.readString(Path.of(this.favoritesFilePath));
        Favorites favorites = mapper.readValue(file, Favorites.class);
        List<PlaylistSong> songs = new ArrayList<>();

        for (String fav : favorites.playlistObjects()) {
            // 0. Song name
            // 1. Song artist
            // 2. Hash
            String[] spl = fav.split("-");

            PlaylistSong s = ImmutablePlaylistSong.builder()
                    .name(spl[0])
                    .author(spl[1])
                    .hash(spl[2])
                    .addedTime(System.currentTimeMillis() / 1000)
                    .build();
            songs.add(s);
        }

        Playlist playlist = ImmutablePlaylist.builder()
                .selectIconIndex(1)
                .selectedTexture(1)
                .namePlaylist(playlistName)
                .gradientTop("#F91C84")
                .gradientDown("#7430CF")
                .colorTitle("#FFFFFF")
                .colorTexture("#464956")
                .creationDate(String.valueOf(System.currentTimeMillis() / 1000))
                .playlistSongs(songs)
                .build();

        return mapper.writeValueAsString(playlist);
    }
}
