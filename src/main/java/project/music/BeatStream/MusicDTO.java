package project.music.BeatStream;

public class MusicDTO {

    private String title;
    private String artist;
    private String year;
    private String thumbnail;
    private String link;

    // Constructors, getters, setters, etc.

    public MusicDTO() {
        // Default constructor
    }

    public MusicDTO(String title, String artist, String year, String thumbnail, String link) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.thumbnail = thumbnail;
        this.link = link;
    }

    // Getters and setters...

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    // Additional methods if needed...
}
