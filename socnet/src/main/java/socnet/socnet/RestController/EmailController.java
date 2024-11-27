package socnet.socnet.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import socnet.socnet.DTO.User.UserDTO;
import socnet.socnet.Mail.SendEmailCommand;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import socnet.socnet.Mail.SendEmailCommandHandler;
import socnet.socnet.Service.EmailService;
import socnet.socnet.Service.UserService;

@RestController
@RequestMapping("/api/v1/emails")
public class EmailController {

    @Autowired
    private SendEmailCommandHandler sendEmailCommandHandler;

    @Autowired
    private EmailService emailService;

    @Autowired
    private List<UserService> users;

    @PostMapping
    public ResponseEntity<Void> sendEmail(@RequestBody SendEmailCommand command) {
        for (UserService  user : users) {
            emailService.registerObserver(user);
        }
        sendEmailCommandHandler.handle(command);
        return ResponseEntity.ok().build();
    }
    
}
