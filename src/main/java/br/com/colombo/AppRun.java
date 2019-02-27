package br.com.colombo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author carloshenrique
 */
@SpringBootApplication
@RestController
public class AppRun {

	@Value("${config.name:default}")
	private String name = "World";

	@GetMapping("/")
	public String home() {
		return "Hello " + name;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppRun.class, args);
	}

}
