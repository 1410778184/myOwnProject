package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@SpringBootApplication
@Component("com.docker")
public class DockerApplication {
public static void main(String[] args) {
    SpringApplication.run(DockerApplication.class, args);
}
}
