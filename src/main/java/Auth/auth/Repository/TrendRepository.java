package Auth.auth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Auth.auth.Model.Trend;

@Repository
public interface TrendRepository extends JpaRepository<Trend, Long> {

    public Trend findByid(Trend trend);
    
}
