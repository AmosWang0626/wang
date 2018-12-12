package com.genealogy.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author daoyuan
 */
@SpringBootApplication(scanBasePackages = "com.genealogy.wang")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
