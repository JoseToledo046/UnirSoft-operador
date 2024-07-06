package com.Operador.operador.Entidad.model.response;

import lombok.*;

import java.util.List;
import java.util.Map;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PeliculaResponse {
    private List<Pelicula> peliculas;
    private Map<String, Object> aggs;
}
