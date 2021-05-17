package synthriders.favoritestoplaylist.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePlaylistSong.class)
@JsonDeserialize(as = ImmutablePlaylistSong.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PlaylistSong {

    @JsonProperty("hash")
    abstract String hash();

    @JsonProperty("name")
    abstract String name();

    @JsonProperty("beatmapper")
    abstract String beatmapper();

    @JsonProperty("difficulty")
    abstract long difficulty();

    @JsonProperty("trackDuration")
    abstract long trackDuration();

    @JsonProperty("addedTime")
    abstract long addedTime();
}
