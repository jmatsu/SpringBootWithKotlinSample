package com.fatdaruma.repository

import com.fatdaruma.model.Message
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by jmatsu on 2016/02/22.
 */
interface MessagesRepository: JpaRepository<Message, Long> {
    fun findByBody(body: String): Iterable<Message>
}