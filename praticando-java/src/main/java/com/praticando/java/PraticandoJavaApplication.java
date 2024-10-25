package com.praticando.java;

import com.praticando.java.Day03.Day03;
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
        Day03 day03 = new Day03();
        day03.verificarDoisNumerosMaioresQue10();
    }
}
