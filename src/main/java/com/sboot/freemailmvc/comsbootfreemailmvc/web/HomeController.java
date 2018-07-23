package com.sboot.freemailmvc.comsbootfreemailmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    //@GetMapping("/")
    @RequestMapping(value = {"/", "/index"})
    public String indexpage() {
        return "index";
    }

    @RequestMapping(value = {"/form", "/webform"})
    public String webformpage() {
        return "form";
    }

    @GetMapping("/hello")
    public String hellopage(Model model, @RequestParam(value = "name", required = false, defaultValue = "World") String name){
        model.addAttribute("name", name);
        return "hello";
    }


}
