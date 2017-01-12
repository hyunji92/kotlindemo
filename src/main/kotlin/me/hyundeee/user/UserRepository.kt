package me.hyundeee.user

import org.springframework.data.repository.CrudRepository

/**
 * Created by jeonghyeonji on 2017. 1. 12..
 */
interface UserRepository : CrudRepository<User, Long>{
}