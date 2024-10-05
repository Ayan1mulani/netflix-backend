package Auth.auth.Payload.Show;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class ShowAddDTO {

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getBigPhoto() {
        return bigPhoto;
    }
    public void setBigPhoto(String bigPhoto) {
        this.bigPhoto = bigPhoto;
    }
    public String getShortPhoto() {
        return shortPhoto;
    }
    public void setShortPhoto(String shortPhoto) {
        this.shortPhoto = shortPhoto;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long id;
    private String bigPhoto;
    private String shortPhoto;
    private String url;
    
}
