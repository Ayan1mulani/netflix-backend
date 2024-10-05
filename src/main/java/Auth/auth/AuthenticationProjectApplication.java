package Auth.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SpringBootApplication
// you need to add @SecurityScheme so there will be a authorise option on right side of swagger to authroise
@SecurityScheme(name="NETFLIX-CLONE", scheme = "bearer", type=SecuritySchemeType.HTTP, in= SecuritySchemeIn.HEADER)
public class AuthenticationProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationProjectApplication.class, args);
	}

}
