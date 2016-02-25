package com.fatdaruma.usecase.messages

import com.fatdaruma.model.Message
import com.fatdaruma.service.MessagesService

/**
 * Created by jmatsu on 2016/02/22.
 */
data class ShowUseCase(val service: MessagesService) {
    fun apply(id: Long): Message = service.findById(id)
}