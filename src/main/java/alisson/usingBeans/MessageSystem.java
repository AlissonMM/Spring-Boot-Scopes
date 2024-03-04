package alisson.usingBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSystem {

    @Autowired
    private Sender noreply;
    @Autowired
    private Sender techTeam;

    public void sendRegistrationConfirmation(){
        System.out.println(noreply);
        System.out.println("Your registration is complete");
    }

    public void sendWelcomeMessage(){
        techTeam.setEmail("tech@dio.com.br");
        System.out.println(techTeam);
        System.out.println("Welcome to the Tech Team");
    }
}
