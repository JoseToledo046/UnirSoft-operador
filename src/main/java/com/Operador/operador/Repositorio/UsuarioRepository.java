package com.Operador.operador.Repositorio;

import com.Operador.operador.Entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    List<Usuario> findByTuUname(String tuUname);
}
