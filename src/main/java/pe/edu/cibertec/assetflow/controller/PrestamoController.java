package pe.edu.cibertec.assetflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.assetflow.model.Prestamo;
import pe.edu.cibertec.assetflow.service.PrestamoService;
import java.util.List;

@RestController
@RequestMapping("/api/prestamo")
@CrossOrigin(origins = "http://localhost:4200")
public class PrestamoController {

    @Autowired
    private PrestamoService service;

    @GetMapping
    public List<Prestamo> listar() {
        return service.listarPrestamos();
    }
}