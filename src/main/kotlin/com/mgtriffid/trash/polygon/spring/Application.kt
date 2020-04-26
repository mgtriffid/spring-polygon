package com.mgtriffid.trash.polygon.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
@EnableFeignClients
@EnableJpaRepositories
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
