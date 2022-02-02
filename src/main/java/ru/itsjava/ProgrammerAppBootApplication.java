package ru.itsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.itsjava.services.ProgrammerService;

@SpringBootApplication
public class ProgrammerAppBootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ProgrammerAppBootApplication.class, args);

        ProgrammerService programmerService = context.getBean("programmerService", ProgrammerService.class);
        programmerService.hiToNewProgrammer();
    }

}
