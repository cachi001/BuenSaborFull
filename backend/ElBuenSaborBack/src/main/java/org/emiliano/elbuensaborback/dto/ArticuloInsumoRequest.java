package org.emiliano.elbuensaborback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticuloInsumoRequest {
    private String denominacion;
    private BigDecimal precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;
    private BigDecimal precioVenta;
    private List<ImagenArticuloRequest> imagenes;
    private UnidadMedidaRequest unidadMedida;
    private CategoriaRequest categoria;
}
