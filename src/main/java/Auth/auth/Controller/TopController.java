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

import Auth.auth.Model.Top;
import Auth.auth.Payload.Top.TopAdddto;
import Auth.auth.Payload.Top.TopViewDTO;
import Auth.auth.Service.TopService;
import Auth.auth.util.constants.AccountSuccess;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/top-view")
@SecurityRequirement(name = "NETFLIX-CLONE")
@Tag(name="Top view Controller", description="Controller for top shows/movies")
@Slf4j
public class TopController {

    @Autowired
    private TopService topService;

    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public ResponseEntity<String> addTrend(@Valid @RequestBody TopAdddto topAdddto) {
        Top topShows= new Top();
        topShows.setName(topAdddto.getName());
        topShows.setPhotourl1(topAdddto.getPhotourl1());
        topShows.setPhotourl2(topAdddto.getPhotourl2());
        topShows.setMovieType(topAdddto.getMovieType());
        topShows.setRated(topAdddto.getRated());
        topShows.setDescription(topAdddto.getDescription());
        topService.save(topShows);
        log.info("Trend added: {}", topAdddto.getName());
        return ResponseEntity.ok(AccountSuccess.TREND_ADDED.toString());
    }

    @GetMapping(value="/view", produces = "application/json")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<TopViewDTO>> viewALLMostWatched() {
        log.info("Fetching all trends...");
        List<TopViewDTO> TopShows = new ArrayList<>();
        for (Top top : topService.findall()) { // Corrected service name
            TopShows.add(new TopViewDTO(
                top.getId(),
                top.getName(),
                top.getPhotourl1(),
                top.getPhotourl2(),
                top.getVideourl(),
                top.getRelease_year(),
                top.getRated(),
                top.getMovieType(),
                top.getStarring(),
                top.getDescription()
            ));
        }
        log.info("Trends fetched: {}", TopShows);
        return ResponseEntity.ok(TopShows);
    }
}