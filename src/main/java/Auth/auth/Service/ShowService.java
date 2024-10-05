package Auth.auth.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Auth.auth.Model.Show;
import Auth.auth.Repository.ShowRepisitory;




@Service
public class ShowService {

    @Autowired
    private ShowRepisitory showRepisitory;

    public Show save(Show show){
        return showRepisitory.save(show);
    }


      public List<Show> findall(){
        return showRepisitory.findAll();

    }
}

