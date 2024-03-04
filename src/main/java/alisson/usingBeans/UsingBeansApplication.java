package alisson.usingBeans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UsingBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsingBeansApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(MessageSystem messageSystem) throws Exception{
		return args -> {

			messageSystem.sendRegistrationConfirmation();
			messageSystem.sendWelcomeMessage();
			messageSystem.sendRegistrationConfirmation();
		};
	}
	

}
