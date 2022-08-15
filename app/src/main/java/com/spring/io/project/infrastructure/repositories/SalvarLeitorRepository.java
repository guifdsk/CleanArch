package com.spring.io.project.infrastructure.repositories;

import com.spring.io.project.infrastructure.models.Leitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SalvarLeitorRepository extends JpaRepository<Leitor, UUID> {
}
