package kodlama.io.rentACar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RentACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);
	}

	@Bean //Bean annotation ile ben bu nesneyi IOC containere ekleyeyim, birisinin ihtiyaci oldugunda cagirir kullanirim der.
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}
}


//Brand -->Marka
//Car -->Araba