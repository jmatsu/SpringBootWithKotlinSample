package com.fatdaruma.usecase.messages

import com.fatdaruma.model.Message
import com.fatdaruma.model.MessageSeed
import com.fatdaruma.service.MessagesService
import com.fatdaruma.usecase.Result

/**
 * Created by jmatsu on 2016/02/22.
 */
data class CreateUseCase(val service: MessagesService) {
    fun apply(body: String): Result = run {
        if (body.isNullOrEmpty()) {
            Result(err = MessagesError("body cannot be blank", 405))
        } else {
            Result(success = service.create(Message(body = body)))
        }
    }

    fun apply(seed: MessageSeed): Result = run {
        if (seed.body.isNullOrEmpty()) {
            Result(err = MessagesError("body cannot be blank", 405))
        } else {
            Result(success = service.create(Message(body = seed.body)))
        }
    }
}