package com.sboot.freemailmvc.comsbootfreemailmvc.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmtpMailController {

    //@Autowired
    // private JavaMailSender sender ;

    // @RequestMapping("/sendMail88")
    //  public String sendMail() {
    //     MimeMessage message = sender.createMimeMessage();
    //     MimeMessageHelper helper = new MimeMessageHelper(message);
    //     try {
    //         helper.setTo("ross.bai@lhfs.com");
    //        helper.setText("Greetings :)");
    //        helper.setSubject("Mail From my local SB-App");
    //    } catch (MessagingException e) {
    //        e.printStackTrace();
    //       return "Error while sending mail ..";
    //   }
    //   sender.send(message);
    //   return "Mail Sent Success!";
    // }

}
