package com.example.hellojava;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "<html><body><h1>Hello, World!</h1></body></html>";
    }
    
    @GetMapping("/one")
    public String one() {
        return "one";
    }
    
    @GetMapping("/two")
    @ResponseBody
    public String two() {
        return "<html><body><h1>Hello, World!</h1></body></html>";
    }
    
    @GetMapping("/greeting")
    @ResponseBody
    public String greeting() {
        return "Hello, World!";
    }
    
    @GetMapping("/user")
    @ResponseBody
    public User GetUser() {
    	return new User("Jonh", "Doe");
    }
}


class User {
    private String firstName;
    private String lastName;


    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}