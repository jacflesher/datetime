package com.flesher.flesher;

import jdk.jfr.Name;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.TimeZone;

@RestController
public class fleshercontroller {

    @GetMapping("/")
    String hello(){
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        Integer hour = ZonedDateTime.now().getHour();
        String ampm = "AM";

        if ( hour >= 12){
            hour = hour - 12;
            ampm = "PM";
        }

        return "\n" + hour + ":" +
                zonedDateTime.getMinute() +
                ampm + " " +
                zonedDateTime.getMonth() + " " +
                zonedDateTime.getDayOfMonth() + ", " +
                zonedDateTime.getYear() + "\n";
    }
}
