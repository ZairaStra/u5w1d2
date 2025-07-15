package zairastra.u5w1d2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zairastra.u5w1d2.entities.Menu;

@SpringBootApplication
@Slf4j
public class u5w1d1Application {

	public static void main(String[] args) {
		SpringApplication.run(u5w1d1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(u5w1d1Application.class);

		Menu m = (Menu) ctx.getBean("menu");

		m.printMenu();
		ctx.close();
	}

}
