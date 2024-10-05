package Auth.auth.Payload.Top;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class TopAdddto {
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
    private String description;   
}
