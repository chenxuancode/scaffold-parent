package com.sleeper.scaffold;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务启动类(脚手架)
 * @author scaffold服务
 * @date 2020-11-30 10:58:35
 **/
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.sleeper")
@MapperScan("com.sleeper.scaffold.mapper")
@Slf4j
public class ScaffoldApplication {

    public static void main (String[] args) {
        try{
            SpringApplication.run(ScaffoldApplication.class, args);
        }catch (Throwable e){
            log.error("start error", e);
            throw e;
        }
    }

}