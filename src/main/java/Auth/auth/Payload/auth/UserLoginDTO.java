package Auth.auth.Payload.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class UserLoginDTO {
 public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
@Email
@NotNull
@Schema(description="Email adress" , example="admin@admin.com", requiredMode= RequiredMode.REQUIRED)
private String email;
@Size(min= 6, max= 20)
@NotNull
@Schema(description="Password" , example="pass123", requiredMode= RequiredMode.REQUIRED,maxLength=20,minLength=6)
private String password;
};
    

