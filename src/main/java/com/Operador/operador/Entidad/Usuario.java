package com.Operador.operador.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Entity
@Table(name = "t_usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @Column(name = "tu_userid")
    private String tuUserid;
    @Column(name = "tu_mail")
    private String tuMail;
    @Column(name = "tu_uname")
    private String tuUname;
    @Column(name = "tu_upass")
    private String tuUpass;
    @Column(name = "tu_telefono")
    private String tuTelefono;
    @Column(name = "tu_direccion")
    private String tuDireccion;

    @JsonIgnore
    @OneToMany(mappedBy = "usuario")
    private Set<Transaccion> transacciones;

}

