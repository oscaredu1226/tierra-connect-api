package com.upc.tierraconnect.controller;

import com.upc.tierraconnect.model.Tecnico;
import com.upc.tierraconnect.service.TecnicoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tecnicos")
public class TecnicoController {

    private final TecnicoService tecnicoService;

    public TecnicoController(TecnicoService tecnicoService) {
        this.tecnicoService = tecnicoService;
    }

    @GetMapping
    public List<Tecnico> obtenerTecnicos(
            @RequestParam(required = false) String zona,
            @RequestParam(required = false) String especialidad
    ) {
        return tecnicoService.buscar(zona, especialidad);
    }
}
