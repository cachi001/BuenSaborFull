package org.emiliano.elbuensaborback.service;

import org.emiliano.elbuensaborback.entity.UnidadMedida;
import org.emiliano.elbuensaborback.repository.UnidadMedidaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnidadMedidaService extends BaseServiceImpl<UnidadMedida, Long>{

    private final UnidadMedidaRepository unidadMedidaRepository;

    public UnidadMedidaService (UnidadMedidaRepository unidadMedidaRepository)
    {
        super(unidadMedidaRepository);
        this.unidadMedidaRepository = unidadMedidaRepository;
    }

    @Override
    public UnidadMedida save(UnidadMedida entity) {
        return super.save(entity);
    }

    @Override
    public UnidadMedida update(UnidadMedida entity, Long aLong) {
        return super.update(entity, aLong);
    }

    @Override
    public Optional<UnidadMedida> findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public List<UnidadMedida> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    public UnidadMedida findByDenominacion(String denominacion){
        UnidadMedida unidadMedida = unidadMedidaRepository.findByDenominacion(denominacion)
                .orElseThrow(() -> new RuntimeException("Unidad de Medida no encontrada"));
        return unidadMedida;
    }
}
