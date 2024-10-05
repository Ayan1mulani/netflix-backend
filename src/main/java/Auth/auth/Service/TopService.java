package Auth.auth.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Auth.auth.Model.Top;
import Auth.auth.Repository.TopRepository;



@Service
public class TopService {

    @Autowired
    private TopRepository topRepository;

    public Top save(Top top){
        return topRepository.save(top);
    }


      public List<Top> findall(){
        return topRepository.findAll();

    }
}
