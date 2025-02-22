package com.FirstSpringApp;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpringController {
    //UC1
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    //UC2
    @GetMapping("/helloworld")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        return "hello"; // Refers to hello.html in the templates folder
    }

    //UC3
    @GetMapping("/hello2")  //Handles GET requests to /api/hello
    public String sayHelloUsingRestController() {
        return "Hello from BridgeLabz";
    }
}