package com.Figueroa1.facturacion.almacen.converter;
import org.springframework.stereotype.Component;

import com.Figueroa1.facturacion.almacen.dto.InfraccionDto;
import com.Figueroa1.facturacion.almacen.entity.Infraccion;
@Component
public class InfraccionConverter extends AbstractConverter<Infraccion,InfraccionDto> { 
    @Override
    public InfraccionDto fromEntity(Infraccion entity) {
        if (entity == null) return null;

        return InfraccionDto.builder()
                .id(entity.getId())
                .dni(entity.getDni())
                .placa(entity.getPlaca())
                .descripcion(entity.getDescripcion())
                .infracción(entity.getInfracción())
                .fecha(entity.getFecha())
                .build();
    }

    @Override
    public Infraccion fromDTO(InfraccionDto dto) {
        if (dto == null) return null;

        return Infraccion.builder()
                .id(dto.getId())
                .dni(dto.getDni())
                .placa(dto.getPlaca())
                .descripcion(dto.getDescripcion())
                .infracción(dto.getInfracción())
                .fecha(dto.getFecha())
                .build();
    }

}
