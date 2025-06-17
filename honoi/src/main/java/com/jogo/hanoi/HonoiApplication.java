package com.jogo.hanoi;

import com.jogo.hanoi.Entity.ERole;
import com.jogo.hanoi.Entity.Role;
import com.jogo.hanoi.Repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class HonoiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HonoiApplication.class, args);
	}


	@Configuration
	public class DataInitializer {

		@Bean
		public CommandLineRunner initRoles(RoleRepository roleRepository) {
			return args -> {
				if (roleRepository.findByNome(ERole.ROLE_USER).isEmpty()) {
					roleRepository.save(new Role(ERole.ROLE_USER));
					System.out.println("Criado: ROLE_USER");
				}

				if (roleRepository.findByNome(ERole.ROLE_ADMIN).isEmpty()) {
					roleRepository.save(new Role(ERole.ROLE_ADMIN));
					System.out.println("Criado: ROLE_ADMIN");
				}
			};
		}
	}
}
