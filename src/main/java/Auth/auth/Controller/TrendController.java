package Auth.auth.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Auth.auth.Model.Trend;
import Auth.auth.Payload.Trend.TrendAddDTO;
import Auth.auth.Payload.Trend.TrendViewaDTO;
import Auth.auth.Service.TrendService;
import Auth.auth.util.constants.AccountSuccess;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
@RestController
@RequestMapping("/trend")
@SecurityRequirement(name = "NETFLIX-CLONE")
@Tag(name="Trend Controller", description="Controller for Trending shows/movies") 
@Slf4j
public class TrendController {

    @Autowired
    private TrendService trendService;

    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json") 
    public ResponseEntity<String> addTrend(@Valid @RequestBody TrendAddDTO trendAddDTO) {
        Trend trend = new Trend();
        trend.setName(trendAddDTO.getName());
        trend.setPhotourl1(trendAddDTO.getPhotourl1());
        trend.setPhotourl2(trendAddDTO.getPhotourl2());
        trend.setVideourl(trendAddDTO.getVideourl());
        trend.setMovieType(trendAddDTO.getMovieType());
        trend.setRated(trendAddDTO.getRated());
        trend.setStarring(trendAddDTO.getStarring());
        trend.setDescription(trendAddDTO.getDescription());
        trendService.save(trend);
        return ResponseEntity.ok(AccountSuccess.TREND_ADDED.toString());
    }

    @GetMapping(value="/view", produces = "application/json")
    @CrossOrigin(origins = "http://localhost:3000") 
    public ResponseEntity<List<TrendViewaDTO>> viewALLtrend() {
        log.info("Fetching all trends...");
        List<TrendViewaDTO> trends = new ArrayList<>();
        for (Trend trend : trendService.findall()) {
            trends.add(new TrendViewaDTO(
                trend.getId(),
                trend.getName(),
                trend.getPhotourl1(),
                trend.getPhotourl2(),
                trend.getVideourl(),
                trend.getRelease_year(),
                trend.getRated(),
                trend.getMovieType(),
                trend.getStarring(),
                trend.getDescription()
            ));
        }
        log.info("Trends fetched: {}", trends);
        return ResponseEntity.ok(trends);
    }


        
    // Deleting the mapping for the user
    @DeleteMapping(value = "/trend/delete")
    @ApiResponse(responseCode = "200", description = "Update profile")
    @ApiResponse(responseCode = "401", description = "Token missing")
    @ApiResponse(responseCode = "403", description = "Token Error")
    @Operation(summary = "Delete the data")
    @SecurityRequirement(name = "NETFLIX-CLONE")
    public ResponseEntity<String> delete_profile(Long id) {
       trendService.deleteByID(id);
        return new ResponseEntity<String>("Bad request", HttpStatus.BAD_REQUEST);
    }
}