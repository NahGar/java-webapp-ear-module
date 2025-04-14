package org.ngarcia.webapp.ear.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.ngarcia.webapp.ear.entities.Usuario;
import org.ngarcia.webapp.ear.repositories.UsuarioRepository;

import java.util.List;

@Stateless
public class UsuarioServiceImpl implements UsuarioService {

    @Inject
    private UsuarioRepository repository;

    @Override
    public List<Usuario> listar() {
        return repository.listar();
    }
}
