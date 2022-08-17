package com.tranquilamente.tranquilamente.services;

import com.tranquilamente.tranquilamente.entity.UsuarioCorporativo;
import com.tranquilamente.tranquilamente.repository.UsuarioCorporativoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioCorporativoServico {
    @Autowired
    private UsuarioCorporativoRepositorio usuarioDAO;

    public void salvar(UsuarioCorporativo usuario) {
        usuarioDAO.save(usuario);
    }
}
