package com.ksnack.controller;

import com.ksnack.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String home(Model model) {

        String nameStr = homeService.getData();

        model.addAttribute("headerParam", homeService.getHeaderList());
        model.addAttribute("name", nameStr);
        return "home";
    }

}
