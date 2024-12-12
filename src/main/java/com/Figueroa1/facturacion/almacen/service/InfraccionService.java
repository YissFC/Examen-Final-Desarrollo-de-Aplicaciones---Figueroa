package com.Figueroa1.facturacion.almacen.service;
import java.util.List;
import org.springframework.data.domain.Pageable;

import com.Figueroa1.facturacion.almacen.entity.Infraccion;

public interface InfraccionService {
    public List<Infraccion> findAll(Pageable page);
    public List<Infraccion> findAll();
    public List<Infraccion> findByNombre(String dni, Pageable page);
    public Infraccion findById(int id);
    public Infraccion save(Infraccion infraccion);
    public void delete(int id);
}
