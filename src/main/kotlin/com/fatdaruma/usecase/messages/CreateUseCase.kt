package com.fatdaruma.usecase.messages

import com.fatdaruma.model.Message
import com.fatdaruma.model.MessageSeed
import com.fatdaruma.service.MessagesService

/**
 * Created by jmatsu on 2016/02/22.
 */
data class CreateUseCase(val service: MessagesService) {
    fun apply(body: String): Message = service.create(Message(body = body))
    fun apply(seed: MessageSeed): Message = service.create(seed.apply())
}