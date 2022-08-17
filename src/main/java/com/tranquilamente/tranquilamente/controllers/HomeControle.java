package com.tranquilamente.tranquilamente.controllers;

import com.tranquilamente.tranquilamente.entity.UsuarioFisico;
import com.tranquilamente.tranquilamente.exceptions.UsuarioInvalido;
import com.tranquilamente.tranquilamente.services.UsuarioFisicoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class HomeControle {


    @Autowired
    UsuarioFisicoServico usuarioFisicoServico;


    @GetMapping("/boas-vindas")
    public String inicio() {

        return "boasvindas";
    }

    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @PostMapping("/logar")
    public String verificarLogin(@RequestParam String email, @RequestParam String senha, HttpSession session, Model model) {

        try {
            UsuarioFisico usuario = usuarioFisicoServico.validarLogin(email, senha);
            session.setAttribute("usuarioLogado", usuario);

            return "redirect:/pagina-inicial-premium";

        }
        catch (UsuarioInvalido e) {
            model.addAttribute("msgErro", e.getMessage());
        }

        return "redirect:/login";

    }

    @GetMapping("/visitantes")
    public String visitante() {

        return "paginaInicial1";
    }
    @GetMapping("/recuperacao")
    public String recuperacao(){
        return "recuperacao";
    }

}
