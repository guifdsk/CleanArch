package com.spring.io.project.infrastructure.repositories;

import com.spring.io.project.infrastructure.models.Leitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuscarLeitoresRepository extends JpaRepository<Leitor, String> {
}
