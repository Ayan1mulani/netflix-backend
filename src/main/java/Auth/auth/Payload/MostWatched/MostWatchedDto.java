package Auth.auth.Payload.MostWatched;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MostWatchedDto {
    private Long id;
    private String name;
    private String photourl1;
    private String photourl2;
    private String videourl;
    private int  release_year;
    private String rated;
    private String movieType; 
    private String starring;
    private String description;   
}
