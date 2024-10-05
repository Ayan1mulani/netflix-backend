package Auth.auth.Payload.Trend;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrendViewaDTO {
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
