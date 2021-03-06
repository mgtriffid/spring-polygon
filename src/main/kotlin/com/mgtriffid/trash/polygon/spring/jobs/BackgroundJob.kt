package com.mgtriffid.trash.polygon.spring.jobs

import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

@Service
class BackgroundJob {

    private val log = LoggerFactory.getLogger(javaClass)

    @Scheduled(fixedDelay = 10000)
    fun someBackgroundJob() = log.info("I AM WORKING")
}
