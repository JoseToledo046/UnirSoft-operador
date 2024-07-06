package com.Operador.operador.facade;

import com.Operador.operador.Entidad.model.response.Pelicula;
import com.Operador.operador.Entidad.model.response.PeliculaResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component

@Slf4j
public class PeliculaFacade {
    @Value("${orderProduct.url}")
    private String orderProductUrl;


    @Autowired
    private  RestTemplate restTemplate;

    public Pelicula getProductDetails(Integer id) {
        try {
            String url = String.format(orderProductUrl+"?idFilm=%d", id);
            PeliculaResponse productResponse=restTemplate.getForObject(url, PeliculaResponse.class);
            return productResponse.getPeliculas().get(0);
        } catch (HttpClientErrorException e) {
            log.error("Client Error: {}, Product with ID {}", e.getStatusCode(), id);
            return null;
        }
    }
}
