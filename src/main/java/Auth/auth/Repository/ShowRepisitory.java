package Auth.auth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Auth.auth.Model.Show;

@Repository
public interface ShowRepisitory extends  JpaRepository<Show, Long> {
    
}
