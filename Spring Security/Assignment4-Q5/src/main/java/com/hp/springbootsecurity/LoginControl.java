package com.hp.springbootsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginControl {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/admin")
    public String admin() {
        //asd
        return "admin";
    }
}
