package socnet.socnet.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import socnet.socnet.Service.EmailService;

@Component
public class SendEmailCommandHandler {

    @Autowired
    private EmailService emailService;

    public void handle(SendEmailCommand command) {
        emailService.sendEmail(command.getTo(), command.getSubject(), command.getBody());
    }

}
