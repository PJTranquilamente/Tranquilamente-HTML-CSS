package com.tranquilamente.tranquilamente.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaFreeControle {

    @GetMapping("/Alimentacao-Free")
    public String alimentacaofree(){

        return "alimentacao1";
    }

    @GetMapping("/Exercicio-Free")
    public String exerciciofree(){
        return "exercicio1";
    }

    @GetMapping("/Respiracao-Free")
    public String respiracaofree(){
        return "respiracao1";
    }



}
