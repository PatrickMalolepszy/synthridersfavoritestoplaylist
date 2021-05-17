package synthriders.favoritestoplaylist.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class PlaylistTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    void readsPlaylistFile() throws IOException {
        String file = Files.readString(Path.of("src/test/java/synthriders/favoritestoplaylist/model/resource/000002__warmup.playlist"));
        Playlist playlist = mapper.readValue(file, Playlist.class);
        System.out.println(playlist);
    }

}