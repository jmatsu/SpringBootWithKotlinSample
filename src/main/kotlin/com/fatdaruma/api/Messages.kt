package com.fatdaruma.api

import com.fatdaruma.model.Message
import com.fatdaruma.model.MessageSeed
import com.fatdaruma.service.MessagesService
import com.fatdaruma.usecase.messages.CreateUseCase
import com.fatdaruma.usecase.messages.ShowUseCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Created by jmatsu on 2016/02/22.
 */
@RestController
@RequestMapping("messages")
open class Messages @Autowired constructor(val service: MessagesService) {

    @RequestMapping(method = arrayOf(RequestMethod.POST), path = arrayOf("create"))
    fun create(@RequestBody body: String): Message = CreateUseCase(service).apply(MessageSeed(body))

    @RequestMapping(method = arrayOf(RequestMethod.GET), path = arrayOf("show/{id}"))
    fun show(@PathVariable id: Long): Message = ShowUseCase(service).apply(id)
}