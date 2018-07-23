package com.sboot.freemailmvc.comsbootfreemailmvc.service;

public interface SendingMailService {
    boolean sendMail(String subject, String body);
}
