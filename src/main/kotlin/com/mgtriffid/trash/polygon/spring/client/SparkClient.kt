package com.mgtriffid.trash.polygon.spring.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(value = "dumbServer", url = "http://localhost:4567/")
interface SparkClient {
    @GetMapping("/greetings/hello")
    fun getGreeting(@RequestParam("name") name: String): String
}
