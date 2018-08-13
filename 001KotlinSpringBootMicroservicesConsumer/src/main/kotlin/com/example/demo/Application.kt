package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.ConfigurableApplicationContext

@SpringBootApplication
@EnableEurekaClient
open class Application

fun main(args: Array<String>) {
	var context: ConfigurableApplicationContext=runApplication<Application>(*args)
	var msc: Application=context.getBean(Application::class)
}
