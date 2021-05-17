package synthriders.favoritestoplaylist.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FavoritesTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    void readsFavoritesFile() throws IOException {
        String file = Files.readString(Path.of("favorites.bin"));
        Favorites favorites = mapper.readValue(file, Favorites.class);
        System.out.println(favorites);
    }

}
