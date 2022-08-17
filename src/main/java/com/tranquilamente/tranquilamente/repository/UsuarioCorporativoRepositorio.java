package com.tranquilamente.tranquilamente.repository;

import com.tranquilamente.tranquilamente.entity.UsuarioCorporativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioCorporativoRepositorio extends JpaRepository<UsuarioCorporativo, Integer> {

    boolean existsByEmail(String email);
}
