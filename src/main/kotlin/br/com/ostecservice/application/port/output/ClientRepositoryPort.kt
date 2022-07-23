package br.com.ostecservice.application.port.output

import br.com.ostecservice.application.domain.Client

interface ClientRepositoryPort {

    fun save(client: Client)
    fun update(client: Client)
    fun delete(client: Client)
    fun findById(id: String): Client
    fun findAll(): List<Client>
    fun findAllByNomeContaining(nome: String): List<Client>
}