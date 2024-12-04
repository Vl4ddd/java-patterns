package socnet.socnet.Payment;

import socnet.socnet.DTO.User.UserDTO;

public interface PaymentStrategy {

    void pay(UserDTO login, int amount);
}
