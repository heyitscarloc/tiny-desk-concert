package org.npr.tinydeskconcert.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContestController {
    
    @GetMapping("/contest")
    public String get() {
        return "contest";
    }
}
