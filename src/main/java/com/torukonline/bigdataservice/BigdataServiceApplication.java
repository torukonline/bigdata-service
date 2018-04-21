package com.torukonline.bigdataservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class BigdataServiceApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(BigdataServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BigdataServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("微服务 bigdata-service 正在启动...");
    }
}