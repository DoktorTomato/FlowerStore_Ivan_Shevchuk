package flower.store.delivery;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {
    
    @GetMapping("delivery")
    public List<Delivery> getDeliveries(){
        return List.of(new PostDeliveryStrategy("Kozelnytska 2a"));
    }
}
