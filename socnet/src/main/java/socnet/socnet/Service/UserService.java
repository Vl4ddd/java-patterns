package socnet.socnet.Service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import socnet.socnet.DTO.User.UserDTO;
import socnet.socnet.Observer.Observer;

@Component
public class UserService implements Observer{
    
    private UserDTO user;

    @Override
    public void update(SimpleMailMessage message) {
        System.out.println("Пользователь " + user.getName() + " получил сообщение: " + message);
    }
}
