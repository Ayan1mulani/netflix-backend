package Auth.auth.Config;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// import Auth.auth.Service.AccountService;
// import Auth.auth.Service.TrendService;


@Component
public class SeedData implements  CommandLineRunner{
    // @Autowired
    // private AccountService accountService;
    // @Autowired
    // private TrendService trendService;
   
    @Override
    public void run(String... args) throws Exception {   
        
        
        // Account account01 = new Account();
        // account01.setEmail("admin@admin.com");
        // account01.setPassword("pass123");
        // account01.setAuthorities(Authority.ADMIN.toString()+" "+Authority.USER.toString());
        // accountService.save(account01);
       
        // Account account02 = new Account();
        // account02.setEmail("user@user.com");
        // account02.setPassword("pass1234");
        // account02.setAuthorities(Authority.USER.toString());
        // accountService.save(account02);


        // Trend trend01 = new Trend();
        // trend01.setName("Kalki");
        // trend01.setPhotourl1("https://occ-0-4857-2186.1.nflxso.net/dnm/api/v6/Qs00mKCpRvrkl3HZAN5KwEL1kpE/AAAABT75ldCnWt6gqmXJSggHaPsyblFOzPujW7y19mpx8o79cQcZc8dGrbzKlCFfRy9W9VznijDEdtE8sCeZ7qY5mGaazbmc822MmnKE.jpg?r=22e");
        // trend01.setPhotourl2("https://occ-0-4857-2186.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABZEJBRLQeBu_f4OqH674tJE_e0yU1B1aIa8H2Z3cyDg2TUwOFJnqeDw6uy_-ZemWIXriPBxcdjFXr-mXIbLkAzuVV9x7v5KMALyj.jpg?r=b30");
        // trend01.setVideourl("https://v1.sdsp.xyz/embed/movie/801688");
        // trend01.setRelease_year(2024);
        // trend01.setRated("U/A 13+");
        // trend01.setStarring("Amitabh Bachchan, Kamal Haasan, Prabhas");
        // trend01.setMovieType("Action");
        // trend01.setDescription("The future of those in the dystopian city of Kasi is altered when the destined arrival of Lord Vishnu's final avatar launches a war against darkness.");
        // trendService.save(trend01);


        // Trend trend02 = new Trend();
        // trend02.setName("Animal");
        // trend02.setPhotourl1("https://occ-0-4857-2186.1.nflxso.net/dnm/api/v6/Qs00mKCpRvrkl3HZAN5KwEL1kpE/AAAABRDy6R9WCClO9Tkzthr2-SwGnUsM67EdRW1kF5GkWAC1th-pb2P_v5GRY8EztlPi88ezYn8VO6B2S70PMlcQL6XKlFzYb0j1S0PG.jpg?r=47f");
        // trend02.setPhotourl2("https://occ-0-4857-2186.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABWu7o8uOC8ZKp-NEWarthMc0biRABLA_pUNdf6TyDZDnv97OyrsGXpPcWSvOe_9eTfmCR72lr92jyUtu1iUbDjuk4VPq9XAZ_sy-.jpg?r=d56");
        // trend02.setVideourl("https://v1.sdsp.xyz/embed/movie/781732");
        // trend02.setRelease_year(2023);
        // trend02.setRated("A+");
        // trend02.setMovieType("Action");
        // trend02.setStarring("Ranbir Kapoor, Anil Kapoor, Bobby Deol");
        // trend02.setDescription("The hardened son of a powerful industrialist returns home after years abroad and vows to take bloody revenge on those threatening his father's life.");
        // trendService.save(trend02);
    }
    
}
