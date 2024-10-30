package com.praticando.java;

import com.praticando.java.Day08.ExercicioMatriz;
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
        ExercicioMatriz exercicioMatriz = new ExercicioMatriz();
        exercicioMatriz.compromisso();
    }
}
