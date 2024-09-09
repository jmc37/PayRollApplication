package com.sifpayroll.payroll;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sifpayroll.payroll.run.Location;
import com.sifpayroll.payroll.run.Run;

@SpringBootApplication
public class PayrollApplication {

	private static final Logger log = LoggerFactory.getLogger(PayrollApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PayrollApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 10,
					Location.INDOOR);
			log.info("Run created successfully!: {}", run);

		};
	}
}
