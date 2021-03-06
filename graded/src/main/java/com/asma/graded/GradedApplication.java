package com.asma.graded;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.asma.graded.service.MessageService;

@SpringBootApplication
public class GradedApplication implements CommandLineRunner {

	@Autowired
	private MessageService helloService;

	public static void main(String[] args)  {



		SpringApplication app = new SpringApplication(GradedApplication.class);
		app.run(args);

		//        SpringApplication.run(SpringBootConsoleApplication.class, args);
	}

	@Override
	public void run(String... args)  {

		if (args.length > 0 ) {
			System.out.println(helloService.getMessage(args[0].toString()));
		}else{
			System.out.println(helloService.getMessage());
		}
	}
}