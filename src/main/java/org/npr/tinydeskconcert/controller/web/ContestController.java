package org.npr.tinydeskconcert.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contest")
public class ContestController {
    
    @GetMapping("/")
    public String get() {
        return ""
    }
}
