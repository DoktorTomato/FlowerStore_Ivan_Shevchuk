package flower.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FlowerStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerStoreApplication.class, args);
	}
}
