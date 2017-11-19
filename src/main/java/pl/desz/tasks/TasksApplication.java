package pl.desz.tasks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.desz.tasks.domain.Task;
import pl.desz.tasks.service.TaskService;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskService taskService) {
		return args -> {
			taskService.create(new Task(1L, "Create Spring Boot backend", false, LocalDate.now()));
			taskService.create(new Task(2L, "Create Angular frontend", false, LocalDate.now()));
			taskService.create(new Task(3L, "Join backend and fronted together", false, LocalDate.now().plus(14, ChronoUnit.DAYS)));
			taskService.create(new Task(4L, "Run the application", false, LocalDate.now().plus(3, ChronoUnit.DAYS)));
			taskService.create(new Task(5L, "Enjoy the day", true, LocalDate.now().plus(2, ChronoUnit.DAYS)));
			taskService.create(new Task(6L, "Buy some juice", true, LocalDate.now()));
		};
	}
}
