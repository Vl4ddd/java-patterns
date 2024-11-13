package socnet.socnet.Mail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SendEmailCommand {
    private String to;
    private String subject;
    private String body;

}
