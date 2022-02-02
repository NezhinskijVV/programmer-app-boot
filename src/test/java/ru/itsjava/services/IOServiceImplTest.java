package ru.itsjava.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@DisplayName("Класс IOServiceImpl ")
public class IOServiceImplTest {

    @Configuration
    static class MyConfiguration {
        public static final String PRIVET = "privet";
        private final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(PRIVET.getBytes());

        @Bean
        public IOService ioService() {
            return new IOServiceImpl(byteArrayInputStream);
        }
    }

    @Autowired
    private IOService ioService;

    @DisplayName(" корректно работает метод input")
    @Test
    public void shouldHaveCorrectInput(){
        assertEquals(MyConfiguration.PRIVET, ioService.input());
    }

}