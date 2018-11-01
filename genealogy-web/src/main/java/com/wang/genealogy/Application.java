package com.wang.genealogy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author daoyuan
 */
@SpringBootApplication(scanBasePackages = "com.wang.genealogy")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
