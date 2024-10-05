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

import Auth.auth.Model.MostWatched;
import Auth.auth.Payload.MostWatched.MostViewDto;
import Auth.auth.Payload.MostWatched.MostWatchedDto;
import Auth.auth.Service.MostWatchedServce;
import Auth.auth.util.constants.AccountSuccess;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/most-view")
@SecurityRequirement(name = "NETFLIX-CLONE")
@Tag(name="Most view Controller", description="Controller for Most-view shows/movies")
@Slf4j
public class MostController {

    @Autowired
    private MostWatchedServce mostWatchedServce;

    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public ResponseEntity<String> addTrend(@Valid @RequestBody MostWatchedDto mostWatchedDto) {
        MostWatched mostWatched = new MostWatched();
        mostWatched.setName(mostWatchedDto.getName());
        mostWatched.setPhotourl1(mostWatchedDto.getPhotourl1());
        mostWatched.setPhotourl2(mostWatchedDto.getPhotourl2());
        mostWatched.setVideourl(mostWatchedDto.getVideourl());
        mostWatched.setMovieType(mostWatchedDto.getMovieType());
        mostWatched.setRated(mostWatchedDto.getRated());
        mostWatched.setStarring(mostWatched.getStarring());
        mostWatched.setDescription(mostWatchedDto.getDescription());
        mostWatchedServce.save(mostWatched);
        log.info("Trend added: {}", mostWatchedDto.getName());
        return ResponseEntity.ok(AccountSuccess.TREND_ADDED.toString());
    }

    @GetMapping(value="/view", produces = "application/json")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<MostViewDto>> viewALLMostWatched() {
        log.info("Fetching all trends...");
        List<MostViewDto> watchedShows = new ArrayList<>();
        for (MostWatched watched : mostWatchedServce.findall()) { // Corrected service name
            watchedShows.add(new MostViewDto(watched.getId(), watched.getName(), watched.getPhotourl1(), watched.getPhotourl2(), watched.getVideourl(),
             watched.getRelease_year(), watched.getRated(), watched.getMovieType(),
              watched.getStarring(), watched.getDescription()));
        }
        log.info("Trends fetched: {}", watchedShows);
        return ResponseEntity.ok(watchedShows);
    }
}