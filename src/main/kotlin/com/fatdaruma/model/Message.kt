package com.fatdaruma.model

import com.fatdaruma.usecase.Success
import java.io.Serializable
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
) : Success

data class MessageSeed (
        var body: String = ""
) : Serializable