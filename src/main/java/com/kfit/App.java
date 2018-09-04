package com.kfit;

import com.kfit.config.datasource.dynamic.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import javax.swing.*;

@SpringBootApplication
@Import({DynamicDataSourceRegister.class})
public class App {
    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

    }
}
