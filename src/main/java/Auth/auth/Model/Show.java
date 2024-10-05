package Auth.auth.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Show {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long id;
    private String bigPhoto;
    private String shortPhoto;
    private String url;
    public long getId() {
        return id;
    }
    public String getBigPhoto() {
        return bigPhoto;
    }
    public String getShortPhoto() {
        return shortPhoto;
    }
    public String getUrl() {
        return url;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setBigPhoto(String bigPhoto) {
        this.bigPhoto = bigPhoto;
    }
    public void setShortPhoto(String shortPhoto) {
        this.shortPhoto = shortPhoto;
    }
    public void setUrl(String url) {
        this.url = url;
    }
   
 
}
