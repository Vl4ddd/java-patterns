package socnet.socnet.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import socnet.socnet.Mail.SendEmailCommand;
import org.springframework.beans.factory.annotation.Autowired;

import socnet.socnet.Mail.SendEmailCommandHandler;

@RestController
@RequestMapping("/api/v1/emails")
public class EmailController {

    @Autowired
    private SendEmailCommandHandler sendEmailCommandHandler;

    @PostMapping
    public ResponseEntity<Void> sendEmail(@RequestBody SendEmailCommand command) {
        sendEmailCommandHandler.handle(command);
        return ResponseEntity.ok().build();
    }
    
}
