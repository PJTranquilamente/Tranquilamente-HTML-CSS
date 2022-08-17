package com.tranquilamente.tranquilamente.repository;

import com.tranquilamente.tranquilamente.entity.Assinatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssinaturaRepositorio extends JpaRepository<Assinatura, Integer> {
}
