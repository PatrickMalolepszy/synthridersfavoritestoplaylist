package synthriders.favoritestoplaylist.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutablePlaylist.class)
@JsonDeserialize(as = ImmutablePlaylist.class)
@Value.Style(jdkOnly = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Playlist {

    @JsonProperty("dataString")
    abstract List<PlaylistSong> playlistObjects();

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

    @JsonProperty("namePlaylist")
    abstract String namePlaylist();

    @JsonProperty("description")
    abstract String description();

    @JsonProperty("gradientTop")
    abstract String gradientTop();

    @JsonProperty("gradientDown")
    abstract String gradientDown();

    @JsonProperty("colorTitle")
    abstract String colorTitle();

    @JsonProperty("colorTexture")
    abstract String colorTexture();

    @JsonProperty("creationDate")
    abstract String creationDate();
}
