package synthriders.favoritestoplaylist.init;


import synthriders.favoritestoplaylist.control.Converter;
import synthriders.favoritestoplaylist.model.ImmutablePlaylist;
import synthriders.favoritestoplaylist.model.ImmutablePlaylistSong;
import synthriders.favoritestoplaylist.model.Playlist;

import java.security.InvalidParameterException;

public class Main {

    public static void main(String[] args) {
        try {
            if (args.length < 3)
                throw new InvalidParameterException("Missing input parameters, exiting");

            Converter conv = new Converter(args[1], args[2]);
            String result = conv.convert();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
