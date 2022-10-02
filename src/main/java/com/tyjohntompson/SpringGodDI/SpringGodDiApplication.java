package com.tyjohntompson.SpringGodDI;

import com.tyjohntompson.SpringGodDI.controller.I18nController;
import com.tyjohntompson.SpringGodDI.controller.MainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringGodDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringGodDiApplication.class, args);

//		Manual getting Controller Bean from the context
//
//		MainController controller = (MainController) context.getBean("mainController");
//		String greetings = controller.sayHi();
//		System.out.println(greetings);

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHi());

	}

}
