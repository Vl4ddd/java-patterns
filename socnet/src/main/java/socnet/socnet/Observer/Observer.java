package socnet.socnet.Observer;

import org.springframework.mail.SimpleMailMessage;

public interface Observer {

    void update(SimpleMailMessage message);

}
