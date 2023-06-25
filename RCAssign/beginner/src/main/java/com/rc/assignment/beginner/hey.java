package com.rc.assignment.beginner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hey {

    @RequestMapping("/hey")
    public String hey() {
        return "Hello World";
    }

}
