package com.uberproject.email_service.adpters;

//Essa interface é idêntica a EmailSenderUseCase, porém elas representam coisas diferentes no código
//Essa interface aqui representa o contrato da nossa aplicação com o provedor de serviços de e-mail que irei usar

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);
}
