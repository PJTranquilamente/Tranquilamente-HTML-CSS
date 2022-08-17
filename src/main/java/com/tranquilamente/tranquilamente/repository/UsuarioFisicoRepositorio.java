package com.tranquilamente.tranquilamente.repository;

import com.tranquilamente.tranquilamente.entity.UsuarioFisico;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioFisicoRepositorio extends JpaRepository<UsuarioFisico, Integer> {

    boolean existsByEmail(String email);

    Optional<UsuarioFisico> findByEmail(String email);

}
