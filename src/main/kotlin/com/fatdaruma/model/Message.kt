package com.fatdaruma.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.GenerationType

/**
 * Created by jmatsu on 2016/02/22.
 */
@Entity
data class Message (
        var body: String = "",

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0L
)

class MessageSeed() {
    constructor(body: String) : this() {
        this.body = body
    }

    var body: String = ""

    fun apply(): Message = Message(body = body)
}