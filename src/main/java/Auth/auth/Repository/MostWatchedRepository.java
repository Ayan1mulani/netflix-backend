package Auth.auth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Auth.auth.Model.MostWatched;

@Repository
public interface MostWatchedRepository extends JpaRepository<MostWatched, Long> {
    
}
