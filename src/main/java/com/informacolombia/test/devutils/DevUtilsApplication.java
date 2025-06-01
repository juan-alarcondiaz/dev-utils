package com.informacolombia.test.devutils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.CommandScan;

@CommandScan
@SpringBootApplication
public class DevUtilsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevUtilsApplication.class, args);
    }

}
