package com.tranquilamente.tranquilamente.controllers;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.tranquilamente.tranquilamente.entity.Empresa;
import com.tranquilamente.tranquilamente.entity.UsuarioCorporativo;
import com.tranquilamente.tranquilamente.entity.UsuarioFisico;
import com.tranquilamente.tranquilamente.repository.EmpresaRepositorio;
import com.tranquilamente.tranquilamente.repository.UsuarioCorporativoRepositorio;
import com.tranquilamente.tranquilamente.repository.UsuarioFisicoRepositorio;
import com.tranquilamente.tranquilamente.services.EmpresaServico;
import com.tranquilamente.tranquilamente.services.UsuarioCorporativoServico;
import com.tranquilamente.tranquilamente.services.UsuarioFisicoServico;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastroControle {

    @Autowired
    UsuarioFisicoServico usuarioFisicoServico;

    @Autowired
    UsuarioFisicoRepositorio usuarioFisicoDAO;

    @Autowired
    EmpresaRepositorio empresaDAO;

    @Autowired
    EmpresaServico empresaServico;

    @GetMapping("/opcao")
    public String opcao() {
        return "opcaocadastro";
    }

    @GetMapping("/cadastro-fisico")
    public String telaCadastroFisico() {
        return "cadastroPFisica";
    }

    @PostMapping("/salvar-pessoa-fisica")
    public String salvarFisica(UsuarioFisico usuario, String emailVerificar, String senhaVerificar) {


        if(this.usuarioFisicoDAO.existsByEmail(usuario.getEmail())) {
            return "redirect:/cadastro-fisico";
        }
        else if(!emailVerificar.equals(usuario.getEmail())) {
            return "redirect:/cadastro-fisico";
        }
        usuario.setSenha(usuarioFisicoServico.criptografarPassword(usuario));
        usuarioFisicoServico.salvar(usuario);

        return "redirect:/login";
    }


    @PostMapping("/salvar-pessoa-juridica")
    public String salvarJuridica(Empresa empresa, String emailVerificar, String senhaVerificar) {



        if(this.empresaDAO.existsByLogin(empresa.getLogin())) {
            return "redirect:/cadastro-juridico";
        }
        else if(!emailVerificar.equals(empresa.getLogin())) {
            return "redirect:/cadastro-juridico";
        }

        empresaServico.salvar(empresa);

        return "redirect:/login";
    }


    @GetMapping("/cadastro-juridico")
    public String telaCadastroJuridico() {

        return "cadastroPJuridica";
    }

}
