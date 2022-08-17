package com.tranquilamente.tranquilamente.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "assinatura")
public class Assinatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String login;

    private String tipo;

    private Double valor;

    private Date inicioAssinatura;

    private String tipoDeAssinatura;

    private Date fimDaAssinatura;

    private String status;

    public Assinatura(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getInicioAssinatura() {
        return inicioAssinatura;
    }

    public void setInicioAssinatura(Date inicioAssinatura) {
        this.inicioAssinatura = inicioAssinatura;
    }

    public String getTipoDeAssinatura() {
        return tipoDeAssinatura;
    }

    public void setTipoDeAssinatura(String tipoDeAssinatura) {
        this.tipoDeAssinatura = tipoDeAssinatura;
    }

    public Date getFimDaAssinatura() {
        return fimDaAssinatura;
    }

    public void setFimDaAssinatura(Date fimDaAssinatura) {
        this.fimDaAssinatura = fimDaAssinatura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
