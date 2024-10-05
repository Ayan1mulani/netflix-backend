package Auth.auth.Config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@Configuration
@OpenAPIDefinition(
  info =@Info(
    title = "NETFLIX-CLONE",
    version = "Verions 1.0",
    contact = @Contact(
      name = "Ayan", email = "ayanmulani158@gmail.com", url = ""
    ),
    license = @License(
      name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"
    ),
    description = "This is the netflix clone by the Ayan for project purpose"
  )
)
public class SwaggerConfig {
}
