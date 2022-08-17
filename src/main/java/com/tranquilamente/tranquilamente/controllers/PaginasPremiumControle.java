package com.tranquilamente.tranquilamente.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginasPremiumControle {

    @GetMapping("/pagina-inicial-premium")
    public String paginainicialpremium(){

        return "paginaInicial";
    }
    @GetMapping("/Alimentacao-premium")
    public String alimentacaopremium(){

        return "alimentaçao";
    }
    @GetMapping("/localizacao-premium")
    public String localizacaopremium(){

        return "localizaçao";
    }
    @GetMapping("/Exercicio-premium")
    public String exerciciopremium(){

        return "exercicio";
    }
    @GetMapping ("/Respiracao-premium")
    public String respiracaopremium(){

        return "respiracao";
    }
    @GetMapping ("/Musica-premium")
    public String musicapremium(){

        return "musica";
    }
    @GetMapping ("/Usuario-premium")
    public String usuariopremium()
    {
        return "usuario";
    }

    @GetMapping("/Pagamento")
    public String pagamento(){

        return "pagamento";
    }


}
