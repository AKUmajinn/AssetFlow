package pe.edu.cibertec.assetflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.assetflow.model.Usuario;
import pe.edu.cibertec.assetflow.service.UsuarioService;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:4200") // Esto está perfecto
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> listar() {
        return service.listarUsuarios();
    }

    @PostMapping
    public Usuario registrar(@RequestBody Usuario u) {
        return service.guardarUsuario(u);
    }

    // CORRECCIÓN 1: En el @PutMapping es buena práctica recibir el ID en la URL
    // para asegurar que estamos editando el registro correcto.
    @PutMapping("/{id}")
    public Usuario editar(@PathVariable Integer id, @RequestBody Usuario u) {
        // Nos aseguramos de que el objeto tenga el ID que viene en la ruta
        u.setId(id); 
        return service.guardarUsuario(u);
    }

    @GetMapping("/{id}")
    public Usuario buscarXId(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminarUsuario(id);
    }
}