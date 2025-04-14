package org.ngarcia.webapp.ear.repositories;

import org.ngarcia.webapp.ear.entities.Usuario;

import java.util.List;

public interface UsuarioRepository {

    List<Usuario> listar();
}
