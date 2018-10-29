package ignocide.msa.auth.controller;

import ignocide.msa.auth.controller.form.UserForm;
import ignocide.msa.auth.domain.User;
import ignocide.msa.auth.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping
    public ResponseEntity createUser(@RequestBody UserForm userForm){

        User user = userForm.toUser();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.create(user);

        return ResponseEntity.ok().build();
    }
}

