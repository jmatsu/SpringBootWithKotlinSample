package com.fatdaruma.service

import com.fatdaruma.model.Message
import com.fatdaruma.repository.MessagesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by jmatsu on 2016/02/22.
 */
@Service
open class MessagesService @Autowired constructor(val repository: MessagesRepository) {
    // commons
    fun count(): Long = repository.count()

    // C
    fun create(entity: Message): Message = repository.saveAndFlush(entity)

    // R
    fun all(): List<Message> = repository.findAll()
    fun findById(id: Long): Message = repository.findOne(id)

    // U
    fun update(entity: Message): Message = repository.save(entity)

    // D
    fun delete(id: Long) = repository.delete(id)
}