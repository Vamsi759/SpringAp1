package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainRun {
	public static void main(String[] args) {
		SpringApplication.run(MainRun.class, args);

		String ap = 3450 + "";
		String aps = new StringBuilder(ap).reverse().toString();
		System.out.println(Integer.parseInt(aps) + 2);

	}

}