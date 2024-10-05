package Auth.auth.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Auth.auth.Model.Trend;
import Auth.auth.Repository.TrendRepository;



@Service
public class TrendService {

    @Autowired
    private TrendRepository trendRepository;

    public Trend save(Trend trend){
        return trendRepository.save(trend);
    }


      public List<Trend> findall(){
        return trendRepository.findAll();
      }

        public void deleteByID(long id) {
           trendRepository.deleteById(id);
        }
    
}

