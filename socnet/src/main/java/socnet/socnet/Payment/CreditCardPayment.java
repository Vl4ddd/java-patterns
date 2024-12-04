package socnet.socnet.Payment;


import org.springframework.stereotype.Component;

import socnet.socnet.DTO.User.UserDTO;
import socnet.socnet.Logger.Logger;

@Component
public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay(UserDTO login, int amount){
        Logger logger = Logger.getInstance();
		logger.log("Pay with credit card, Login: " + login + " Amount: " + amount);
    }

}
