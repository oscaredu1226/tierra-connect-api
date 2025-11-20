package com.upc.tierraconnect.service;

import com.upc.tierraconnect.model.Tecnico;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TecnicoService {

    private final List<Tecnico> tecnicos = List.of(
            new Tecnico(1, "Carlos Ramos", "Norte", "Riego"),
            new Tecnico(2, "Ana López", "Sur", "Sanidad"),
            new Tecnico(3, "Luis Fernández", "Centro", "Fertilización"),
            new Tecnico(4, "María Gómez", "Norte", "Sanidad")
    );

    public List<Tecnico> buscar(String zona, String especialidad) {
        return tecnicos.stream()
                .filter(t -> zona == null || t.getZona().equalsIgnoreCase(zona))
                .filter(t -> especialidad == null || t.getEspecialidad().equalsIgnoreCase(especialidad))
                .collect(Collectors.toList());
    }
}