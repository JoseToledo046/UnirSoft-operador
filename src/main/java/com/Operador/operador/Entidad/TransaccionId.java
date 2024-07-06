package com.Operador.operador.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransaccionId {
    @Column(name = "tra_id")
    private Integer traId;
    @Column(name = "tra_tipo")
    private String traTipo;
    @Column(name = "tra_user")
    private String traUser;
    @Column(name = "tra_film")

    private Integer traFilm;
    @Column(name = "tra_estado", columnDefinition = "char", length = 255)
    private String traEstado;
}
