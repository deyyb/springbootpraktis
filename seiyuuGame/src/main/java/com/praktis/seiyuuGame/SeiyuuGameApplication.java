package com.praktis.seiyuuGame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeiyuuGameApplication {

	public static final Logger log = LoggerFactory.getLogger(SeiyuuGameApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SeiyuuGameApplication.class, args);
		log.info("Seiyuu Game has started!");
	}

}
