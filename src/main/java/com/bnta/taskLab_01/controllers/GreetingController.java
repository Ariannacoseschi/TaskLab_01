package com.bnta.taskLab_01.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greeting")//localhost:8080/greeting?name=Arianna
    public String greeting(@RequestParam (defaultValue="Good Night!") String name){
        return "Good Morning, " + name;
    }


}
