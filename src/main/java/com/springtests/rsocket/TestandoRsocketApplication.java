package com.springtests.rsocket;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class TestandoRsocketApplication {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active"
				,"rpcserver");
		
		SpringApplication.run(TestandoRsocketApplication.class, args);
	}

}

@Controller
class GreetingsController {
	
	@MessageMapping("greetings.{lang}")
	String greet(@DestinationVariable("lang") Locale lang
			,@Payload String name) {
		System.out.println("locale: " 
			+ lang.getLanguage());
		return "Hello, " + name + "!";
	}	
}
