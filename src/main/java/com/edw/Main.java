package com.edw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * <pre>
 *  com.edw.Main
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 17 Jul 2024 16:04
 */
@SpringBootApplication
@EnableCaching
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
