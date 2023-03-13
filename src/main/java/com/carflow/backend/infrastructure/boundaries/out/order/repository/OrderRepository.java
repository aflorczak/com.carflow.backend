package com.carflow.backend.infrastructure.boundaries.out.order.repository;

import com.carflow.backend.infrastructure.boundaries.out.order.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, String> {
    List<OrderEntity> findByStatusIn(List<String> status);
}
