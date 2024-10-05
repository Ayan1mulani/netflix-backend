package Auth.auth.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class MostWatched {
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhotourl1() {
        return photourl1;
    }
    public void setPhotourl1(String photourl1) {
        this.photourl1 = photourl1;
    }
    public String getPhotourl2() {
        return photourl2;
    }
    public void setPhotourl2(String photourl2) {
        this.photourl2 = photourl2;
    }
    public String getVideourl() {
        return videourl;
    }
    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }
    public int getRelease_year() {
        return release_year;
    }
    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }
    public String getRated() {
        return rated;
    }
    public void setRated(String rated) {
        this.rated = rated;
    }
    public String getMovieType() {
        return movieType;
    }
    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String photourl1;
    private String photourl2;
    private String videourl;
    private int  release_year;
    private String rated;
    private String movieType; 
    private String starring;
    public String getStarring() {
        return starring;
    }
    public void setStarring(String starring) {
        this.starring = starring;
    }
    private String description;
}
