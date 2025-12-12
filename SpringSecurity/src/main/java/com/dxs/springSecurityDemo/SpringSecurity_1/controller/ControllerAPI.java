package com.dxs.springSecurityDemo.SpringSecurity_1.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAPI {

    @GetMapping("/public")
    public String hello(){
        return "This is a public endpoint";
    }

    @GetMapping("/secured")
    public String securedEndpoint(){
        return "This endpoint is secured";
    }

    @GetMapping("/admin")
    public String forAdmin(){
        return "This controller is only accessible with 'Admin' permissions";
    }

    @GetMapping("/profile")
    public String profile(){
        return "This is the profile endpoint accessibe by by both roles - User,Admin";
    }

    @GetMapping("/manager")
    public String manager(){
        return "This is registered to a manager role only ";
    }

    @GetMapping("/whoami")
    public String whoAmI(Authentication authentication){
        return "The user is " + authentication.getName() + " -> with these roles : " +authentication.getAuthorities();
    }
}
