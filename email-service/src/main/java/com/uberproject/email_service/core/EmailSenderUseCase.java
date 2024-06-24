package com.uberproject.email_service.core;

//Na package/camada core são definidos os casos de uso/regras de negócio da aplicação
//A camada core não conhece ninguém, ou seja, realmente é o núcleo onde as outras camadas ficam sobre ela
public interface EmailSenderUseCase {

    void sendEmail(String to, String subject, String body);
}
