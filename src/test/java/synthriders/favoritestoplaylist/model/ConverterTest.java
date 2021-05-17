package synthriders.favoritestoplaylist.model;

import org.junit.jupiter.api.Test;
import synthriders.favoritestoplaylist.control.Converter;

import java.io.FileWriter;
import java.io.IOException;

public class ConverterTest {

    @Test
    void convert() throws IOException {

        Converter conv = new Converter("favorites.bin", "Moro's Favorites");
        String result = conv.convert();

        FileWriter file = new FileWriter("Moro's Favorites.playlist");
        file.write(result);
        file.close();

        System.out.println(result);
    }
}
