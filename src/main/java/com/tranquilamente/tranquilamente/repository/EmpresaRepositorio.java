package com.tranquilamente.tranquilamente.repository;


import com.tranquilamente.tranquilamente.entity.Empresa;
import com.tranquilamente.tranquilamente.entity.UsuarioFisico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa, Integer> {

    boolean existsByLogin(String login);


}
