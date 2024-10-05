package Auth.auth.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Auth.auth.Model.Show;
import Auth.auth.Payload.Show.ShowAddDTO;
import Auth.auth.Payload.Show.ShowViewDTO;
import Auth.auth.Service.ShowService;
import Auth.auth.util.constants.AccountSuccess;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/Show")
@SecurityRequirement(name = "NETFLIX-CLONE")
@Tag(name="Show Controller", description="Controller for top shows/movies")
@Slf4j
public class ShowController {

    @Autowired
    private ShowService showService;

    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public ResponseEntity<String> addTrend(@Valid @RequestBody ShowAddDTO showAddDTO) {
        Show newShow = new Show();
        newShow.setBigPhoto(showAddDTO.getBigPhoto());
        newShow.setShortPhoto(showAddDTO.getShortPhoto());
        newShow.setUrl(showAddDTO.getUrl());
        
        log.info("Trend added: {}");
        return ResponseEntity.ok(AccountSuccess.TREND_ADDED.toString());
    }

    @GetMapping(value="/view", produces = "application/json")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<ShowViewDTO>> viewShows() {
        log.info("Fetching all Shows");
        List<ShowViewDTO> showServices = new ArrayList<>();
        for (Show show : showService.findall()) { // Corrected service name
            showServices.add(new ShowViewDTO(show.getId(), show.getBigPhoto(), show.getShortPhoto(), show.getUrl()));
        }
        log.info("Show fetched: {}", showServices);
        return ResponseEntity.ok(showServices);
    }
}