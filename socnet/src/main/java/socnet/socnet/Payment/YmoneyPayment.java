package socnet.socnet.Payment;

import socnet.socnet.DTO.User.UserDTO;
import socnet.socnet.Logger.Logger;

public class YmoneyPayment implements PaymentStrategy{

    @Override
    public void pay(UserDTO login, int amount){
        Logger logger = Logger.getInstance();
		logger.log("Pay with Ymoney, Login: " + login + " Amount: " + amount);
    }

}
