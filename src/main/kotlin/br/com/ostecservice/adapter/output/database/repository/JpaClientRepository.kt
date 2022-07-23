package br.com.ostecservice.adapter.output.database.repository

import br.com.ostecservice.adapter.output.database.entity.ClientEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface JpaClientRepository : JpaRepository<ClientEntity, String> {
    fun findAllByNomeContaining(nome: String?): List<ClientEntity?>?
}