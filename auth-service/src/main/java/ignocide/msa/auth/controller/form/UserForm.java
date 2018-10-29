package ignocide.msa.auth.controller.form;

import ignocide.msa.auth.domain.User;
import lombok.Data;

@Data
public class UserForm {
    private String email;
    private String password;

    public User toUser(){
        return new User(this.email,this.password);
    }
}
