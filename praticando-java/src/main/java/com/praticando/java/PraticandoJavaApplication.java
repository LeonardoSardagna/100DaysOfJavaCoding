package com.praticando.java;

import com.praticando.java.Day06.Day06;
import com.praticando.java.Day5.Day5;
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
        Day06 day06 = new Day06();
        day06.adicionaNumerosNaLista();
    }
}
