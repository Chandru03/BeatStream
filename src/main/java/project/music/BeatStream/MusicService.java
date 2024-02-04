package project.music.BeatStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    public List<Music> allMusic() {
        return musicRepository.findAll();
    }

    public List<Music> musicByPartialTitle(String title) {
        return musicRepository.findByTitleContainingIgnoreCase(title);
    }

    public List<Music> musicByPartialArtist(String artist) {
        return musicRepository.findByArtistContainingIgnoreCase(artist);
    }

    public void saveMusic(Music music) {
        musicRepository.save(music);
    }

    // Other methods in your MusicService class...

}
