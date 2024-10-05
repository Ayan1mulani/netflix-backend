package Auth.auth.Payload.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotBlank;


public class AuthoritiesDTO {

    @NotBlank
    @Schema(description = "Authorites", example = "USER", 
    requiredMode = RequiredMode.REQUIRED)
    private String authorites;

    public String getAuthorites() {
        return authorites;
    }

    public void setAuthorites(String authorites) {
        this.authorites = authorites;
    }
    
}
