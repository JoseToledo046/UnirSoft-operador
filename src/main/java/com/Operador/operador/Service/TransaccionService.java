package com.Operador.operador.Service;

import com.Operador.operador.Entidad.Transaccion;
import com.Operador.operador.Entidad.TransaccionId;
import com.Operador.operador.Repositorio.TipoTransaccionRepository;
import com.Operador.operador.Repositorio.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransaccionService {

    @Autowired
    private TransaccionRepository transaccionRepository;
    @Autowired
    private TipoTransaccionRepository transaccionRepositorio;
    public List<Transaccion> findAll() {
        return transaccionRepository.findAll();
    }
    public List<Transaccion> findAllByUser(String user) {
        return transaccionRepository.findAllByUsuario_TuUserid(user);
    }

    public List<Transaccion> findAllByTipo(String tipo) {
        return transaccionRepository.findAllByTipoTransaccion_TtrId(tipo);
    }
    public Optional<Transaccion> findById(TransaccionId id) {
        return transaccionRepository.findById(id);
    }

    public Transaccion save(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    public void deleteById(TransaccionId id) {
        transaccionRepository.deleteById(id);
    }


}
