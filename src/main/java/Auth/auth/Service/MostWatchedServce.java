package Auth.auth.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Auth.auth.Model.MostWatched;
import Auth.auth.Repository.MostWatchedRepository;



@Service
public class MostWatchedServce {

    @Autowired
   private  MostWatchedRepository mostWatchedRepository;

    public MostWatched save(MostWatched mostWatched){
        return mostWatchedRepository.save(mostWatched);
    }


      public List<MostWatched> findall(){
        return mostWatchedRepository.findAll();

    }
}
