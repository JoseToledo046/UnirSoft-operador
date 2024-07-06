package com.Operador.operador.Repositorio;

import com.Operador.operador.Entidad.Transaccion;
import com.Operador.operador.Entidad.TransaccionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TransaccionRepository extends JpaRepository<Transaccion, TransaccionId> {
    @Query("SELECT (MAX(c.id.traId)+1) FROM Transaccion c")
    Optional<Integer> findMaxTransId();
    List<Transaccion> findAllByUsuario_TuUserid(String user);
    List<Transaccion> findAllByTipoTransaccion_TtrId(String tipo);
}
