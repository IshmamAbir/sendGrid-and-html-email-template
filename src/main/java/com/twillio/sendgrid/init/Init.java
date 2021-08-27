package com.twillio.sendgrid.init;

import com.twillio.sendgrid.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class Init implements CommandLineRunner {
    @Autowired
    EmailService emailService;

    @Override
    public void run(String... args) throws Exception {
//        this.emailService.sendHTML( "ishmam.abir57@gmail.com", "ishmam.abir@brainstation-23.com", "Hello World", "Hello,<br> <strong>how are you doing?</strong>");
    }
}
