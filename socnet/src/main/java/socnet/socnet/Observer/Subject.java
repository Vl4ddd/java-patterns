package socnet.socnet.Observer;

import org.springframework.mail.SimpleMailMessage;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(SimpleMailMessage message);
}
