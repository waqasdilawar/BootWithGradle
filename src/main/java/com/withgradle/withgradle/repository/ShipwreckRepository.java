package com.withgradle.withgradle.repository;

import com.withgradle.withgradle.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
}
