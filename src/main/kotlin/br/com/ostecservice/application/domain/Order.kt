package br.com.ostecservice.application.domain

import br.com.ostecservice.application.domain.constants.OrderStatus
import java.math.BigDecimal
import java.time.LocalDateTime

data class Order(
    val id: String,
    val client: Client,
    val equipment: String,
    val description: String,
    val price: BigDecimal = BigDecimal.ZERO,
    val state: OrderStatus = OrderStatus.OPEN
) {
    private val createdDate: LocalDateTime = LocalDateTime.now()
    private val updateDate: LocalDateTime = LocalDateTime.now()
}