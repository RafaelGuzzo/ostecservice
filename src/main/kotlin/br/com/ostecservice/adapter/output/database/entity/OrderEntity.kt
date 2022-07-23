package br.com.ostecservice.adapter.output.database.entity

import br.com.ostecservice.application.domain.Client
import br.com.ostecservice.application.domain.constants.OrderStatus
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
data class OrderEntity(
    @Id
    val id: String = UUID.randomUUID().toString(),

    @field:NotNull
    @ManyToOne
    val client: ClientEntity,

    @field:NotBlank
    val equipment: String,

    @field:NotBlank
    val description: String,
    val price: BigDecimal,

    @Enumerated(EnumType.STRING)
    val state: OrderStatus,
    val createdDate: LocalDateTime,
    val updateDate: LocalDateTime
)