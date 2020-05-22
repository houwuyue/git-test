package com.bunfly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author @SpringBootApplication来标注这是一个主程序类，说明这是一个springboot应用 */
@SpringBootApplication
public class HelloWorld {
    public static void main(String[] args) {
        //把Spring应用启动起来
        SpringApplication.run(HelloWorld.class,args);

    }
}
