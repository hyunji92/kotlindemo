package me.hyundeee.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * Created by jeonghyeonji on 2017. 1. 12..
 */
@RestController
class UserController(){
    @GetMapping("/user/{userId}")
    fun getUserById(@PathVariable userId: Long, repository: UserRepository) = repository.findOne(userId)

}