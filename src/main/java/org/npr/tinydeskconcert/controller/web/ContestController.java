package org.npr.tinydeskconcert.controller.web;

import org.npr.tinydeskconcert.model.ContestEntryModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContestController {
    
	public final static String BASE = "/contest";
	
    @GetMapping(BASE)
    public String get(Model model) {
    	model.addAttribute("contestEntryModel", new ContestEntryModel());
        return "contest";
    }
    
    @PostMapping(BASE)
    public String submitContestEntry(@ModelAttribute ContestEntryModel contestEntryModel) {
    	return "redirect:/contest/submit";
    }
    
    @GetMapping(BASE + "/submit")
    public String submitRedirectGet(Model model) {
    	model.addAttribute("contestEntryModel", new ContestEntryModel());
    	return "contest-submitted";
    }
    
}
