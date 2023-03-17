package IPDP.bazaDeDatePostgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication(scanBasePackages = "IPDP.bazaDeDatePostgres")
public class BazaDeDatePostgresApplication {
	public static void main(String[] args) {
		SpringApplication.run(BazaDeDatePostgresApplication.class, args);
		//pus date in baza de date
	}

}
