package org.ngarcia.webapp.ear.services;

import jakarta.ejb.Local;
import org.ngarcia.webapp.ear.entities.Usuario;

import java.util.List;

@Local
public interface UsuarioService {
    List<Usuario> listar();
}
