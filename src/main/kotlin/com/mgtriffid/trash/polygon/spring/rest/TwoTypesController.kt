package com.mgtriffid.trash.polygon.spring.rest

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonSubTypes.Type
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/animals")
class TwoTypesController {

    @GetMapping("/cat")
    fun cat() = Cat(30, "Busya")

    @GetMapping("/two")
    fun two() = listOf(Cat(30, "Busya"), Dog(4, "Chester"))

    @PostMapping("/consume")
    fun consume(@RequestBody animal: Animal): String = if (animal is Cat) "IT IS A CAT" else "IT IS A DOG"
}

@JsonTypeInfo(use = NAME, include = PROPERTY)
@JsonSubTypes(
    Type(value = Cat::class, name = "cat"),
    Type(value = Dog::class, name = "dog")
)

open class Animal(val name: String)

class Cat(val whiskers: Int, name: String) : Animal(name)

class Dog(val paws: Int, name: String) : Animal(name)
