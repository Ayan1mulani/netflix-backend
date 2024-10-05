package Auth.auth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Auth.auth.Model.Top;


@Repository
public interface TopRepository extends JpaRepository<Top, Long> {
    
}
