package com.Operador.operador.Entidad.model.request;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransaccionRequest {
    private String userId;
    private List<Integer> movieIds;
    private String  type;
    private Date traFecfin;
}
