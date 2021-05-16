package synthriders.favoritestoplaylist.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePlaylist.class)
@JsonDeserialize(as = ImmutablePlaylist.class)
public abstract class Playlist {

    @JsonProperty("dataString")
    abstract List<ToBeNamed> playlistObjects();

    @JsonProperty("SelectedIconIndex")
    @Value.Default
    long selectIconIndex() {
        return 0;
    }

    @JsonProperty("SelectedTexture")
    @Value.Default
    long selectedTexture() {
        return 0;
    }


    /**
     *   "SelectedIconIndex": 0,
     *   "SelectedTexture": 0,
     *   "namePlaylist": "warm up",
     *   "description": "new playlist",
     *   "gradientTop": "#24491F",
     *   "gradientDown": "#FB5B43",
     *   "colorTitle": "#FFFFFF",
     *   "colorTexture": "#405436",
     *   "creationDate": "1613788422"
     */

}
