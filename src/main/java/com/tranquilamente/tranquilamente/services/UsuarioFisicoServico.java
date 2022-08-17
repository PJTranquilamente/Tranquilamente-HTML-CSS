package com.tranquilamente.tranquilamente.services;

import com.tranquilamente.tranquilamente.entity.UsuarioFisico;
import com.tranquilamente.tranquilamente.exceptions.UsuarioInvalido;
import com.tranquilamente.tranquilamente.repository.UsuarioFisicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioFisicoServico {


    @Autowired
    private UsuarioFisicoRepositorio usuarioDAO;

    private static final int complexidadeSenha = 10;

    public String criptografarPassword(UsuarioFisico user) {
        return BCrypt.hashpw(user.getSenha(), BCrypt.gensalt(complexidadeSenha));
    }

    public void salvar(UsuarioFisico usuario) {
        usuarioDAO.save(usuario);
    }

    public UsuarioFisico validarLogin(String email, String senha) throws UsuarioInvalido {


        Optional<UsuarioFisico> user = usuarioDAO.findByEmail(email);

        if(user.isPresent()) {
            // verificar se a senha do usuário esta correta
            if(BCrypt.checkpw(senha, user.get().getSenha())) {
                return user.get();
            }
            else {
                throw new UsuarioInvalido("Email ou Senha inválidos");
            }
        }
        else {
            throw new UsuarioInvalido("Email ou Senha inválidos");
        }

    }


}
