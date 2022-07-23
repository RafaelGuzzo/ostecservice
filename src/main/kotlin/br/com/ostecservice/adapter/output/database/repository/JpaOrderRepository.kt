package br.com.ostecservice.adapter.output.database.repository

import br.com.ostecservice.adapter.output.database.entity.OrderEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface JpaOrderRepository : JpaRepository<OrderEntity, String> {
}