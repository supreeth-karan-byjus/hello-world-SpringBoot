package com.springdemo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }

    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Return goodbye from Spring Boot";
    }

    @RequestMapping("/youtubelink")
    public String youtubelink() {
        return "From this youtube link i studied https://www.youtube.com/watch?v=5kOGdZmpSDI";
    }

    @RequestMapping("/portfolio")
    public RedirectView localRedirect() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://supreethsudhakaranmenon.github.io/");
        return redirectView;
    }



}
