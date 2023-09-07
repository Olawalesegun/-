package com.example.hnginternship.controller;

import com.example.hnginternship.data.models.InternShip;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@RestController
public class InternshipController {


    //@RequestParam(name="slack_name", value="example_name")
    @GetMapping("/api")
    public InternShip getInternshipDetails(@RequestParam String slack_name,
                                           @RequestParam String track){
        return new InternShip(slack_name, track, HttpStatus.OK.value());
    }
}
