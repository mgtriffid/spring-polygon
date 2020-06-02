package com.mgtriffid.trash.polygon.spring.rest

import com.mgtriffid.trash.polygon.spring.rest.dto.MyRequest
import com.mgtriffid.trash.polygon.spring.rest.dto.MyResponse
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/playing-with-swagger")
@Api("This is api")
class ApiExample {
    @PostMapping
    @ApiOperation("This is operation")
    fun doWork(@RequestBody req: MyRequest): MyResponse = TODO()
}