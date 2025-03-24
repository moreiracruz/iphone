package com.example.iphone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IphoneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IphoneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Iphone meuIphone = new Iphone();

		meuIphone.tocar();
		meuIphone.ligar("123456789");
		meuIphone.exibirPagina("www.google.com");
	}
}
