package com.kaidanouji19840218.demo9.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/test/user")
    public String login() {
        return "login";
    }
    @GetMapping("/login/operation")
    public String index(final Model model, final OAuth2AuthenticationToken token) {
        return "index";
    }

    @GetMapping("/login/c001")
    public String c001(final Model model, final OAuth2AuthenticationToken token) {
        return "index";
    }

    @GetMapping("/home")
    public String home(final Model model, final OAuth2AuthenticationToken token) {
        return "index";
    }
}