package br.com.ostecservice.adapter.output.database.repository

import br.com.ostecservice.application.domain.Client
import br.com.ostecservice.application.port.output.ClientRepositoryPort
import org.springframework.stereotype.Component

@Component
class ClientRepository(
    private val jpaClientRepository: JpaClientRepository
) : ClientRepositoryPort {
    override fun save(client: Client) {
        TODO("Not yet implemented")
    }

    override fun update(client: Client) {
        TODO("Not yet implemented")
    }

    override fun delete(client: Client) {
        TODO("Not yet implemented")
    }

    override fun findById(id: String): Client {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Client> {
        TODO("Not yet implemented")
    }

    override fun findAllByNomeContaining(nome: String): List<Client> {
        TODO("Not yet implemented")
    }
}