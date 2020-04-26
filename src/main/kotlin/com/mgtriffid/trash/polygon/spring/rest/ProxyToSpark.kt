package com.mgtriffid.trash.polygon.spring.rest

import com.mgtriffid.trash.polygon.spring.client.SparkClient
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/greetings")
class ProxyToSpark @Autowired constructor(
        val greetingsClient: SparkClient
) {
    val logger = LoggerFactory.getLogger(javaClass)

    @GetMapping
    fun getHello(@RequestParam("name") name: String) = greetingsClient.getGreeting(name)
}