package project.music.BeatStream;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "music")     //mongodb collecion
@Data                   //manage getters setters
@AllArgsConstructor     //for creating constructors
public class Music {
    private ObjectId id; //assigned objectid
    private String title;
    private String artist;
    private String year;
    private String thumbnail;
    private String link;

}
