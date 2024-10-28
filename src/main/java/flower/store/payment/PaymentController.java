package flower.store.payment;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("payments")
    public List<Payment> getPayments(){
        return List.of(new PayPalPaymentStrategy());
    }
}
