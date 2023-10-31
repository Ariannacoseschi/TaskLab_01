package com.bnta.taskLab_01.controllers;
import com.bnta.taskLab_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greeting")//localhost:8080/greeting?name=Arianna
    public  Greeting greeting(){
       Greeting greeting = new Greeting("Arianna");
       return greeting;
    }


}
