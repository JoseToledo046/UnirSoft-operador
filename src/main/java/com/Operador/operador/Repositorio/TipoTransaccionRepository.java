package com.Operador.operador.Repositorio;

import com.Operador.operador.Entidad.TipoTransaccion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoTransaccionRepository extends JpaRepository<TipoTransaccion, String> {
    List<TipoTransaccion> findByTtrId(String ttrId);
}
