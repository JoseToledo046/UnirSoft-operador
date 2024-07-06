package com.Operador.operador.Entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "t_transaccion")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaccion {
    @EmbeddedId
    private TransaccionId id;

    @Column(name = "tra_fecini", columnDefinition = "DATETIME")
    private Date traFecini;
    @Column(name = "tra_fecfin", columnDefinition = "DATE")
    private Date traFecfin;

    @ManyToOne
    @MapsId("traTipo")
    @JoinColumn(name = "tra_tipo", columnDefinition = "char")
    private TipoTransaccion tipoTransaccion;

    @ManyToOne
    @MapsId("traUser")
    @JoinColumn(name = "tra_user")
    private Usuario usuario;

    @PrePersist
    protected void onCreate() {
        if (this.id.getTraFilm() == null) {
            this.id.setTraFilm(0);
        }
    }

}
