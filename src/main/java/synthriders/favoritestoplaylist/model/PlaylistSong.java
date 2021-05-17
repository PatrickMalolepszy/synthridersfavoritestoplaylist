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

    @JsonProperty("author")
    abstract String author();

    @JsonProperty("beatmapper")
    String beatmapper() {
        return "";
    }

    @JsonProperty("difficulty")
    long difficulty() {
        return 0;
    }

    @JsonProperty("trackDuration")
    double trackDuration()  {
        return 0.0;
    }

    @JsonProperty("addedTime")
    abstract long addedTime();
}

//        "hash": "6cbab45b7a91a0a1883b0a0d14fb5d3b540186aae80ba7c66d4c60b047460325",
//        "name": "Bruises",
//        "author": "Fox Stevenson",
//        "beatmapper": "Teebo",
//        "difficulty": 4,
//        "trackDuration": 223.0,
//        "addedTime": 1608229395