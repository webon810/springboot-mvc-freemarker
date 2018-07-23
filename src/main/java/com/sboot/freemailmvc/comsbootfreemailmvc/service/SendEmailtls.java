package com.sboot.freemailmvc.comsbootfreemailmvc.service;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmailtls {

    public static void main(String[] args) {

        final String username = "username01@gmail.com";
        final String password = "gmpass01";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("email001@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("email002@gmail.com, email003@gmail.com"));
            message.setRecipients(Message.RecipientType.BCC,
                    InternetAddress.parse("email004@gmail.com"));
            message.setSubject("Testing Subject for multi-email recipients");
            message.setText("Dear Mail Crawler,"
                    + "\n\n No spam to my email, please!");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
