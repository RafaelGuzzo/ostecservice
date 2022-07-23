package br.com.ostecservice.application.domain

import java.time.LocalDateTime

data class Client(
    val id: String,
    val name: String,
    val email: String,
    val documentNumber: String,
    val contactNumber: String,
    val cellPhone: String,
    val address: Address
) {
    data class Address(
        val city: String,
        val street: String,
        val district: String,
        val number: String
    )

    private val createdDate: LocalDateTime = LocalDateTime.now()
    private val updateDate: LocalDateTime = LocalDateTime.now()
}