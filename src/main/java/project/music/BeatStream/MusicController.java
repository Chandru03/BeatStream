package project.music.BeatStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.music.BeatStream.Music;
import project.music.BeatStream.MusicDTO;
import project.music.BeatStream.MusicService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/music")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping
    public ResponseEntity<List<Music>> getAllMusic() {
        return new ResponseEntity<>(musicService.allMusic(), HttpStatus.OK);
    }

    @GetMapping("/{title}")
    public ResponseEntity<List<Music>> getMusicByTitle(@PathVariable String title) {
        List<Music> musicByTitle = musicService.musicByPartialTitle(title);
        if (musicByTitle.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(musicByTitle);
        }
    }

    @GetMapping("/artist/{artist}")
    public ResponseEntity<List<Music>> getMusicByArtist(@PathVariable String artist) {
        List<Music> musicByArtist = musicService.musicByPartialArtist(artist);
        if (musicByArtist.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(musicByArtist);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<String> createMusic(@RequestBody MusicDTO musicDTO) {
        Music newMusic = new Music(
                null,
                musicDTO.getTitle(),
                musicDTO.getArtist(),
                musicDTO.getYear(),
                musicDTO.getThumbnail(),
                musicDTO.getLink()
        );

        musicService.saveMusic(newMusic);

        return new ResponseEntity<>("Music created successfully", HttpStatus.CREATED);
    }
}
