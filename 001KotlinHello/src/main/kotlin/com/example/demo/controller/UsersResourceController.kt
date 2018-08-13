package com.example.demo.resource

import com.example.demo.model.Users
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/rest/users")
class UsersResource(val usersRepository: UserRepository) {

    @GetMapping(value = "/all")
    fun getUsers() = usersRepository.findAll()

    @GetMapping(value = "/insert/{name}")
    fun insertUsers(@PathVariable name: String): List<Users> {
        val users = Users(name)
        usersRepository.save(users)
        return usersRepository.findAll()
    }
}



