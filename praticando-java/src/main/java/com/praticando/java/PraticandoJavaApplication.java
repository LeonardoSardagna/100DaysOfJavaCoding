package com.praticando.java;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraticandoJavaApplication implements CommandLineRunner {

    //função principal a ser executada
    public static void main(String[] args) {
        SpringApplication.run(PraticandoJavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Day01 day01 = new Day01();
        day01.executarOperacoesAritmeticas();
    }
}
