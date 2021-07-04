package com.hieunh.baseproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BaseProjectApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BaseProjectApplication.class, args);
		System.out.println("HELLO WORLD");

		Bikini bikini = context.getBean(Bikini.class);

		TShirt tShirt = context.getBean(TShirt.class);

		bikini.wear();
		tShirt.wear();

		System.out.println(bikini);

		Girl girl = context.getBean(Girl.class);
		System.out.println(girl.bikini);
	}

}
