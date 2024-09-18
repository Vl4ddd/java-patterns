package socnet.socnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		logger.log("Start.");
		SpringApplication.run(Application.class, args);
	}

}




