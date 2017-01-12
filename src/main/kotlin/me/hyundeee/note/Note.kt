package me.hyundeee.note

import me.hyundeee.user.User
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by jeonghyeonji on 2017. 1. 12..
 */
@Entity
class Note (
        var title: String = "",
        var contents: String = "",
        var writer: User = User(),
        var registerDate: Date = Date(),
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var noteId: Long = 0
)