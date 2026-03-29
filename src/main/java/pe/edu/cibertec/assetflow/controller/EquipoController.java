package pe.edu.cibertec.assetflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.assetflow.model.Equipo;
import pe.edu.cibertec.assetflow.service.EquipoService;
import java.util.List;

@RestController
@RequestMapping("/api/equipo")
@CrossOrigin(origins = "http://localhost:4200")
public class EquipoController {

    @Autowired
    private EquipoService service;

    @GetMapping
    public List<Equipo> listar() {
        return service.listarEquipos();
    }

    @PostMapping
    public Equipo registrar(@RequestBody Equipo e) {
        return service.registrarEquipo(e);
    }

    @GetMapping("/{id}")
    public Equipo buscarXId(@PathVariable Integer id) {
        return service.buscarEquipoXId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminarEquipo(id);
    }
}