package com.fatdaruma.usecase

/**
 * Created by jmatsu on 2016/02/25.
 */
data class Result (
        val err: Error? = null,
        val success: Success? = null
)

interface Response

interface Success : Response

interface Error : Response {
    val errMessage: String
    val status: Int
}

data class CommonError (
        override val errMessage: String = "Forbidden",
        override val status: Int = 403
) : Error