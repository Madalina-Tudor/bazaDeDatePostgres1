package IPDP.bazaDeDatePostgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class BazaDeDatePostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(BazaDeDatePostgresApplication.class, args);
	}

}
