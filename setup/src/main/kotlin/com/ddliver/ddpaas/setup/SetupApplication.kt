package com.ddliver.ddpaas.setup

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SetupApplication

fun main(args: Array<String>) {
    SpringApplication.run(SetupApplication::class.java, *args)
}
