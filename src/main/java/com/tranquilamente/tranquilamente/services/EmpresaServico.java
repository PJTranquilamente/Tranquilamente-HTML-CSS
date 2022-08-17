package com.tranquilamente.tranquilamente.services;

import com.tranquilamente.tranquilamente.entity.Empresa;
import com.tranquilamente.tranquilamente.repository.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServico {


    @Autowired
    private EmpresaRepositorio empresaDAO;

    public void salvar(Empresa empresa) {
        empresaDAO.save(empresa);
    }

}
