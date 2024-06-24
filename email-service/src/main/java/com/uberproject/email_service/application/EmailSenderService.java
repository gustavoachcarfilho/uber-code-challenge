package com.uberproject.email_service.application;

import com.uberproject.email_service.adpters.EmailSenderGateway;
import com.uberproject.email_service.core.EmailSenderUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Na package application há as implementações dos casos de uso definidos no core
//Desse modo, a package application conhece o core, porém o core não conhece a package application

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway){
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
