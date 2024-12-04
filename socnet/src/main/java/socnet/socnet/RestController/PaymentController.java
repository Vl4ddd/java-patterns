package socnet.socnet.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import socnet.socnet.DTO.User.UserDTO;
import socnet.socnet.Payment.CreditCardPayment;
import socnet.socnet.Payment.PaymentContext;
import socnet.socnet.Payment.YmoneyPayment;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {

    private final PaymentContext paymentContext;

    @Autowired
    public PaymentController(PaymentContext paymentContext) {
        this.paymentContext = paymentContext;
    }

    @PostMapping("/credit-card")
    public void payWithCreditCard(@RequestParam UserDTO login, int amount) {
        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.executePayment(login, amount);
    }

    @PostMapping("/Ymoney")
    public void payWithPayPal(@RequestParam UserDTO login, int amount) {
        paymentContext.setPaymentStrategy(new YmoneyPayment());
        paymentContext.executePayment(login, amount);
    }

   
}