package mivey.mivey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("resource")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class MiveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiveyApplication.class, args);
	}
}
