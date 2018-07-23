package com.sboot.freemailmvc.comsbootfreemailmvc.web;

import com.sboot.freemailmvc.comsbootfreemailmvc.model.ContactUs;
import com.sboot.freemailmvc.comsbootfreemailmvc.service.SendingMailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @Autowired
    SendingMailService sendingMailService;

    @GetMapping("/webform")
    public String index() {
        return "redirect:/form";
    }

    @GetMapping("/form")
    public String formGet() {return "form";}

    //@PostMapping("/form")
    @PostMapping(value = {"/form"})
    public String cFormPost(ContactUs contactus, Model model) {
        model.addAttribute("contactus", contactus);
        String subject = contactus.getFirstName() + " " + contactus.getEmail() + " sent you a message";
        String htmlbody = "CreditUnion Web Request: </br> First Name: " + contactus.getFirstName() + "</br> Last Name: " + contactus.getLastName() + "</br> Email: " + contactus.getEmail() + "</br> Phone: " + "</br>Message: " + contactus.getMessage();
        //sendingMailService.sendMail(subject, user.getMessage());
        sendingMailService.sendMail(subject, htmlbody);
        //return "form";
        return "redirect:/index";
    }



}
