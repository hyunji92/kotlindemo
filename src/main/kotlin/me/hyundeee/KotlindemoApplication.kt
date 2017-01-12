package me.hyundeee

import me.hyundeee.user.User
import me.hyundeee.user.UserRepository
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class KotlindemoApplication {
    @Bean
    open fun init(userRepository: UserRepository) {
        userRepository.save(User("hyundee", 26, "chunghj09@naver.com"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlindemoApplication::class.java, *args)
}

