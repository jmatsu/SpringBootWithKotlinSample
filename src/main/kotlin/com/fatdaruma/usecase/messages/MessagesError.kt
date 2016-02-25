package com.fatdaruma.usecase.messages

import com.fatdaruma.usecase.Error

/**
 * Created by jmatsu on 2016/02/25.
 */
data class MessagesError (
        override val errMessage: String,
        override val status: Int
) : Error