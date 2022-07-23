package br.com.ostecservice.adapter.output.database.entity

import java.util.UUID
import javax.persistence.Embeddable
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Entity
data class ClientEntity(
    @Id
    val id: String = UUID.randomUUID().toString(),

    @field:NotBlank
    val name: String,
    val email: String,
    val documentNumber: String,

    @field:NotBlank
    @field:Size(max = 14)
    val contactNumber: String,
    val cellPhone: String,

    @Embedded
    val address: AddressEntity
) {

    @Embeddable
    data class AddressEntity(
        @field:NotBlank
        val city: String,

        @field:NotBlank
        val street: String,

        @field:NotBlank
        val district: String,

        @field:NotBlank
        val number: String
    )
}