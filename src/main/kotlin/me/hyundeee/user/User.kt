package me.hyundeee.user

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by jeonghyeonji on 2017. 1. 12..
 */

@Entity
class User(
        var name: String = "",
        var age: Int = 0,
        var email: String = "",
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var userId: Long = 0
)