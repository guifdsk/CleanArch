package com.spring.io.project.infrastructure.repositories;

import com.spring.io.project.infrastructure.models.Leitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeletarLeitorRepository extends JpaRepository<Leitor, UUID> {
}
