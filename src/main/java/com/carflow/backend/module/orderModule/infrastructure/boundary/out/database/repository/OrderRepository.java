package com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.repository;

import com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, String> {
    List<OrderEntity> findByStatusIn(List<String> status);
}
