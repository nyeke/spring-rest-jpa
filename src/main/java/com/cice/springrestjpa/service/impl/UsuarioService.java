package com.cice.springrestjpa.service.impl;

import com.cice.springrestjpa.data.repository.UsuarioRepository;
import com.cice.springrestjpa.service.IUsuarioService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{

    private UsuarioRepository usuarioRepository;

    @Override
    public String login(String user, String pass) {

        usuarioRepository.findByUserAndPass(user, pass);

        return null;
    }
}
