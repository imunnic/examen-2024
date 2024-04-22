package es.mde.examenspring2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import es.mde.externas.Proyector;

@SpringBootApplication
public class ExamenSpring2024Application {

	public static void main(String[] args) {
	  ConfigurableApplicationContext context = SpringApplication.run(ExamenSpring2024Application.class, args);
		Aula miAula = new Aula();
		miAula = context.getBean("Aula",Aula.class);
		Proyector proyector = new Proyector();
		proyector = context.getBean("config",Proyector.class);
	}

}
