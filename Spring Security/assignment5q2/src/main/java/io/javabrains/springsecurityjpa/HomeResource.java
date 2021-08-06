package io.javabrains.springsecurityjpa;

import io.javabrains.springsecurityjpa.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeResource {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    UserServices userServices;
    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @RequestMapping(value="/add", method = RequestMethod.GET)
    public void addUser(@RequestBody User user){
        String pass = user.getPassword();
        user.setPassword(bCryptPasswordEncoder.encode(pass));
        userServices.addUser(user);
        System.out.println(userServices.getAllUsers());
    }
    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }
}

