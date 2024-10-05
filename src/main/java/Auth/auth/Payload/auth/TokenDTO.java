package Auth.auth.Payload.auth;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TokenDTO {
    
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    private String token;
}
