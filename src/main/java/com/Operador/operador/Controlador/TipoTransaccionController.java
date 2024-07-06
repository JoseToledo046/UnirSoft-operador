package com.Operador.operador.Controlador;

import com.Operador.operador.Entidad.TipoTransaccion;
import com.Operador.operador.Entidad.Transaccion;
import com.Operador.operador.Service.TipoTransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
public class TipoTransaccionController {

    @Autowired
    private TipoTransaccionService tipoTransaccionService;

    @GetMapping("/api/tipos")
    public List<TipoTransaccion> getAll() {
        return tipoTransaccionService.findAll();
    }

    @GetMapping("/api/tipos/{id}")
    public ResponseEntity<TipoTransaccion> getById(@PathVariable String id) {
        Optional<TipoTransaccion> tipoTransaccion = tipoTransaccionService.findById(id);
        return tipoTransaccion.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/api/tipos")
    public TipoTransaccion create(@RequestBody TipoTransaccion tipoTransaccion) {
        return tipoTransaccionService.save(tipoTransaccion);
    }

    @PutMapping("/api/tipos/{id}")
    public ResponseEntity<TipoTransaccion> update(@PathVariable String id, @RequestBody TipoTransaccion tipoTransaccion) {
        if (!tipoTransaccionService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        tipoTransaccion.setTtrId(id);
        return ResponseEntity.ok(tipoTransaccionService.save(tipoTransaccion));
    }

    @DeleteMapping("/api/tipos/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        if (!tipoTransaccionService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        tipoTransaccionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
